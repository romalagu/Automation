Feature: Update post API
  @Post
  Scenario:Verify Updating posts request
    When User sends a request with required parameters to update existing post
    Then post should get updated successfully
    And user should get updated details of a post


