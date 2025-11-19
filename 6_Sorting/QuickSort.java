//5
----------------------------------------QUICK SORT - PARTITION PART 1: 

0	1	2	3	4	5	6	7	8	9   //INDEX
5	2	9	3	8	4	0	1	6	7	//LIST

PIVOT INDEX 0:	5
LOW INDEX 1:	2
HIGH INDEX 9:	7

5	2	9(L)	3	8	4	0	1(H)	6	7 //SWAP

IS 2<5?	YES - INCREMENT
IS 9<5? NO	- GO TO HIGH //LOW = 9

IS 7>5? YES	- DECREMENT
IS 6>5? YES - DECREMENT
IS 1>5? NO 	- SWAP LOW & HIGH //HIGH = 1

5	2	1	3	8(L)	4	0(H)	9	6	7 //SWAP

5	2	1	3	0	4(H)	8(L)	9	6	7  //SWAP & RETURN PIVOT "EXCLUDE 5"

LOW ELEMENT: 8
HIGH ELEMENT:4
WHEN HIGH<LOW = SWAP HIGH W/ PIVOT 

*4	2	1	3	0	*5	8	9	6	7

4	2	1	3	0	8	9	6	7


----------------------------------------QUICK SORT - PARTITION PART 2.1
										//FIRST PART EQUAL OR LESS THAN PIVOT "5"

4	2	1	3	0(HL) // SWAP & RETURN PIVOT "EXCLUDE 4"

0	2(HL)	1	3	//SWAP & RETURN PIVOT"EXCLUDE 0"

2	1(H)	3(L)  //SWAP

1	2	3 

----------------------------------------QUICK SORT - PARTITION PART 2.2
										//SECOND PART GREATER THAN PIVOT "5"
										
8	9(L)	6	7(H) //SWAP

8	7	6(H)	9(L)  //RETURN PIVOT "EXCLUDE 8"

6	7	9

