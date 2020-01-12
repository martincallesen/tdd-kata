# The FizzBuzz Kata

This [Kata](https://en.wikipedia.org/wiki/Kata_(programming)) is designed to help practice what a test of a pure 
function ought to look like. It is intentionally designed to start with a very easy, non-branching base case which 
slowly becomes addled with complexity as additional requirements are added that will require significant branching and 
eventually a pressure to compose additional units.

This Kata is designed to be used with BottomUp approach [[Detroit-school TDD]].

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher 
decides he should make his class more "fun" by introducing a "game". He explains that he is going to point at each 
pupil in turn and ask them to say the next number in sequence, starting from one. The "fun" part is that if the number 
is divisible by three, you instead say "Fizz" and if it is divisible by five you say "Buzz". 
So now your maths teacher is pointing at all of your classmates in turn, and they happily shout "one!", "two!", "Fizz!",
 "four!", "Buzz!"… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your 
 mouth dries up, your palms become sweatier and sweatier until you finally manage to croak "Fizz!". 
 Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so 
you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for 
breaktime. Next maths lesson is on Thursday. Get coding!

# Task:
Write a program that in console prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number 
and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Requirement 1
When a number is divisible by 3 then Fizz should be printed
| Number | Prints |
| 3      | Fizz   |
| 6      | Fizz   |
| 9      | Fizz   |
| 12     | Fizz   |

## Requirement 2
When a number is divisible by 5 then Buzz should be printed
| Number | Prints |
| 5      | Buzz   |
| 10     | Buzz   |
| 20     | Buzz   |

## Requirement 3
When a number is divisible by 3 and 5 then Fizzbuzz should be printed
| Number | Prints     |
| 15     | FizzBuzz   |
| 30     | FizzBuzz   |
| 45     | FizzBuzz   |
| 60     | FizzBuzz   |

## Requirement 4
Only print numbers from 1 to 100
| Number | Prints     |
| 0      |            |
| 1      | 1          |
| 101    |            |

Sample output when all requirements is applied:
| Number | Prints    |
| 1     | 1          |
| 2     | 2          |
| 3     | Fizz       |
| 4     | 4          |
| 5     | Buzz       |
| 6     | Fizz       |
| 7     | 7          |
| 8     | 8          |
| 9     | Fizz       |
| 10    | Buzz       |
| 11    | 11         |
| 12    | Fizz       |
| 13    | 13         |
| 14    | 14         |
| 15    | FizzBuzz   |

... etc up to 100
