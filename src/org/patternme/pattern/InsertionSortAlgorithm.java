package org.patternme.pattern;

public class InsertionSortAlgorithm implements SortingAlgorithmStrategy {

	@Override
	public void sort(int[] ar) {
        // 1 4 3 5 6 2

		for(int i=1; i<ar.length; i++){
			int key = ar[i];
			int j = i;
			while(j > 0 && (ar[j-1] >  key))
			{
				ar[j] = ar[j-1];
				j--;
		    }
			ar[j] = key;
		}
	}

	
}
