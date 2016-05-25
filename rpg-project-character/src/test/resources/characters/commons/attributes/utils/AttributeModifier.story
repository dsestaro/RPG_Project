Scenario:  Calculate correctly the modifier of an attribute bigger then 10
Given an attribute with value 18
When I get the modifier from 18
Then modifier should be 4

Scenario:  Calculate correctly the modifier of an attribute equals 10
Given an attribute with value 10
When I get the modifier from 10
Then modifier should be 0

Scenario:  Calculate correctly the modifier of an attribute smaller then 10
Given an attribute with value 5
When I get the modifier from 5
Then modifier should be -2