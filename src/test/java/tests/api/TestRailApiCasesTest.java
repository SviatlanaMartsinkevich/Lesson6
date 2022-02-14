package tests.api;

import enums.ProjectType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Cases;
import models.ProjectBuilder;
import models.Section;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class TestRailApiCasesTest extends baseEntity.BaseApiTest {

    int projectID;
    int caseID1;
    int caseID2;
    int sectionID;
    int suiteID;

    @Test
    public void addProjectTest() {
        ProjectBuilder project = ProjectBuilder.builder()
                .name("New project_1")
                .typeOfProject(ProjectType.SINGLE_SUITE_MODE)
                .build();

        projectID = given()
                .body(project, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_PROJECT)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void addSectionTest() {
        Section section = Section.builder()
                .name("Section_1")
                .description("New section")
                .build();

        Response response = given()
                .pathParam("project_id", projectID)
                .body(section, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_SECTION)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();

        sectionID = response.getBody().jsonPath().get("id");
        suiteID = response.getBody().jsonPath().get("suite_id");
    }

    @Test(dependsOnMethods = "addSectionTest")
    public void addCase1Test() {
        Cases expectedCase = Cases.builder()
                .title("New case_1")
                .sectionID(sectionID)
                .templateID(1)
                .typeID(2)
                .priorityID(1)
                .estimate("3m")
                .refs("somethings else")
                .build();

        caseID1 = given()
                .pathParam("section_id", sectionID)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.ADD_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test(dependsOnMethods = "addSectionTest")
    public void addCase2Test() {
        Cases expectedCase = Cases.builder()
                .title("New case_2")
                .sectionID(sectionID)
                .templateID(1)
                .typeID(2)
                .priorityID(1)
                .estimate("5m")
                .refs("somethings else")
                .build();

        caseID2 = given()
                .pathParam("section_id", sectionID)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.ADD_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void getCaseTest() {
        given()
                .pathParam("case_id", caseID1)
                .when()
                .get(Endpoints.GET_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(priority = 1)
    public void updateCaseTest() {
        Cases expectedCase = Cases.builder()
                .sectionID(sectionID)
                .title("update case")
                .templateID(1)
                .typeID(5)
                .priorityID(1)
                .estimate("4m")
                .milestoneID(0)
                .suiteID(3)
                .refs("somethings else")
                .build();

        Cases actualCase = given()
                .pathParam("case_id", caseID1)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.UPDATE_CASE)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Cases.class);

        Assert.assertEquals(actualCase, expectedCase);
    }

    @Test
    public void moveCasesToSectionTest() {
        Cases expectedCase = Cases.builder()
                .sectionID(sectionID)
                .suiteID(suiteID)
                .casesIDS(new int[]{caseID1, caseID2})
                .build();

        given()
                .pathParam("section_id", 1)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.MOVE_CASES_TO_SECTION)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(priority = 2)
    public void deleteCaseTest() {
        given()
                .pathParam("case_id", caseID1)
                .when()
                .post(Endpoints.DELETE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
