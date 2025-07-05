package java_fundamentals;
import java.util.*;
public class Question4_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n>0&&m>0) {
			if(n%10==m%10) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			return;
		}

	}

}
