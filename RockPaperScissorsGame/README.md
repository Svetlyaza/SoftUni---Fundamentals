# Rock - Paper - Scissors Game
# Project Goals:
It's just a rock,paper, scissors game... 
# Solution:
- It's pretty much self-explainatory if you see the code. I decided to create a menu instead of just running the game 
- I implemented a few methods so it's easier for repeatablity of the game
# How does it work?
Is just an infinite while loop that will only break if the user chooses to via the menu
- 1.Start game:
  It starts a method startGame()
  Inside of it we get the user input and get randomised pc choice via util.Random
  Inside the startGame() we have also printChoice() and determineWinner()
  After the method finishes, the loop ends and we return to the Menu

- 2.Stats:
  It's just a method that keeps track on how many player and pc wins are there as well as how many draws there were
  After it prints them out we end the loop and start again

- 3.Quit:
  It quits the game     
