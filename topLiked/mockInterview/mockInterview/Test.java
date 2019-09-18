package mockInterview;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class Test {

	String color;
	
	Test(String color){
		this.color = color;
	}
	public static void countDownA(int n) throws InterruptedException{
		
		if(n==0)
			return;
		
		System.out.println(n+".............A");
		Thread.sleep(1000);
		
		countDownA(n-1);
	}
	
	public static void countDownB(int n) throws InterruptedException{
		
		while(n>0){
			System.out.println(n+".............B");
			Thread.sleep(1000);
			
			n=n-1;
		}
		
		
	}
	
	public static void changeValue(int y){
		y=10;
		System.out.println(y);
	}
	
	public void changeColor(Test test){
		test.color = "black";
		System.out.println(test.color);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int x =5;
		
		changeValue(x);
		System.out.println(x);
		//countDownA(500000);countDownB(500000);
		
		Test test = new Test("white");
		
		test.changeColor(test);
		
		System.out.println(test.color);
	}

}
