package POJO.Todo;

import com.google.gson.Gson;
import io.restassured.response.Response;

public class CreateTodoPojo {

    public void processResponse(String response){

        Gson gson = new Gson();
        Todo obj = gson.fromJson(response, Todo.class);
        System.out.println("Todo OBJECT : " + obj);
    }

}
