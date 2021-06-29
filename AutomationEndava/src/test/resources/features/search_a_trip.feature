#aguilar1100@gmail.com

Feature: The user search a trip on www.aa.com page correctly

  Scenario: The user search for a trip for two
    Given the user is on the main page
    When he search a trip from specific information
      | originCity | destinationCity | countPassengers | depart     | returnDate |
      | Bogota     | San Francisco   | 2               | 05/07/2021 | 10/07/2021 |
    And he selects the lowest price for both trips
    And he register his personal information
      | name  | secondName | lastName | frequentProgram | frequentNumber | dateComponent | gender | residencyCoutry | redressNumber | passportNumber | dateExpirationPass | nationality |
      | Jesus | Augusto    | Aguilar  | IB              | 52497          | 04/12/1990    | M      | DZ              | 5649598756236 | ECG6594        | 31/12/2022         | AI          |
    Then he should see the all information about the trip
