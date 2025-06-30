import java.util.*;
class Java1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String option;
        do{
            System.out.println("Available Opetaion are +-*/%^");
            System.out.print("Enter value of a : ");
            double a = sc.nextDouble();
            System.out.print("Enter value of b : ");
            double b = sc.nextDouble();
            System.out.print("Enter value of operator : ");
            String operator = sc.next();
            switch(operator){
                case "+": 
                    System.out.println("The Addition of "+a+" and "+b+" is "+(a+b));
                    break;
                case "-": 
                    System.out.println("The Subtraction of "+a+" and "+b+" is "+(a-b));
                    break;
                case "*": 
                    System.out.println("The Multiplication of "+a+" and "+b+" is "+(a*b));
                    break;
                case "/": 
                    if(b!=0) System.out.println("The Division of "+a+" and "+b+" is "+(a/b));
                    else System.out.println("Division by zero is not allowed.");
                    break;
                case "%": 
                    System.out.println("The Modulus of "+a+" and "+b+" is "+(a % b));
                    break;
                case "^": 
                    System.out.println(a + " raised to the power of " + b + " is " + Math.pow(a, b));
                    break;
                default: System.out.println("Sorry you entered the wrong operator, Try again");
            }
            System.out.print("Want to continue (Yes,Y)? ");
            option = sc.next();
        }while(option.equalsIgnoreCase("Yes") || option.equalsIgnoreCase("Y"));
        sc.close();
    }
}