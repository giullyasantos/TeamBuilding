# TeamBuilding

## Problem Description: 
An instructor teaches two CS2 sections (section 1 and section 2). He is thinking to short list a group of
students for an upcoming contest. As part of the process, n number of candidates from each section has solved
several programming problems.
On the day of the selection, 2n candidates have come to the venue for short listing. He asked the students to
stand in 2 rows of same size. Exactly n students from each section. The candidates are numbered from 1 to n on
each row from left to right.

Now the instructor will choose the candidates from the rows with the following rules:
1. Candidates should be chosen from left to right.
2. Index of each chosen candidate (excluding the first one taken) will be greater than the index of the
previously chosen candidate.
3. In order to avoid giving preference of a specific section, he will choose the candidates in such a way that
no consecutive chosen candidates belong to the same section (aka row).
4. The first student can be chosen from all 2n students without any constraints.
5. The final resulting group can have any number of candidates.
6. In order to make a perfect group of students, he will choose the students in such a way, that the total
number of problems solved by the students will be the maximum.
So, solve this problem to find the group of students that will maximize the problems solved with all the given
constraints

## Input specification (Must be read from standard input (no file i/o))
The first line of the input contains a single integer n (1≤n≤100000) that represents the number of students in each row.
The second line of the input contains n integers p1,1,p1,2,...,p1,n,(1≤p1,i≤109), where p1,i is the number of problems solved by the ith student in the first row.
The third line of the input contains n integers p2,1,p2,2,...,p2,n,(1≤p2,i≤109), where p2,i is the number of problems solved by the ith student in the second row.
## The Output (standard console output):
Print one number — the maximum possible total problem solved by the selected group of students

## Test Strategy
Test Case 1: Testing with an evenly distributed set of problems across both rows.

Problem: Initial code iteration did not maximize the problem count.
Solution: Code was adjusted to improve row alternation and maximize problem solving.

Input: 
	5
	9 3 5 7 3
	5 8 1 4 5

Output: 29

Test Case 2:Testing with an uneven distribution of problem counts.
Problem: The algorithm initially chose suboptimal sequences.
Solution: Enhanced the selection logic to better manage uneven problem distributions.


Input: 
	3
	1 2 9
	10 1 1

Output: 19

Debugging involved strategic print statements to understand the flow and identify where the logic deviated from expected behavior, especially in scenarios with uneven distributions. The focus was to ensure adherence to selection rules while maximizing the total problem count.
