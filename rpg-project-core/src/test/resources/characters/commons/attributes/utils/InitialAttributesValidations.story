Scenario:  Validate the initial dif of two attributes specializations when both are smaller then 18 and 
the dif are no bigger then 4
Given the attributes 16 and 17
When comparing the attributes values
Then the result should be OK

Scenario:  Validate the initial dif of two attributes specializations when both are smaller then 18 and 
the dif are bigger then 4
Given the attributes 10 and 17
When comparing the attributes values
Then the result should be NOK

Scenario:  Validate the initial dif of two attributes specializations when both are bigger then 18 and 
there is no dif
Given the attributes 19 and 19
When comparing the attributes values
Then the result should be OK

Scenario:  Validate the initial dif of two attributes specializations when both are bigger then 18 and 
there is a dif
Given the attributes 19 and 20
When comparing the attributes values
Then the result should be NOK