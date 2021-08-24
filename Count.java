package day_3;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=1,j,sum=0,count=0,count1=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(i<=n){
			System.out.println("Enter the number");
		    j=sc.nextInt();
		    i++;
		    if(j>0) {
		    	count++;
		    }
		    else {
		    	count1++;
		    }
		}
		System.out.println("Number of positive numbers entered is "+count+" and the numberof negative numbers is "+count1);
		}


	}

