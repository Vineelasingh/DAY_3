package day_3;
import java.util.*;
public class Trendy {

	public static void main(String[] args) {
		int n,a,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=(n/10)%10;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		if(a%3==0 && count==3)
		{
			System.out.println("trendy number");
		}
		else
		{
			System.out.println("Not a trendy number");
		}
	}

}
