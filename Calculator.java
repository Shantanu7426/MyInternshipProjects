import java.util.Scanner;

class Calculator
{   

        Scanner sc = new Scanner(System.in);

        int a, b, c;
    public void addition()
    {
        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a + b;
        System.out.println("Addition is : "+c);
    }

    public void substraction()
    {
        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a - b;
        System.out.println("Substraction is : "+c);
    }

    public void multiplication()
    {
        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a * b;
        System.out.println("Multiplication is : "+c);
    }

    public void division()
    {
        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a / b;
        System.out.println("Division is : "+c);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n");
        System.out.println("Enter a number :");
        int z = sc.nextInt();
        Calculator c =new Calculator();

        switch (z) {
            case 1: c.addition();               
                    break;
        
            case 2: c.substraction();  
                    break;
            
            case 3: c.multiplication();               
                    break;

            case 4: c.division();               
                    break;
            
            default: System.out.println("Enter a valid number");
                break;
        }
        sc.close();

    }
}