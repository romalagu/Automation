Feature: Get todo based on ID API

  @todo
  Scenario Outline: Verify get todo by id request with valid todo id
    When User sends  a GET todo request with "/todos/<Todo_id>"
    Then Status code of GetTodoById API should be <statusCode>
    And content type of GetTodoById API should be json
    And response should contain userid,id of the todo,title and completed parameters

    Examples:
      | Todo_id | statusCode |
      | 1       | 200        |
      | 2       | 200        |

  @todo
  Scenario Outline: Verify get todo by id request with invalid todo id
    When User sends  a GET todo request with "/todos/<Todo_id>"
    Then Status code of GetTodoById API should be <statusCode>
    And content type of GetTodoById API should be json
    And response should be empty object

    Examples:
      | Todo_id | statusCode |
      | 0       | 404        |
      | -1      | 404        |