package java_fundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0) {
			int sum=n%10;
			rev=rev*10+sum;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println(rev+" is a palindrome");
		}
		else {
			System.out.println(rev+" is not a palindrome");
		}
	}

}
