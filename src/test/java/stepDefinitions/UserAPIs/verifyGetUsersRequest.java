package stepDefinitions.UserAPIs;

import POJO.User.CreateUserPojo;
import POJO.User.UserMain;
import Utility.CommonFields;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import stepDefinitions.UtilitySteps;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.*;

public class verifyGetUsersRequest {

    Response response;
    List<String> jsonResponse;

    @When("^user sends a request to get user details")
    public void sendRequest() throws Exception {

        response = get(CommonFields.BASE_URL + CommonFields.getUserRequest);
        //System.out.println(response.asString());

    }

    @Then("^request should be successful")
    public void verifyResponseDetails() throws Exception {

        UtilitySteps.verifyStatusCode(response, 200);
        UtilitySteps.verifyContentType(response);


    }


    @Then("^user should get details of all users$")
    public void verifyResponseGetUsers() throws Exception {
        CreateUserPojo user = new CreateUserPojo();
        List<UserMain> userActualData = user.processResponse(response.asString());

        user.verifyResponseData(userActualData, readUsersExpectedData(CommonFields.userJsonFile));
    }


    public List<UserMain> readUsersExpectedData(String jsonFileNameToRead) {
        String jsonFilePath = System.getProperty("user.dir") + CommonFields.Path_TestData + jsonFileNameToRead;

        Gson gson = new Gson();

        BufferedReader bufferReader = null;

        try {
            bufferReader = new BufferedReader(new FileReader(jsonFilePath));

            Type userListType = new TypeToken<ArrayList<UserMain>>() {
            }.getType();

            List<UserMain> userExpectedData = gson.fromJson(bufferReader, userListType);

            return userExpectedData;

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + jsonFilePath);
        } finally {
            try {
                if (bufferReader != null) bufferReader.close();
            } catch (IOException ignore) {
            }
        }
    }
}






 /*   void verifyKeysExistence() {

        for (int i = 0; i < CommonFields.getUserAPIResponseKeys.length; i++) {
            response.then().body("[0]", hasKey(CommonFields.getUserAPIResponseKeys[i]));

            if (CommonFields.getUserAPIResponseKeys[i] == "ADDRESS_KEY") {
                for (int k = 0; k < CommonFields.getUserAPIAddressKeys.length; k++) {
                    response.then().body("address[0]", hasKey(CommonFields.getUserAPIAddressKeys[k]));

                    if (CommonFields.getUserAPIAddressKeys[k] == "GEO_KEY") {
                        response.then().body("geo[0]", hasKey(CommonFields.getUserAPIGeoKeys[k]));


                    }
                }
            }

            if (CommonFields.getUserAPIResponseKeys[i] == "COMPANY_KEY") {
                for (int j = 0; j < CommonFields.getUserAPICompanyKeys.length; j++) {
                    response.then().body("company[0]", hasKey(CommonFields.getUserAPICompanyKeys[j]));
                }
            }
        }
    }
 */

