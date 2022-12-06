package Labs;

import java.util.Random;
import java.util.Scanner;

public class employee{
	String fname;
	String lname;
	
	employee(String fn, String ln){
	
	fname = fn;
	lname=ln;
	

}
public static void main(String[] args) {
	employee A= new employee("Harshit","choudary");
	
	System.out.println("Enter the department from the following");
	String Dep[]= {"technical","admin","human resources","legal"};
	for (int i=0;i<Dep.length;i++) {
		System.out.println(Dep[i]);
	}
	
		Scanner in= new Scanner(System.in);
		String dep= in.nextLine();
	

		System.out.println("The email ID is:"+A.fname+A.lname+"@"+dep+".abc.com");
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String SC="!@#$%^&*<>?";

		String combination= upper+lower+num+SC;
		int len=9;

		char[] Hi= new char[len];
		Random r= new Random();{

		for(int i=0;i<len;i++) {
		Hi[i]=combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Generated password is "+new String(Hi));
		}
		
	
}


}
