package POJO.Todo;

import org.apache.commons.lang3.StringUtils;

public class Todo {

    /*{
        "userId": 1,
            "id": 1,
            "title": "delectus aut autem",
            "completed": false
    }*/

    Integer userId;
    Integer id;
    String title;
    Boolean completed;

    @Override
    public String toString() {
        checkNullValues();
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void checkNullValues() {
        if (StringUtils.isBlank(this.userId.toString())) {
            System.out.println("userId is null");
        }
        if (StringUtils.isBlank(this.id.toString())) {
            System.out.println("id is null");
        }
        if (StringUtils.isBlank(this.title)) {
            System.out.println("title is null");
        }
        if (StringUtils.isBlank(this.completed.toString())) {
            System.out.println("completed is null");
        }
    }
}
