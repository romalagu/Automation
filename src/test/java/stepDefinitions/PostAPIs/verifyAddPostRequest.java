package stepDefinitions.PostAPIs;

import POJO.Posts.CreatePostPojo;
import POJO.Posts.Post;
import Utility.CommonFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import stepDefinitions.UtilitySteps;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class verifyAddPostRequest {

    Response response;

    @When("^User sends a request with required parameters to add a new post$")
    public void sendRequest() throws Exception {

        //"{\"title\": \"test title\" ,\"body\": \"test\",\"userId\": \"1\"}"
        Post requestBodyObject = new Post("test title","test body",1);

        response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBodyObject)
                .when()
                .post(CommonFields.BASE_URL + CommonFields.addPostRequest);
    }

    @Then("^new post should be added successfully$")
    public void verifyResponseDetails() throws Exception {

        UtilitySteps.verifyStatusCode(response,201);
        response.then().assertThat().statusLine("HTTP/1.1 201 Created");
        UtilitySteps.verifyContentType(response);

    }

    @Then("^user should get details of added post$")
    public void verifyResponseAddPost() throws Exception {

        System.out.println("Response Add Post request:"+response.asString());
        CreatePostPojo post = new CreatePostPojo();
        post.processResponse(response.asString());
    }

}
