import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice/n 1) ADD/n 2) SUBTRACT/n 3) MULTIPLY/n 4) DIVISION/n");
        int choice = sc.nextInt();
        System.out.println("Enter the numbers:-  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //switch case
        switch(choice)
        {
            case 1: int sum = a + b;
                    System.out.println("Sum is :- " + sum);
                    break;
            case 2: int sub = a - b;
                    System.out.println("Subtracted value is :- " + sub);
                    break;
            case 3: int m = a * b;
                    System.out.println("Product is :- " + m);
                    break;
            case 4: int div = a / b;
                    System.out.println("Quotient is :- " + div);
                    break;
            default: System.out.println("Wrong choice");

        }
    }
}