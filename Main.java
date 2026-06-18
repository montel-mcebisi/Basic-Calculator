import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calculate = new BasicCalculator();

        System.out.println("Hi There! \n\nOperations: \nMultiply: multiply \nDivision: division \nAddition: add \nSubtract: subtract\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        calculate.result = input.nextDouble();
        input.nextLine();

        String operation = "";
        while(!operation.equals("equal")) {
            System.out.print("Enter operation: ");
            operation = input.nextLine();
            if(!(operation.equals("multiply") || operation.equals("add") || operation.equals("subtract") || operation.equals("division") || operation.equals("equal"))) {
                throw new IllegalArgumentException("Enter valid operation! ");
            }
            if(operation.equals("multiply")){
                calculate.multiply();
            } 
            if(operation.equals("add")){
                calculate.add();
            } 
            if(operation.equals("subtract")){
                calculate.subtract();
            } 
            if(operation.equals("division")){
                calculate.division();
            } 
            if(operation.equals("equal")){
                calculate.equal();
            } 

        }
    }
}
