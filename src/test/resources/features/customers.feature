Feature: Customer API Testing

  @ExampleTag
  Scenario Outline: Calling login API
    Given pokemon API is provided
    When user perform a "<method>" method on the "<endpoint>" endpoint
    Then user verify a "<statusCode>" status code
    Examples:
      | endpoint | method | statusCode |
      | /pokemon | GET    | 200        |
