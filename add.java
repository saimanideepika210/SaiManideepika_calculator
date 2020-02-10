import java.util.*;
class Add {
    void Add()
    {
        Scanner s=new Scanner(System.in);

        System.out.println("How many numbers do you want to add:");

        int n=s.nextInt();

        double arr[]=new double[n];

        System.out.println("Enter numbers:");

        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();

        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Addition of given numbers is:"+sum);
    }
}