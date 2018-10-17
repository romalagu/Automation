Feature: Verification of get users list API
  User should be able to get list of all users in the application
  @User
  Scenario:Verify Get users request
    When user sends a request to get user details
    Then request should be successful
    And user should get details of all users




    #And reposnse should contains 10 records

#      | id | name          | username | email             |address| street      | suite    | city        | zipcode    |geo| lat      | lng     | phone                 | website       |company| cname           | catchPhrase                            | bs                          |
#      | 1  | Leanne Graham | Bret     | Sincere@april.biz |      | Kulas Light | Apt. 556 | Gwenborough | 92998-3874 |    |-37.3159 | 81.1496 | 1-770-736-8031 x56442 | hildegard.org |        | Romaguera-Crona | Multi-layered client-server neural-net | harness real-time e-markets |


