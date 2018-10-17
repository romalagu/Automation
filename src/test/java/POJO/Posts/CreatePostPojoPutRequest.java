package POJO.Posts;

import com.google.gson.Gson;

public class CreatePostPojoPutRequest {
    Gson gson ;

    public void processResponse(String response){
    PostPutReq postObj =  new PostPutReq(1,"foo","bar",1);
    gson = new Gson();
        PostPutReq responseObj = gson.fromJson(response, PostPutReq.class);
        System.out.println("POST OBJECT : " + responseObj);
        System.out.println("POST OBJECT created from code : " + postObj);

       if(postObj.equals(responseObj)==true){
        System.out.println("Response structure verified successfully");
    }else{
        System.out.println("Response structure error");
    }
}
}
