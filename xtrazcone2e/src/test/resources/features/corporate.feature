Feature:xtrazcone


  @na
Scenario Outline: login as corporate
Given User opens flipkart site
When User clicks on search
And enter text "<product name>"
Then User should be able to see desired results
Examples:
| product name    |
| redmi12c 4 64 |


