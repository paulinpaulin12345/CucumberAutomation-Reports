Feature: Purchase Dress In Automation Practice
Background: user logged In
Given user Launch The Application
When click SignIn Button And It Navigates To Login MyStore
And user Enter Email Address In Address Field
And user Enter Password In Password Field
Then user Click On Login Button And It Navigates To MyAccount Page
@Ad1
Scenario: Purchase In Women Page
When user Click On Women Button And It Navigates To Woman Page
And user Click On Image And It Navigates To FaddedShortSleeve Page
And user Click Add To Cart Button And It Shows Product Successfully Added To Cart
And user Click Proceed To CheckOutButton1 And It Navigates To OrderMyStore
And user Click Proceed To CheckOutButton2 And It Navigate OrderMyStore
And user Click On Proceed To CheckOutButton3 And It Navigate To OrderMyStore
And user Click CheckBoxButton In CheckBox Field
And user Click Proceed To CheckOutButton4 And It Navigates OrderMyStore
And user Click PayByCheck And It Navigate MyStore
And user Click I Confirm My Order Button And It Navigate To Order Confirmation
Then user Click SignOutButton And It Navigate LoginMyStore
@Ad2
Scenario: Purchase In Dress Page
When user Click On Women Button2 
And user Click On Image2
And user Click Add To Cart Button2 
And user Click Proceed To CheckOutButton3
And user Click Proceed To CheckOutButton4
And user Click On Proceed To Check5
And user Click CheckBox2
And user Click Proceed To Submit
And user Click PayByCheck2
And user Click I Confirm My Order Button2 
Then user Click SignOutButton2 

Scenario: Purchase In T-Shirt Page
When user Click On T-shirt3
And user Click On ShirtImage3
And user Click Add To Cart3
And user Click Proceed To ProceedButton3
And user Click Proceed To SignButton3
And user Click On Proceed To Summary3
And user Click CheckProcessoption
And user Click Proceed To Submit3
And user Click PayingCheq
And user Click conform
Then user Click LogOut
