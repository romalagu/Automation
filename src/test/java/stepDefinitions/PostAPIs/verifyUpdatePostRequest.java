package stepDefinitions.PostAPIs;

import POJO.Posts.CreatePostPojo;
import POJO.Posts.CreatePostPojoPutRequest;
import Utility.CommonFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import stepDefinitions.UtilitySteps;

import static io.restassured.RestAssured.given;

public class verifyUpdatePostRequest {

    Response response;

    @When("^User sends a request with required parameters to update existing post$")
    public void sendUpdatePostRequest() throws Exception {

        response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"id\": \"1\",\"title\": \"foo\" ,\"body\": \"bar\",\"userId\": \"1\"}")
                .when()
                .put(CommonFields.BASE_URL + CommonFields.updatePostRequest);
    }

    @Then("^post should get updated successfully$")
    public void verifyResponseDetails() throws Exception {
        UtilitySteps.verifyStatusCode(response,200);
        UtilitySteps.verifyContentType(response);
    }


    @Then("^user should get updated details of a post$")
    public void verifyResponse() throws Exception {

        System.out.println("Response Update post request:"+response.asString());
        CreatePostPojoPutRequest post = new CreatePostPojoPutRequest();
        post.processResponse(response.asString());

    }
}
