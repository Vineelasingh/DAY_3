package day_3;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter m");
			int m=sc.nextInt();
			System.out.println("Enter n");
			int n=sc.nextInt();
			int i=1;
			System.out.println("The multiplication of "+m+" table is");
			while(i<=n) {
				System.out.println(m+"*"+i+"="+m*i);
				i++;
			}

	}

}
