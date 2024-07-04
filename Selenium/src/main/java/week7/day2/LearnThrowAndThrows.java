package week7.day2;

import org.openqa.selenium.NoSuchElementException;

public class LearnThrowAndThrows {

	public static void main(String[] args) throws InterruptedException {

		int a=5;
		
		if(a<2) {
			System.out.println("pass");
		}else {
			throw new NoSuchElementException("a is not less than 2");
			//throw-is user define exception
		}
		//throws- is system define exception
		Thread.sleep(2000);
		
	}

}
