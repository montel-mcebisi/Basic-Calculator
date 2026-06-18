import java.util.Scanner;

class BasicCalculator {
    
    public double result;
    private String current = "";

    public BasicCalculator() {
        this.result = result;
        this.current = current;
    }
    
    public void add() {
        Scanner input = new Scanner(System.in);
        
        if(!current.equals("=")) {
            System.out.print("Enter number: ");
            current = input.nextLine();
            result += Integer.parseInt(current);
        } 
        
        
    }
    public void multiply() {
        Scanner input = new Scanner(System.in);
        
        if(!current.equals("=")) {
            System.out.print("Enter number: ");
            current = input.nextLine();
            result *= Integer.parseInt(current);
        } 
        
    }
    public void subtract() {
        Scanner input = new Scanner(System.in);
        
        if(!current.equals("=")) {
            System.out.print("Enter number: ");
            current = input.nextLine();
            result -= Integer.parseInt(current);
        } 
        
    }
    public void division() {
        Scanner input = new Scanner(System.in);
        
        if(!current.equals("=")) {
            System.out.print("Enter number: ");
            current = input.nextLine();
            if(Integer.parseInt(current) == 0 ) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            result /= Integer.parseInt(current);
        } 
        
    }
    public void equal(){

        System.out.print(result);
    }
    

}