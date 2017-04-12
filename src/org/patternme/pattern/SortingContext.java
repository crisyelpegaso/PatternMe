package org.patternme.pattern;

public class SortingContext {

	private SortingAlgorithmStrategy sortingAlgorithm;
	
	public SortingContext(SortingAlgorithmStrategy strategy){
		this.sortingAlgorithm = strategy;
	}
	
	public void sortNumbers(int[] array){
		this.sortingAlgorithm.sort(array);
	}
}
