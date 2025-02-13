# Swiggy-like Food Delivery Application (Java)
## Overview:
  This is a simple food delivery application written in Java. Users can:

- View available restaurants based on location.
- Browse menus of selected restaurants.
- Place an order with OTP (One-Time Password) verification.
- Track the status of the order.

## Features:
- View Available Restaurants: Display restaurants based on the user's location.
- Browse Menu Items: Users can see restaurant menus, including item names, prices, and ratings.
- Order Placement: Users can select menu items and place an order.
- OTP Verification: An OTP is sent to the user's phone number to verify the order.

## Getting Started
### Prerequisites:

- Java 8 or later
-- IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor
Optional: java.net and javax.mail for OTP and email functionalities.
Installation:
Download or clone the repository to your local system.
Ensure you have JDK 8 or later installed.
Open the FoodDeliveryApp.java file in your preferred IDE or text editor.
Compile and run the FoodDeliveryApp.java file:

      javac FoodDeliveryApp.java
      java FoodDeliveryApp
### How to Use:
- View Available Restaurants:


1.Input your location or allow the app to fetch your current location (mocked for this example).
- A list of restaurants in the vicinity will be displayed.
2.Browse Menu:

- Choose a restaurant to view its menu, including items and prices.
3.Place an Order:

- Choose the menu items you want and proceed to checkout.
- Enter your contact details (phone number, address, etc.).
- An OTP will be generated and displayed for verification.
4.OTP Verification:

-4Enter the OTP that you received to confirm your order.
5.Track Order Status:

- Once verified, the status of your order will be updated in the system.
  
### Example Usage:


                                            Welcome to swiggy
                1.Buhari
                2.A2B
                3.Amma Hotel
        
        Select the hotel[1-3]  :1

                                Welcome to Bhurai

                select the menu
                          1.Mutton Briyani
                          2.Chicken Briyani
                          3.Chicken-65

          Enter your food(1-3)  :1
          The selected food is mutton biryani
          The price of mutton briyani is  320.0
          
          Enter the Quantity :2
            The total amount is 640.0
            Enter your total bill amount :640
            
                The available payment method is
                        1.G-pay
                        2.PhonePay
                        
                Enter your payment method :1
                         You are in G-pay
                         proceed your payment
                         
                          Enter the OTP:18577
                          Enter the otp  :18577
                           
            ---------------The order is successfull---------------
    
                        Thankyou for ordering in Buhari Hotels
                                               -Payment done by using 'G-pay'


## Contact Information:
If you have any feedback or questions, feel free to reach out to me!

- **Email**: [harishragavendra2305@gmail.com](mailto:harishragavendra2305@gmail.com)
- **LinkedIn**: [Harish Ragavendra](https://www.linkedin.com/in/harishragavendra23)

## Note:
- This is a basic prototype for educational purposes.
-OTP Generation: This implementation assumes OTP is displayed on the console for simplicity. In a real app, OTPs would be sent via SMS or email using services like Twilio or JavaMail API.

Enjoy using the Swiggy Portal
