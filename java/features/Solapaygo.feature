Feature: Test case for solapaygo

Scenario: Add product to cart
And verify HomePage
When click On Complete Package
And select D180 Package
And click Add To Cart
And verify Product D180 Added To Cart
And click On Continue Shop
And select M100 Package
And click Add To Cart
And verify Product M100 Added To Cart
And final Amount In Cart
Then proceed Check out