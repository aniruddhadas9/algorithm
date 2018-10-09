# CRLF: Carriage Return, Line Feed

This is kind of attach by pretending return/enter.

In this kind of attach normally attacker/hacker attacks the log file by manipulating the input string in the application.
It normally happens if you did not handle your return character it happens.


### Http response attach

#### JAVA code recommendation:

in the below code the username variable where the attacker manipulate
```
 logger.info("User logged in is " + username);

```
You can encode this line to prevent the CRLF  attack



