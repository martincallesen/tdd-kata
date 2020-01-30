# The Roman number Kata

This [Kata](https://en.wikipedia.org/wiki/Kata_(programming)) is designed to help practice what a test of a pure 
function ought to look like. It is intentionally designed to start with a very easy, non-branching base case which 
slowly becomes addled with complexity as additional requirements are added that will require significant branching and 
eventually a pressure to compose additional units.

This Kata is designed to be used with BottomUp approach [[Detroit-school TDD]].

## Requirement 1

Convert Single Roman Numbers to Arabic number

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| I           | 1            |
| V           | 5            |
| X           | 10           |
| L           | 50           |
| C           | 100          |
| D           | 500          |
| M           | 1000         |

## Requirement 2

Convert Repeated Roman Numbers to Arabic number

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| II          | 2            |
| XX          | 20           |
| III         | 3            |


## Requirement 3

Convert Roman Numbers that can be replaced by another roman number should result in error

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| IIIII       | ERROR        |
| XXXXX       | ERROR        |
| DD          | ERROR        |


## Requirement 4

Convert Multiple Roman Numbers to Arabic number

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| XV          | 15           |
| CLX         | 160          |


## Requirement 5

Convert Multiple Roman Numbers With Subtractive Notation to Arabic number

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| IV          | 4            |
| IX          | 9            |
| XL          | 40           |
| XC          | 90           |
| CD          | 400          |
| CM          | 900          |

## Requirement 6

Convert larger Roman Numbers 

| RomanNumber | ArabicNumber |
| ----------- | ------------ | 
| MMMMCMXCIX  | 4999         |
