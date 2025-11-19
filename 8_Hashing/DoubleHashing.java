//3
-----THEORY----

	* use 1st hash function 
		"h"		index = key % N
	
	* if index taken 
		"h'"	index = N - key % N
		-> h + h'
		
		* if index taken 
			-> h + 2*h'
		
			* if index taken 
				-> h + 3*h'
				
				* ...
-----EXAMPLE-------

	h = k mod 11
	
	h' = 8 - k % 8
	
	0
	1	
	2
	3	
	4	
	5	
	6
	7
	8
	9
	10

---	Insert: key 12 ----
	h = 12 mod 11
	  = 1
	  
	0	
->	1	key:12
	2
	3	
	4	
	5	
	6
	7
	8
	9
	10
	
---	Insert: key 34 ----
	h = 34 mod 11
	  = 1
	**TAKEN
	h'= 8 - 34 mod 8
	  = 8 - 2
	  = 6
	  
	index = h + h'
	      = 7
	  
	0	
**	1	key:12
	2
	3	
	4	
	5	
	6	
->	7	key:34
	8
	9
	10