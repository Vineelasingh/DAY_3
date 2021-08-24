package day_3;
import java.util.*;

public class Special_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int f,l,sum,product;
		f=num/10;
		l=num%10;
		sum=f+1;
		product=f*1;
		if((sum+product)==num)
		{
			System.out.println("Special number");
		}
		else
		{
			System.out.println("not a special number");
		}
	}

}
