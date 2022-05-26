## Requirements

- suppose you are a member of a crickect team 
- you are in a tournament and your team is going to play against another team
- as per the rules of the game, the captain of each side must go for a toss to decide which side will bat (or bowl) first
- if your team does not have a captain, you need to select someone as a captain first
  
  - at the same time, your team cannot have more than one captain
- your goal for this challenge is to use the singleton design pattern to ensure that your team only has one captain

1) You are required to use the Bill Pugh SIngleton Implementation approach to ensure only one captain is selected on your team 

    1.1 use an inner static helper class to create your captain
2) create a class that tests your implementation of the singleton design pattern
    
    2.1 call your getInstance() method multiple times to retrive objects
    2.2 see if the objects are the same by using the == operator in Java

