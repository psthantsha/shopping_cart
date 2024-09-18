 Feature: Shopping online
   Scenario Outline: Place an order
     Given Login into the shopping cart "<Username>" "<Password>"
     Then Go to computers menu and select desktops
     And Choose your own cheap computer
     And Add it to cart
     Then Accept Ts and Cs then checkout

     Examples:
       | Username               | Password  |
       | jaymashifane@gmail.com | P@ssw0rd1 |