package tests.api;

import enums.ProjectType;
import io.restassured.mapper.ObjectMapperType;
import models.Milestone;
import models.ProjectBuilder;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestRailApiMilestonesTests extends baseEntity.BaseApiTest {
    int projectID;
    int milestoneID;

    @Test
    public void addProjectTest() {
        ProjectBuilder project = ProjectBuilder.builder()
                .name("WP_Project_04")
                .typeOfProject(ProjectType.SINGLE_SUITE_BASELINES)
                .build();

        projectID = given()
                .body(project, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(Endpoints.ADD_PROJECT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test(dependsOnMethods = "addProjectTest", priority = 0)
    public void addMilestoneTest() {

        Milestone milestone = Milestone.builder()
                .name("New milestone_01")
                .description("just milestone")
                .build();

        milestoneID = given()
                .pathParam("project_id", projectID)
                .body(milestone, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_MILESTONE)
                .then()
                .log().body()
                .body("name", is(milestone.getName()))
                .body("description", is(milestone.getDescription()))
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test(priority = 1)
    public void getMilestonesTest() {
        given()
                .pathParam("project_id", projectID)
                .when()
                .get(Endpoints.GET_MILESTONES)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(priority = 2)
    public void updateMilestoneTest() {
        Milestone milestoneUPD = Milestone.builder()
                .name("New milestone_02")
                .description("update milestone")
                .isCompleted(true)
                .startOn(20)
                .build();

        given()
                .pathParam("milestone_id", milestoneID)
                .body(milestoneUPD, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .log().body()
                .body("name", is(milestoneUPD.getName()))
                .body("description", equalTo(milestoneUPD.getDescription()))
                .body("is_completed", equalTo(milestoneUPD.isCompleted()))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(priority = 3)
    public void deleteMilestoneTest() {
        given()
                .pathParam("milestone_id", milestoneID)
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}


