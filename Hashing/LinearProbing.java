-----LinearProbing----

//only the keys are shown no values

	0	key:44
	1	
	2
	3
	4	key:4		
	5	key:16
	6	key:28
	7
	8
	9
	10	key:21
	
	
HERE N = 11 AND index"hash code" = key %"mod" N


------INSERT KEY 26-----

index = key % N
4	  = 26 mod 11

	0	key:44
	1	
	2
	3
	4	key:4	*	
	5	key:16	*
	6	key:28	*
->	7	key:26
	8
	9
	10	key:21