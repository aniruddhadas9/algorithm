# Authentication

The authentication happens when user signs.


### Difference between encoding and encryption

Normally engineers confused with encryption and encoding. Like base 64 encoding we do while creating a Basic auth token creation using user name and passwor.
That is not encryption.


#### Session based authentication


## two factor authentication


#### Session management:
If the user go ideal for some time, the seeion in the server should be destroyed to make the session secure.


#### Transport Layer Security (TSL)


#### common mistakes over HTTPS network:
Normally users think that only sensitive information pages to use HTTPS, however this is a mistake as non HTTPS pages can hold session information or any information attacker can use.
So engineers need to be very careful while implementing secure data or make every page HTTPS

#### Session cookies:

Make sure to set "secure" attribute while seeting cookies for the user. The secure attribute tells the browser not to transmit the cookies over non secure request


#### Cookie poisoning and session fixation

This happens when there is a session token in the browser and when user log in again, the browser sends the expired session token with the username nad password.
The attacker create a session id and send it to the server and spoof user identity.

So avoid this, invalidate the existing session and create a new one.


