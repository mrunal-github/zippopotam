Feature: Get location information of a city using country and postal code

  Scenario: Get a successful response when sending a valid postal code and a valid country
    When user sends a GET request to the Endpoint with "<country>" and "<postcode>" they should receive successful response with valid status code 200


  Scenario Outline: Get a unsuccessful response when sending a invalid country and a valid postal code
    Given The user has access to the zippopotamus endpoint
    When  The user performs a GET request with a "<invalidCountry>" and "<postcode>"
    Then  The response status code should be 404

    Examples:
      | invalidCountry | postcode |
      | "us1"          | "90210"  |
      | "1us"          | "90210"  |
      | "uss"          | "90210"  |
      | "uus"          | "90210"  |
      | "hr."          | "10000"  |
      | ".at"          | "1010"   |
      | "aarr"         | "3500"   |
      | ""             | "3500"   |


  Scenario Outline: Get a unsuccessful response when sending a valid country and a invalid postalcode
    Given The user has access to the zippopotamus endpoint
    When  The user performs a GET request with a "<country>" and "<invalidPostalCode>"
    Then  The response status code should be 404

    Examples:
      | country | invalidPostalCode |
      | "us"    | "902100"          |
      | "at"    | "1011"            |
      | "us"    | "990210"          |
      | "us"    | "a902100"         |
      | "us"    | "900210"          |
      | "us"    | ".90210"          |
      | "hr"    | "10.000"          |
      | "ar"    | ""                |


  Scenario Outline: Get a unsuccessful response when sending a invalid postal code and a invalid country
    Given The user has access to the zippopotamus endpoint
    When  The user performs a GET request with a "<invalidCountry>" and  "<invalidPostalCode>"
    Then  The response status code should be 404

    Examples:
      | invalidCountry | invalidPostalCode |
      | "uus"          | "90210"           |
      | "hr"           | "3500"            |
      | "att "         | "1.010"           |
      | "ar"           | "35000"           |


