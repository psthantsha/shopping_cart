import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CheckAPI {
    @Test
    public void getUserResponse() {
        Response response = RestAssured.given()
                .when().get("https://reqres.in/api/users/2")
                .then().log().body()
                .extract().response();

        JsonPath jsonPath = new JsonPath(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(jsonPath.getString("data.first_name"));
        System.out.println(jsonPath.getString("support.url"));
    }
}
