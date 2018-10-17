package POJO.Posts;

import org.apache.commons.lang3.StringUtils;

public class Post {

  /*  {
        "title": "foo",
            "body": "bar",
            "userId": 1,
            "id": 101
    }*/

    String title;
    String body;
    Integer userId;
    Integer id;

    public Post(){

    }

    public Post(String title, String body, Integer userId,Integer id){
        this.title=title;
        this.body=body;
        this.userId=userId;
        this.id=id;
    }

    //for request body object
    public Post(String title, String body, Integer userId){
        this.title=title;
        this.body=body;
        this.userId=userId;

    }

    @Override
    public String toString() {

        checkNullValues();
        return "Post{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void checkNullValues(){
        if (StringUtils.isBlank(this.title)) {
            System.out.println("Title is null");
        }
        if (StringUtils.isBlank(this.body)) {
            System.out.println("Body is null");
        }
        if (StringUtils.isBlank(this.userId.toString())) {
            System.out.println("UserId is null");
        }
        if (StringUtils.isBlank(this.id.toString())) {
            System.out.println("Post id is null");
        }

    }

    @Override
    public boolean equals(Object obj) {

        //if (this == obj) return true;
        if (obj == null){
            System.out.println("Obj is null");
            return false;
        }
        if (this.getClass() != obj.getClass()){
            System.out.println("Objects are of different class");
            return false;
        }
        Post that = (Post) obj;
        if (!this.title.equals(that.title)) {
            System.out.println("Title is not matching with expected title");
            return false;
        }
        if (!this.body.equals(that.body)){
            System.out.println("Body is not matching with expected body");
            return false;
        }
        if (!this.userId.equals(that.userId)){
            System.out.println("UserId is not matching with expected UserId");
            return false;
        }
        return true;
    }
    }

