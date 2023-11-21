Feature: Validate products screen
@smoke
Scenario: Sort the product size and select the minimum price
Given user enters valid username and valid password
|standard_user|secret_sauce|
Then click on sigin button
And user should be landed into products page
And Validate product page shows add to cart button
And find the product with minimum price and add to cart
Then validate product page shows shoppingCart button
And Click shopping cart button

@menu
Scenario: Validate About Menu
Given user enters valid username and valid password
|standard_user|secret_sauce|
Then click on sigin button
Then click on menu button
Then select about menu
Then return back to product page