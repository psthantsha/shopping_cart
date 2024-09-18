package stepsDefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

public class RestSteps {
    Response response;

    @Given("Get method endpoint")
    public Response getMethod() {
        response = RestAssured.given()
                .when().get("https://reqres.in/api/users/2")
                .then().log().body()
                .extract().response();
        return response;
    }

    @Then("Verify {string} status code is returned")
    public void verifyStatusCode(String responseStatus) {
        Integer status = Integer.valueOf(responseStatus);
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(),status);
    }

    @And("Verify {string} firstname is returned")
    public void verifyUserName(String name) {
        JsonPath jsonPath = new JsonPath(response.asString());
        Assert.assertTrue(jsonPath.getString("data.first_name").matches(name));
        System.out.println(jsonPath.getString("data.first_name"));
    }

    @And("Verify {string} url")
    public void verifyUrl(String url) {
        JsonPath jsonPath = new JsonPath(response.asString());
        Assert.assertTrue(jsonPath.getString("support.url").matches(url));
        System.out.println(jsonPath.getString("support.url"));
    }
}
