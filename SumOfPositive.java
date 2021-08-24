package day_3;
import java.util.*;
public class SumOfPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a,i=1,sum=0,count=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("Enter the Number");
			a=sc.nextInt();
			i++;
			if(a>=0) {
				count++;
				sum=sum+a;
			}
		}
		
		System.out.println("No of +ve  no's entered is"+count+"and the sum is"+sum);
	}

	}


