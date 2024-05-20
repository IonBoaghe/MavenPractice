package utils;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;

public class Steps {
    @Step
    public static Response GET (String endPoint){
        Allure.addAttachment("URL", baseURI + endPoint);
        Response response =get(endPoint);
        Allure.addAttachment("Response body", response.body().prettyPrint());
        Allure.addAttachment("Status Code", String.valueOf(response.statusCode()));
        return response;

    }
    @Step
    public static void isStatusCodeValid(Response response, int expectedStatusCode){
        response.then().assertThat().statusCode(expectedStatusCode);
    }
    @Step
    public static Response POST(String body, String endpoint){

        Allure.addAttachment("URL",baseURI + endpoint);

        Allure.addAttachment("Request Body", body);

        Response response = given().body(body).post(endpoint);

        Allure.addAttachment("Status code", String.valueOf(response.statusCode()));

        Allure.addAttachment("Response body", response.body().prettyPrint());
        return response;
    }
    public static void isBodyContains(Response response, String actualData){
       // response.then().assertThat().body(fields)
    }
}
