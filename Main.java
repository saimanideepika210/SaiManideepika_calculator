import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Label:while("True"!=null) {
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide");
       
	    System.out.println("Enter your choice:");
     
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    Add add=new Add();
	    Subtract sub=new Subtract();
	    Multiply mul=new Multiply();
	    Divide div=new Divide();
        if(n==1) {
        	add.Add();
        }
        else if(n==2) {
        	sub.Subtract();
        }
        else if(n==3) {
        	mul.Multiply();
        }
        else if(n==4) {
        	div.Divide();
        }
        else {
        	System.out.println("Invalid option!!!!");
        	continue Label;
        }
        
    Label1:while("True"!=null) {    
	System.out.println("Do you want to continue(Y/N):"); 
    Scanner ch=new Scanner(System.in);
    char c=ch.next().charAt(0);
    
        if(c=='Y'||c=='y') {
        	continue Label;
        }
        else if(c=='N'||c=='n'){
        	break Label;
        }
        else if(c!='Y'&&c!='N'&&c!='y'&&c!='n') {
        	System.out.println("Wrong choice");
        	continue Label1;
        }
	}
		}
	}
}