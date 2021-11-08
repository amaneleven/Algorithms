import java.util.Scanner;
public class solution{
    
  //Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
  
    public static void main(String [] args){
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        for(i=0;i<n;i++)
        {
        array[i]=sc.nextInt();
        sum=sum+array[i];
        }
        System.out.println(sum);
    }
    
}


//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
