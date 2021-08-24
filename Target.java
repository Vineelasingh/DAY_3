package day_3;
import java.util.*;
public class Target {

	public static void main(String[] args) {
		int n,a,i=0,c=0,s=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do
		{
			c++;
			a=sc.nextInt();
			s+=a;
			i++;
		}
		while(s<n);
		System.out.println("the no of turns is :"+c);

	}

}
