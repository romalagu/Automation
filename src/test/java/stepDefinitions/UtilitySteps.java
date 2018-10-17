package stepDefinitions;

import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UtilitySteps {


    public static void verifyStatusCode(Response response, int statusCode) throws Exception {

        response.then().assertThat().statusCode(statusCode);

    }

    public static void verifyContentType(Response response) throws Exception {

        response.then().assertThat().contentType(ContentType.JSON);

    }

}
