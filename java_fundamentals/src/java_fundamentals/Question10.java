package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z') {
			System.out.println(c+ "->" +Character.toUpperCase(c));
		}
		else if(c>='A' && c<='Z') {
			System.out.println(c+ "->" +Character.toLowerCase(c));
		}
		else {
			System.out.println("Invalid");
		}

	}

}
