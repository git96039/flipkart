Feature:naukri


  @na
Scenario Outline: login
Given User fills the login details
When User fills emailid "<mailId>"
And fills the password "<Password>"
Then User should be able to login.
Examples:
| mailId            | Password  |
| lp.test@gmail.com | test |

