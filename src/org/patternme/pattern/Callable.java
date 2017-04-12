package org.patternme.pattern;

public interface Callable<T> {
	
	public void onSuccess(T response);
	public void onFailure();

}
