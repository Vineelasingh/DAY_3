package day_3;
import java.util.*;
public class print_3 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<=b)
		{
			while(a<=b)
			{
				System.out.println(a);
				a++;
			}
		}
		else
		{
			while(a>=b)
			{
				System.out.println(a);
				a--;
				
			}
		}
		
	}

}
