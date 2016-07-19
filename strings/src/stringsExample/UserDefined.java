package stringsExample;

import java.util.Scanner;

class AgeException extends Exception {
	AgeException() {
		super("Age Exception");
	}
}

public class UserDefined {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Name: "+name+"Age: "+age);
		}
		else{
			try{
				throw new AgeException();
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("bye :-)");
		}
		
	}
}