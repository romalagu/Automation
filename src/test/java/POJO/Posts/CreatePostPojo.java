package POJO.Posts;

import com.google.gson.Gson;

public class CreatePostPojo {

    Gson gson ;

    public void processResponse(String response){

        //Object for comparison with response object

        Post postObj =  new Post("test title","test body",1,-1);
        gson = new Gson();
        Post responseObj = gson.fromJson(response, Post.class);
        System.out.println("POST OBJECT : " + responseObj);
        System.out.println("POST OBJECT created from code : " + postObj);

       if(postObj.equals(responseObj)==true){
           System.out.println("Response structure verified successfully");
       }else{
           System.out.println("Response structure error");
       }
    }


}
