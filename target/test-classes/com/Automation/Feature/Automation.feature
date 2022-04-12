Feature: Purchase Dress In Automation Practice
Scenario: Automation SignIn Page
Given: user Launch The Application
When click SignIn Button And It Navigates To Login MyStore
Scenario: Login Store Page
When user Enter Email Address In Address Field
And user Enter Password In Password Field
Then user Click On Login Button And It Navigates To MyAccount Page
Scenario: MyAccount Page
Then user Click On Women Button And It Navigates To Woman Page
Scenario: Women MyStore Page 
Then user Click On Image And It Navigates To FaddedShortSleeve Page
Scenario: FaddedShortSleeve Page
When user Click Add To Cart Button And It Shows Product Successfully Added To Cart
Then user Click Proceed To CheckOutButton1 And It Navigates To OrderMyStore
Scenario: OrderMyStore Page
Then user Click Proceed To CheckOutButton2 And It Navigate OrderMyStore
Scenario: OrderMyStore Page
Then user Click On Proceed To CheckOutButton3 And It Navigate To OrderMyStore
Scenario:  OrderMyStore Page
When user Click CheckBoxButton In CheckBox Field
Then user Click Proceed To CheckOutButton4 And It Navigates OrderMyStore
Scenario: OrderMyStore Page
Then user Click PayByCheck And It Navigate MyStore
Scenario: MyStore Page
Then user Click I Confirm My Order Button And It Navigate To Order Confirmation
Scenario: OrderConfirmation Page
Then user Click SignOutButton And It Navigate LoginMyStore
