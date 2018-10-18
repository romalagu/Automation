Feature: Add post API
  User should be able to add a new post.
  @Post
  Scenario:Verify Adding posts request
    When User sends a request with required parameters to add a new post
    Then new post should be added successfully
    And user should get details of added post



#    Then Status code of add post API should be 201
#    And Status message should be "HTTP/1.1 201 Created"