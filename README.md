# The "Rock-Paper-Scissors" Game 
There is a console-based Java implementation of the “Rock – Scissors – Paper” game.

![This is an image](https://static.vecteezy.com/system/resources/thumbnails/000/693/121/small/paw-sign-of-rock-paper-scissors-game.png)

## Game Instructions: 
- Two-player game. The objective is to select a play (i.e [r]ock, [p]aper or [s]cissors) that defeats your opponent's play.
  - Rock smashes Scissors: Rock wins
  - Scissors cut Paper: Scissors wins
  - Paper wrap Rock: Paper wins

## Input and Output
The player enters one of the following options:
- `rock` or `r`
-  `paper` or `p`
-   `scissors` or `s`

The computer chooses **a random options**, then reveals the **winner**.

## Solution
| You  | Computer | Outcome |
| ---- | -------- | ------- | 
| rock |   rock   | Draw    |
| rock |   paper  | You lose|
| rock |  scissors| You win |
| paper|   paper  | Draw    |
| paper| scissors | You lose|
| paper|   rock   | You win |
|scissors|scissors| Draw    |
|scissors| paper  | You lose|
|scissors|   rock | You win |

We handle all these situations using a series of checks. 

## Source code
[Click here](https://github.com/joannatufkova/Softuni-Practical-Project-Rock-Paper-Scissors/blob/main/RockPaperScissors.java)

## Screenshots
![image](https://user-images.githubusercontent.com/50846039/192539367-c8ff3d48-e0df-4e5a-9127-de30b0cc3b14.png)

## Live Demo
You can play the game directly in your Web browser [here](https://replit.com/@joannatufkova/RockPaperScissors-Game-by-Joanna#.replit)



