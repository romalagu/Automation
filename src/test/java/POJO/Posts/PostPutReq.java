package POJO.Posts;

import org.apache.commons.lang3.StringUtils;

public class PostPutReq {

    /*{
        "id": 1,
            "title": "foo",
            "body": "bar",
            "userId": 1
    }*/

        String title;
        String body;
        Integer userId;
        Integer id;

        public PostPutReq(){

        }

        public PostPutReq(Integer id,String title, String body, Integer userId){
            this.id=id;
            this.title=title;
            this.body=body;
            this.userId=userId;
        }


        @Override
        public String toString() {

            checkNullValues();
            return "Post{" +
                    " id=" + id +
                    ",title='" + title + '\'' +
                    ", body='" + body + '\'' +
                    ", userId=" + userId +
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
            PostPutReq that = (PostPutReq) obj;
            if (!this.id.equals(that.id)){
                System.out.println("Post id is not matching with expected Post id");
                return false;
            }
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




