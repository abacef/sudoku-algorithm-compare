# sudoku-algorithm-compare

This project will help me see how two algorithms to solve a sudoku puzzle
computationally are different in complexity, time it takes me to code, 
and memory used.

## Algorithm 1: Backtracking

If you have been looking through my other projects on Github, you may notice
that I am intrigued with using backtracking to solve a sudoku puzzle. While
there are many ways to solve a sudoku puzzle, backtracking is a simple way
conceptually for a computer. Unfortunately, that is the only thing it has going
for it. Backtracking is a O(N!) problem which is worse then the benchmark
O(aN^b) polinomial time. Also, some humans would call it "brute force" that
does not take into consideration much of the natural unit of the puzzle itself.
the psudocode is as follows:


function backtrack:
    advance the current box to the next open box (reading left to right then top
                                                                      to bottom)
    if the last box has been validated:
        algorithim finished
    else:
        for each number from 1 to 9:
            put the number in the current box
            if the number does not appear in the current row, column or 3x3 box:
                it could be that box's correct number. call backtrack again.


## Algorithm 2: Human

This is the method I would use to solve a puzzle. Dont judge me if you would
use a better one, I just want to know if mine is better than backtracking
computationally.

Here are the non-psudocode steps

1. Search for the 3x3 box or row or column that has the most filled in boxes and is
                                                           not on the black list
2. Compute all of the possibilities for each empty box in that segment
3. If there is a box that only can contain 1 number, that number goes in that
                         box. go to step 2. If there are none, go to step 2
4. If there is a number that only shows up once in all the boxes, that number
                    must go in that box. go to step 2. If not, go to step 6.
6. put the current segment in the black list.
7. compute all possibilities for each segment again to see if anything has
        changed. if one segment has, remove it from the blacklist and, go to 
        step 3. If not, go to step 1.


## Algorithm 3: Semi-Human

This is a modified version of the Human algorithm. Because computers are good
and fast at comparing things, checking for things, and doing math, lets use that
to our advantage.

Here is a description:

Go through every box and compute its possibilities. After computing on a
specific box, check if it only has one possibility. If so, change it and keep
moving on. If the last box is reached, loop again. If nothing has been changed
on a certian iteration through all of the boxes, check each row to see if there
is a box that has a number in no other boxes in that row, and change it. Do that
for columns and 3x3 boxes too. Then go through the box loop again. Do this
untill the puzzle is solved.
