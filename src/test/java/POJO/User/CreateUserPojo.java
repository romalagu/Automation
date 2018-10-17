package POJO.User;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import cucumber.api.DataTable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CreateUserPojo {

    public List<UserMain> processResponse(String response) {

        Gson gson = new Gson();
        //UserMain[] obj = gson.fromJson(response, UserMain[].class);
        //System.out.println("OBJECT : " + obj);

        Type userListType = new TypeToken<ArrayList<UserMain>>() {
        }.getType();

        List<UserMain> userList = gson.fromJson(response, userListType);
        //System.out.println("OBJECT : " + userList);
        return userList;
    }

    String[] splitedData;

    public boolean verifyResponseData(List<UserMain> actualData, List<UserMain> expectedData) {
        if (actualData.isEmpty()) {
            return false;
        } else {

            for (int i = 0; i < expectedData.size(); i++) {

                for (int j = 0; j < actualData.size(); j++) {


                   // System.out.println(expectedData.get(i).id+" "+actualData.get(j).id);
                    if (expectedData.get(i).id.equals(actualData.get(j).id)) {

                        System.out.println("----------------------------------------------------------");
                        System.out.println("Actual:" + actualData.get(j));
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Expected:" + expectedData.get(i));

                        if (actualData.get(j).equals(expectedData.get(i))) {
                            System.out.println("Verified response data successfully.");
                            break;
                        }
                    }

                }

            }
            return true;
        }
    }

}

