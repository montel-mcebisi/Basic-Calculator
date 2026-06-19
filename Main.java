import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calculate = new BasicCalculator();

        System.out.println("Hi There! \n\nOperations: \nMultiply: * \nDivision: / \nAddition: + \nSubtract: -\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        calculate.result = input.nextDouble();
        input.nextLine();

        String operation = "";
        while(!operation.equals("equal")) {
            System.out.print("Enter operation: ");
            operation = input.nextLine();
            if(!(operation.equals("*") || operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("="))) {
                throw new IllegalArgumentException("Enter valid operation! ");
            }
            if(operation.equals("*")){
                calculate.multiply();
            } 
            if(operation.equals("+")){
                calculate.add();
            } 
            if(operation.equals("-")){
                calculate.subtract();
            } 
            if(operation.equals("/")){
                calculate.division();
            } 
            if(operation.equals("=")){
                calculate.equal();
                break;
            } 

        }
    }
}
