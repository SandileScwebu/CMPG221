
mergeSort(list):
	firstHalf = mergeSort(firstHalf);
	secondHalf = mergeSort(secondHalf);
	list = merge(firstHalf, secondHalf);	