# **Bowling Game**

BowlingGame, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game.

 1. We will not check for valid rolls.
 2. We will not check for correct number of rolls and frames.
 3.We will not provide scores for intermediate frames.

## **Rules**

 1. Each game, or "line" of bowling, includes ten turns, or "frames" for the bowler.
 2. In each frame, the bowler gets up to two tries to knock down all the pins.
 3. If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
 4. If in two tries he knocks them all down, this is called a "spare" and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
 5. If on his first try in the frame he knocks down all the pins, this is called a "strike". His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
 6. If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
 7. The game score is the total of all frame scores.

## **Purpose**

Develop an application to calculate the score of one line of American Ten-Pin Bowling using Test Driven Development (TDD).

## **Tools used for developing this application**

 1. Backend : Java 11 & Spring Boot 2.7.5
 2. Build tool: Gradle 7.5.1

## **How to build the application**

 1. Clone this repository
 `https://github.com/sandiparthiharish/bowling-game.git`
 2. You can build the project and run the tests by running gradle clean build

## **How to run the application**
 1. By default, the application will start on port 8080. If you want the application to run on different port 8082, you can pass additional parameter --server.port=8082 while starting the application 
 2. Once successfully built, you can run the service by one of these commands:

    `java -jar build\libs\bowling-game-1.0.0-SNAPSHOT.jar

							(or)
							
	java -jar build\libs\bowling-game-1.0.0-SNAPSHOT.jar --server.port=8082`




