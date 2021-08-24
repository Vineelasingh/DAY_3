package day_3;
import java.util.*;
public class Viva {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a[]=new int[20],n=1;
        double c=0;
        for(int i=0;n<=3;i++){
            a[i]=s.nextInt();
            if(a[i]>0 && a[i]%2==0){
                if(i==0){
                    c=c-1;
                }
                else {
                    c=c-0.5;
                }
            }
            else if(a[i]>0 && a[i]%2!=0){
               c=c+1;
               n+=1;
            }
            else if(a[i]<0){
                c=c-0.5;
                break;
            }
        }
        System.out.println(c);

	}

}
