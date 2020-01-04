# The Bowling game Kata

This [Kata](https://en.wikipedia.org/wiki/Kata_(programming)) is designed to help practice what a test of a pure 
function ought to look like. It is intentionally designed to start with a very easy, non-branching base case which 
slowly becomes addled with complexity as additional requirements are added that will require significant branching and 
eventually a pressure to compose additional units.

This Kata is designed to be used with BottomUp approach [[Detroit-school TDD]].

Scoring example:

------| Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
Pins  | 1, 4     | 4, 5    |  6, 7    |  5, 5    |  10      |  0, 1    |  7, 3    |  6, 4    |  10      |  2, 8, 6  | 
Score | 5        | 14      |  29      |  49      |  60      |  61      |  77      |  97      |  117     |  133      | 

The game consists of 10 frames as shown above. In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.  So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame.  However no more than three balls can be rolled in
tenth frame.

If you want to manually test some games you can try https://www.bowlinggenius.com/

## Requirement 1

### Example Gutter Game:
given 20 rolls is scoring 0
when score is calculated, 
then score is 0

## Requirement 2

### Example All One:
given 20 rolls is scoring 1
when score is calculated, 
then score is 20

## Requirement 3

### Example One Spare:
given a roll scoring 5,
given a roll scoring 5, //Spare
given a roll scoring 3,
given 17 rolls is scoring 0,
when score is calculated, 
then score is 16

## Requirement 4

### Example One Strike:
given a roll scoring 10, //Strike
given a roll scoring 3, 
given a roll scoring 4,
given 16 rolls is scoring 0,
when score is calculated, 
then score is 24

## Requirement 5

### Example Two rolls in last turn:
given 9 rolls is scoring 10,
given a roll scoring 3, 
given a roll scoring 4,
when score is calculated, 
then score is 257

## Requirement 6

### Example One Spare in last turn:
given 9 rolls is scoring 10,
given a roll scoring 3, 
given a roll scoring 7,
given a roll scoring 3,
when score is calculated, 
then score is 266

## Requirement 7

### Example One Strike in last turn:
given 9 rolls is scoring 10,
given a roll scoring 10, 
given a roll scoring 3,
given a roll scoring 3,
when score is calculated, 
then score is 279

## Requirement 8

### Example Perfect game:
given 12 rolls is scoring 10,
when score is calculated, 
then score is 300
