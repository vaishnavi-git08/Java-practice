import java.util.Scanner;
public class calculator {
    public static void main (String[]args)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter first num:");
    int a=sc.nextInt();
     System.out.println("enter second num:");
    int b=sc.nextInt();
     System.out.println("enter operator (+, -, *, /,%):");
    char operator=sc.next().charAt(0);//for char input different syntax is there

    switch(operator){
        case'+':
        System.out.print("sum is"+(a+b));
        break;
        case'-':
        System.out.print("sub is"+(a-b));
        break;
        case'*':
        System.out.print("product is"+(a*b));
        break;
        case'/':
        if(b==0){
            System.out.print("division by zero is not possible");
        }
        else{
            System.out.print("division is"+(a/b));
        }
        break;
        case'%':
        if(b==0){   
            System.out.print("modulus by zero is not possible");
        }
        else{
            System.out.print("modulus is"+(a%b));
        }
        break;
        default:
        System.out.print("invalid operator");


    }

}    
}
