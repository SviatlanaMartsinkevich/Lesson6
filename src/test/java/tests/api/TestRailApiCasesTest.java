package tests.api;

import enums.ProjectType;
import io.restassured.mapper.ObjectMapperType;
import models.Cases;
import models.ProjectBuilder;
import models.Section;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class TestRailApiCasesTest extends baseEntity.BaseApiTest {

    int projectID;
    int caseID;
    int sectionID;
//    int suiteID = 5;
    List<Integer> caseIDs = new ArrayList<>();

    @Test
    public void addProjectTest() {
        ProjectBuilder project = ProjectBuilder.builder()
                .name("New project_1")
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

    @Test(dependsOnMethods = "addProjectTest")
    public void addSectionTest() {
        Section section = Section.builder()
                .name("Section_1")
                .description("New section")
                .build();

        sectionID = given()
                .pathParam("project_id", projectID)
                .body(section, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(Endpoints.ADD_SECTION)
                .then()
                .log().body()
//                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void addCaseTest() {
        Cases expectedCase = Cases.builder()
                .title("New case_1")
                .sectionID(1)
                .templateID(1)
                .typeID(2)
                .priorityID(1)
                .estimate("3m")
                .refs("somethings else")
                .build();

        caseID = given()
                .pathParam("section_id", sectionID)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.ADD_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void getSectionTest() {
        given()
                .pathParam("section_id", sectionID)
                .when()
                .get(Endpoints.GET_SECTION)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(dependsOnMethods = "addCaseTest")
    public void getCaseTest() {
        given()
                .pathParam("case_id", caseID)
                .when()
                .get(Endpoints.GET_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test()
    public void getCasesTest() {
        given()
                .pathParam("project_id", projectID)
//                .pathParam( "suite_id", suiteID)
                .when()
                .get(Endpoints.GET_CASES)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(dependsOnMethods = "addCaseTest")
    public void updateCaseTest() {
        Cases expectedCase = Cases.builder()
                .sectionID(1)
                .title("update case")
                .templateID(1)
                .typeID(5)
                .priorityID(1)
                .estimate("5m")
                .milestoneID(0)
                .suiteID(3)
                .refs("somethings else")
                .build();

        Cases actualCase = given()
                .pathParam("case_id", caseID)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.UPDATE_CASE)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Cases.class);

        Assert.assertEquals(actualCase, expectedCase);
    }

    @Test
    public void  moveCasesToSectionTest() {
        Cases expectedCase = Cases.builder()
                .sectionID(1)
                .suiteID(1)
                .build();

        Cases actualCase = given()
                .pathParam("section_id", sectionID)
                .body(expectedCase, ObjectMapperType.GSON)
                .body(caseIDs)
                .post(Endpoints.MOVE_CASES_TO_SECTION)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Cases.class);

        Assert.assertEquals(actualCase, expectedCase);
    }

    public void addToGetCaseIDs() {
        caseIDs.add(caseID);
    }
}
