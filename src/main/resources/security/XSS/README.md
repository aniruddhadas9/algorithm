# XSS: Cross Site Scripting

This kind is attacking the web site rather attacking the web application rather attacking directly to the server application.
Like attacking by sending phising email containing milicious images, forms, button to click or open.

##### DOM base cross-Site Scripting



fixing

 - validating input
 - encoding data like url encoding, data encoding
 
 
 Fixing all this in the server is batter as 
 
 
### URL redirect or forwarding
This is also one of the important factor attacker uses.
 
 
 Exam:
 
 injection attacks: force
 injection can do: all
 XSS compermisies :
   forwarding session cookies, rewriteing page content, and even making arbitary requests
 placing a malicious script in applications database: Stored
 Redirects: 
   This is an HTTP response code in the range of 300-307, typacally 302
   send a user to a different domain entirely
   exposes sensitive pages within the same domain
 True about forwards
   deffer handling of requests and passes it on to another part of the application
   exposes sensitive pages within the application
 retreave the users cookies. What can attacker do with it: spoof the victims identity
 