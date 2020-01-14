# The Bowling game Kata

This [Kata](https://en.wikipedia.org/wiki/Kata_(programming)) is designed to help practice what a test of a pure 
function ought to look like. It is intentionally designed to start with a very easy, non-branching base case which 
slowly becomes addled with complexity as additional requirements are added that will require significant branching and 
eventually a pressure to compose additional units.

This Kata is designed to be used with BottomUp approach [[Detroit-school TDD]].

Scoring example:

| ------| Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 1, 4     | 4, 5    |  6, 1    |  5, 5    |  10      |  0, 1    |  7, 3    |  4, 6    |  10      |  2, 8, 6  | 
| Score | 5        | 14      |  21      |  41      |  52      |  53      |  67      |  87      |  107     |  123      | 

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

### All rolls goes to the gutter:

| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 0, 0     | 0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0     | 
| Score | 0        | 0       |  0       |  0       |  0       |  0       |  0       |  0       |  0       |  0        | 

## Requirement 2

### All rolls knocks down 1 pin:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 1, 1     | 1, 1    |  1, 1    |  1, 1    |  1, 1    |  1, 1    |  1, 1    |  1, 1    |  1, 1    |  1, 1     | 
| Score | 2        | 4       |  6       |  8       |  10      |  12      |  14      |  16      |  18      |  20       | 

## Requirement 3

### Round 1 has One Spare and Round 2 knocks down 3 pins and the rest is zero:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 5, 5     | 3,0     |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0     | 
| Score | 13       | 16      |  16       |  16     |  16      |  16      |  16      |  16      |  16      |  16       | 

## Requirement 4

### Round 1 has One Strike and Round 2 knocks down 3 pins + 4 pins and the rest is zero:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 10       | 3,4     |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0    |  0, 0     | 
| Score | 17       | 24      |  24      |  24      |  24      |  24      |  24      |  24      |  24      |  24       | 

## Requirement 5

### Example Two rolls in last turn:
### Round 1 to Round 9 has One Strike and Round 10 knocks down 3 pins + 4 pins:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 10       | 10      |  10      |  10      |  10      |  10      |  10      |  10      |  10      |  3, 4     | 
| Score | 30       | 60      |  90      |  120     |  150     |  180     |  210     |  240     |  250     |  257      | 

## Requirement 6

### Round 1 to Round 9 has One Strike and Round 10 knocks down spare and 3 pins:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 10       | 10      |  10      |  10      |  10      |  10      |  10      |  10      |  10      |  3, 7, 3  | 
| Score | 30       | 60      |  90      |  120     |  150     |  180     |  210     |  233     |  253     |  266      | 

## Requirement 7

### Round 1 to Round 9 has One Strike and Round 10 knocks down strike, 3 pins and then 3 pins:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10 | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------  | 
| Pins  | 10       | 10      |  10      |  10      |  10      |  10      |  10      |  10      |  10      |  10, 3, 3 | 
| Score | 30       | 60      |  90      |  120     |  150     |  180     |  210     |  233     |  263     |  279      | 

## Requirement 8

### Perfect game:
| ----- | Round 1  | Round 2 |  Round 3 |  Round 4 |  Round 5 |  Round 6 |  Round 7 |  Round 8 |  Round 9 |  Round 10   | 
| ----- | -------- | ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  ------- |  -------    | 
| Pins  | 10       | 10      |  10      |  10      |  10      |  10      |  10      |  10      |  10      |  10, 10, 10 | 
| Score | 30       | 60      |  90      |  120     |  150     |  180     |  210     |  240     |  270     |  300        | 
