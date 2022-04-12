//https://pl.kotl.in/2nPi3FRn2

//1. Create a function to find the biggest number in a array of Int with any lenght. 

fun biggestNumber(array: Array<Int>): Int{
	var biggest: Int
	biggest = array[0]
    for (i in 0..array.size-1){
        if (array[i] > biggest) biggest = array[i]
    }
	return biggest
}

//2. Create a function to sort ascending or descending a array

fun sortArrayAscending(array : Array<Int>): Array<Int> {
	var swap: Int
	var cont: Int
	if(array.size > 1) {
    	do{
        	cont = 0
        	for (i in 0..array.size-1){
            	if (i < array.size-1){
                	if(array[i]<=array[i+1]) continue 
                	else{
                    	swap = array[i+1]
                    	array[i+1] = array[i]
                    	array[i] = swap
                    	++cont
                    	}
                	}
            	else break
            	}
        	}while (cont > 0)
    	}
	else return array
	return array
}

fun sortArrayDescending(array : Array<Int>): Array<Int> {
	var swap: Int
	var cont: Int
	if(array.size > 1) {
    	do{
        	cont = 0
        	for (i in 0..array.size-1){
            	if (i < array.size-1){
                	if(array[i]>=array[i+1]) continue 
                	else{
                    	swap = array[i+1]
                    	array[i+1] = array[i]
                    	array[i] = swap
                    	++cont
                    	}
                	}
            	else break
            	}
        	}while (cont > 0)
    	}
	else return array
	return array
}
