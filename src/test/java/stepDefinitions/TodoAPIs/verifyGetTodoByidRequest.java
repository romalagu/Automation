package stepDefinitions.TodoAPIs;

import POJO.Todo.CreateTodoPojo;
import POJO.User.CreateUserPojo;
import Utility.CommonFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import stepDefinitions.UtilitySteps;

import static io.restassured.RestAssured.get;

public class verifyGetTodoByidRequest {

    Response response;

    @When("User sends  a GET todo request with \"([^\"]*)\"$")
    public void sendRequest(String request) throws Exception {

        System.out.println("Get todo by id request:"+CommonFields.BASE_URL + request);
        response = get(CommonFields.BASE_URL + request);
        System.out.println("Get todo by id response:"+response.asString());

    }

    @Then("^Status code of GetTodoById API should be (\\d+)$")
    public void verifyStatusCodeGetTodoById(int statusCode) throws Exception {
        UtilitySteps.verifyStatusCode(response,statusCode);
    }
    @Then("^content type of GetTodoById API should be json$")
    public void verifyContentTypeGetTodoById() throws Exception {
        UtilitySteps.verifyContentType(response);
    }

    @Then("^response should contain userid,id of the todo,title and completed parameters$")
    public void verifyResponseForValidTodoId() throws Exception {
        CreateTodoPojo todo = new CreateTodoPojo();
        todo.processResponse(response.asString());
    }

    @Then("^response should be empty object$")
    public void verifyResponseForInvalidTodoId() throws Exception {
        response.then().assertThat().body("isEmpty()", Matchers.is(true));
    }

}
