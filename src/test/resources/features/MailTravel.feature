Feature: Search
@travel1
Scenario: Verify Search 
Given I am in HomePage
When  I  search for text
And I  click on more info
Then It should display days price and telephone number
When I click on iteneary
Then It should display some info for all the days in itenary

@travel2
Scenario: Calender and passenger
Given I am in HomePage
When I search for India and click on book online 
Then The date should select to default value
And  I click on transport 
Then The departure date should set to default values and last value
When I select the standrad room and continue
And  I click on continue with default extras
When I fill in passenger details
|adulttitle1|Mr   |
|firstname1 |Ravi |
|lastname1  |Gugloth|
|dobday1    |15     |
|dobmonth1  |January|
|dobyear1   |1990   |
|adulttitle2|Mr     |
|firstname2 |Ravindra |
|lastname2  |Gugloth  |
|dobday2    | 20     |
|dobmonth2  |March   |
|dobyear2   |1995    |
|phonenumber|0745888888|
|email      |ravi@gmail.com|
|address1   |126 Manor House|
|address2   |White street|
|city       |London     |
|postcode   |IG7 5NP     |
|promocode  |6666|

@Signup
Scenario: Verify signup
Given I am in HomePage
When I click on Sign Up to our NewsLetter
And I enter valid credentials
|Title|Mr|
|FirstName|Raj|
|LastName|Kumar|
|EmailAddress|Rajkumar@gmail.com|
|PostCode|IG26BX|
|Phone|0755874558|
And I click Terms and conditions checkbox
And click signup button
Then I should see signed up for confirmation

