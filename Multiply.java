import java.util.*;
class Multiply{
    void Multiply(){
        
    System.out.println("Enter no.of operands:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    double a[]=new double[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++){
        a[i]=sc.nextDouble();
       
       
    }
    double mul=1;
    for(int j=0;j<n;j++){
        mul=mul*a[j];
    }
    System.out.println("multiplication of given numbers is:"+mul);
}}