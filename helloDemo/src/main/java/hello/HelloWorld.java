/**
 * 
 */
package hello;

import org.joda.time.LocalTime;

/**
 * @author hp
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalTime currentTime = new LocalTime();
		
		System.out.println("The current local time is = " + currentTime);
		
		Greeter greeter = new Greeter();
		
		System.out.println(greeter.sayHello());

	}

}
