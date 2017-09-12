package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util;

/**
 * Encapsulates of concept of some object matching a pattern.<br>
 * 
 * Implementing, concrete classes are used to decide whether a given object
 * matches a pattern. More theoretically this class represents a generic predicate.
 * 
 * 
 * @author TeM, JS
 * 
 * @ProgrammingProblem.Category abstract generic class
 * @ProgrammingProblem.Introduced ExerciseSheet05
 * 
 */
public abstract class MyMatcher<T> extends Object{

	/**
	 * Matches a object against the pattern of this matcher.<br>
	 * 
	 * @param t the object to match
	 * @return whether t matches the pattern of this matcher. 
	 */
	public abstract boolean matches(T t);

	/**
	 * Creates a Matcher object with a specified pattern.<br>
	 * 
	 * @param pat the pattern of this matcher
	 */
	public MyMatcher(String pat) {
		setPattern(pat);
	}

	/**
	 * Sets the pattern of this matcher.<br>
	 * 
	 * 
	 * @param pat the pattern to set
	 */
	public abstract void setPattern(String pat);

	
	/**
	 * Gets the pattern of this matcher.<br>
	 * 
	 * The pattern is returned in a format that is considered valid in setPAttern.
	 * 
	 * @return the pattern
	 */
	public abstract String getPattern();

}
