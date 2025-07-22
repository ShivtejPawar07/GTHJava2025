/*Q50. There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity
of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
Input Format
• 	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
• 	Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.
• 	Output Format
• 	For each test case, output Yes if it will be possible for all the NN friends to register for the course. Otherwise output No.
• 	You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).
 
Constraints
1<=N<=M <=100
0<=K<=M
Sample1
Input         	Output
 
2 	50       	27       	Yes
5 	40       	38       	NO
100 100   	0         	Yes
 
Explanation:
Test Case 1: The 22 friends can enroll in the course as it has enough seats to accommodate them and the 27 other students at the same time.
 
Test Case 2: The course does not have enough seats to accommodate the 55 friends and the 3838 other students at the same time.
*/