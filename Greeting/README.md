# The Greeting Kata

This [Kata](https://en.wikipedia.org/wiki/Kata_(programming)) is designed to help practice what a test of a pure 
function ought to look like. It is intentionally designed to start with a very easy, non-branching base case which 
slowly becomes addled with complexity as additional requirements are added that will require significant branching and 
eventually a pressure to compose additional units.

This Kata is designed to be used with BottomUp approach [[Detroit-school TDD]].

## Requirement 1
Write a method `greet(name)` that interpolates `name` in a simple greeting.

| Name  | Greeting   | 
| ----- | --------   | 
| Bob  | Hello, Bob. | 

## Requirement 2
Handle nulls by introducing a stand-in. 

| Name  | Greeting          | 
| ----- | --------          | 
| null  | Hello, my friend. | 

## Requirement 3

Handle shouting. When `name` is all uppercase, then the method should shout back to the user.

| Name  | Greeting          | 
| ----- | --------          | 
| JERRY | HELLO JERRY!      | 

## Requirement 4

Handle two names of input. When `name` is an array of two names (or, in languages that support it, varargs or a splat), then both names should be printed. 

| Name             | Greeting              | 
| ---------------- | --------------------- | 
| ["Jill", "Jane"] | Hello, Jill and Jane. | 

## Requirement 5

Handle an arbitrary number of names as input. When `name` represents more than two names, separate them with commas and close with an Oxford comma and "and".

| Name                          | Greeting                          | 
| ----------------------------- | --------------------------------- | 
| ["Amy", "Brian", "Charlotte"] | Hello, Amy, Brian, and Charlotte. | 

## Requirement 6

Allow mixing of normal and shouted names by separating the response into two greetings.

| Name                          | Greeting                                   | 
| ----------------------------- | ------------------------------------------ | 
| ["Amy", "BRIAN", "Charlotte"] | Hello, Amy and Charlotte. AND HELLO BRIAN! | 

## Requirement 7

If any entries in `name` are a string containing a comma, split it as its own input. 

| Name                       | Greeting                         | 
| -------------------------- | -------------------------------- | 
| ["Bob", "Charlie, Dianne"] | Hello, Bob, Charlie, and Dianne. | 

## Requirement 8

Allow the input to escape intentional commas introduced by Requirement 7. These can be escaped in the same manner that CSV is, with double quotes surrounding the entry.

| Name                           | Greeting                         | 
| ------------------------------ | -------------------------------- | 
| ["Bob", "\"Charlie, Dianne\""] | Hello, Bob and Charlie, Dianne.  | 
