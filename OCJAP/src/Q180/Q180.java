package Q180;

import java.util.ArrayList;

public class Q180 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) { //무한반복
				myList.add("My String"); //runtime error를 던진다. OutOfMemoryError
			}
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
}