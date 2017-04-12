package org.patternme.pattern;

public class MergeSortAlgorithm implements SortingAlgorithmStrategy {
	
	@Override
	public void sort(int[] array) {
		System.out.println("Using MergeSort");
		mergeSort(array);
		
	}
	
    private static void mergeSort(int[] arr){
        if (arr.length <=1) {
            return;
        }
        
        int[] first = new int[arr.length /2];
        int[] second = new int[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);
        
        mergeSort(first);
        mergeSort(second);
        merge(arr, first, second);
        
    }
    
	private static void merge(int[] a, int[] first, int[] second){
	       int iFirst = 0,i = 0, iSecond =0;
	        while ( i < first.length + second.length) {
	            if ((iFirst < first.length) && (iSecond<second.length)) {
	                if (first[iFirst] < second[iSecond]) {
	                    a[i] = first[iFirst++];
	                    i++;
	                }
	                else {
	                    a[i] = second[iSecond++];
	                    i++;
	                    //swaps++;
	                }
	            }
	            else {
	                if (iFirst >= first.length) {
	                    while (iSecond < second.length) {
	                        a[i] = second[iSecond++];
	                        i++;
	                    }
	                }
	                if (iSecond >= second.length) {
	                    while (iFirst < first.length) {
	                        a[i] = first[iFirst++];
	                        i++;
	                    }
	                }
	            }
	        }
	        //return a;


	        //printArray(a);
		
	}
}
