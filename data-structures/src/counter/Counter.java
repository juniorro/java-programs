package counter;

/**
 * Array Data Structures.
 *
 * A sample of a counter class
 *
 * This is part of a series of learning core Java.
 *
 * @author Roland Junior Toussaint
 * @version 1.0
 */
public class Counter {
	private int count;

	// a simple integer instance variable
	public Counter() {
	}

	// default constructor (count is 0)
	public Counter(int initial) {
		count = initial;
	}

	// an alternate constructor
	public int getCount() {
		return count;
	}

	// an accessor method
	public void increment() {
		count++;
		System.out.println(count);
	}

	// an update method
	public void increment(int delta) {
		count += delta;
		System.out.println(count);
	}

	// an update method
	public void reset() {
		count = 0;
		System.out.println(count);
	}
}