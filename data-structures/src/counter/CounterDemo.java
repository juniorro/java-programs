package counter;

public class CounterDemo {
	
	public enum Day { MON, TUE, WED, THU, FRI, SAT, SUN };

	public static void main(String[] args) {

		// declares a variable; no counter yet constructed
		Counter c;

		// constructs a counter; assigns its reference to c
		c = new Counter();
		//c = null;

		// increases its value by one
		c.increment();

		// increases its value by three more
		c.increment(3);

		// will be 4
		int temp = c.getCount();

		// value becomes 0
		c.reset();

		// declares and constructs a counter having value 5
		Counter d = new Counter(5);

		// value becomes 6
		d.increment();

		Counter e = d;

		temp = e.getCount();

		// value of e (also known as d) becomes 8
		e.increment(2);
		
		Day today;
		
		today = Day.SAT;
		
		System.out.println(today);
		
	}
}