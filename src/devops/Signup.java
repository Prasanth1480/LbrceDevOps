package devops;
import java.util.*;
import java.lang.*;

public class Signup {
	public static void main(String args[]) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter mail: ");
	String mail,pass;
	mail=sc.nextLine();
	System.out.print("Enter Password: ");
	pass=sc.nextLine();
	System.out.println("User name and PAssword are: " +mail +" " +pass);
	}

}
