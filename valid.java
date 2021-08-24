package day_3;
import java.util.*;
public class valid {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,c=-1;
        do{
            a=s.nextInt();
            c++;
        }while(a%8==0);
        System.out.println(c);
	}
}
