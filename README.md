This Project is  coded in Java using Object Oriented Approach.

In order to run this Project, please run the file BowlingGame.java (run as Java Application).
Also please include other files in the same folder in which you keep BowlingGame.java  .



The Rules of the Game  are as follows-
This game has 10 Frames. Each Frame consists of 2 Rolls
STRIKE is represented by 'X' and SPARE is represented by '/' 
If it is neither STRIKE nor SPARE,then the score of the frame is the total number of pins knocked down in 2 Rolls
In case of STRIKE(10 pins knocked in first roll), your Frame ends there.
In case of a STRIKE , you get the score for the next two hits also
In case of a SPARE(Sum of pins knocked in two rolls is 10),you get the score for the next  hit also
In the last Frame ,if you get a STRIKE, you get an extra Roll
The Scores get added up cumulatively.That means that the score of current frame equals the score of current Frame plus the score of the Previous Frame 



For every roll , the input (the number of pins knocked down) is taken from the user.
In real life, this input is fed by the controller by for this project we are accepting the input from the user.
Also it is assumed that the user gives validated input , as in actual scenario, the input will be correct (fed by controller).


THE SCORE IS DYNAMICALLY UPDATED AND DISPLAYED AFTER EVERY FRAME.
Until the total score of SPARE or a STRIKE is not calculated , it is not added to the total(Cumulative) score.
And until the total score is calculated ,the individual score is represented by X or /   .

For the sake of clarity and understanding , this code shows both the individual as well the total score after each frame.