import java.util.Scanner;

public class BasicCalculatorInJava {
    public static void main(String[] args){

        while(true){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Commandline Calculator in Java");
            System.out.println("------------------------------");
            System.out.println("This calculator only take 2 integer inputs to apply operations...");
            System.out.println("\0");
            System.out.println("Instructions:");
            System.out.println("-------------");
            System.out.println("Press `s` start");
            System.out.println("Press `x` exit");
            System.out.println("\0");
            System.out.print("Response = ");
            String response = input.nextLine();
    
            if(response.equals("s") || response.equals("S")){
                while(true) { 
                    System.out.println("\0");
                    System.out.println("Instructions:");
                    System.out.println("-------------");
                    System.out.println("\0");
                    System.out.println("You can enter only two numbers!");
                    System.out.println("\0");
                    System.out.println("List of operations:");
                    System.out.println("-------------");
                    System.out.println("\0");
                    System.out.println("Press `+` Addition");
                    System.out.println("Press `-` Subtraction");
                    System.out.println("Press `*` Multiplication");
                    System.out.println("Press `/` Division");
                    System.out.println("\0");

                    System.out.print("Enter First Number = ");
                    double first_digit = input.nextDouble();

                    input.nextLine();

                    System.out.print("Choose operation {+,-,*,/} => ");
                    String operation = input.nextLine();

                    System.out.print("Enter Second Number = ");
                    double second_digit = input.nextDouble();

                    input.nextLine();

                    if(operation.equals("+")){
                        double result = first_digit + second_digit;
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        System.out.println("Result: " + first_digit + " " + operation + " " + second_digit + " = " + result);
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        
                        System.out.println("Press enter to exit!");
                        String exit = input.nextLine();
                        
                        if(exit.equals("o")){
                            break;
                        }

                        else{
                            break;
                        }
                    }

                    else if(operation.equals("-")){
                        double result = first_digit - second_digit;
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        System.out.println("Result: " + first_digit + " " + operation + " " + second_digit + " = " + result);
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        
                        System.out.println("Press enter to exit!");
                        String exit = input.nextLine();
                        
                        if(exit.equals("o")){
                            break;
                        }

                        else{
                            break;
                        }
                    }

                    else if(operation.equals("*")){
                        double result = first_digit * second_digit;
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        System.out.println("Result: " + first_digit + " " + operation + " " + second_digit + " = " + result);
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        
                        System.out.println("Press enter to exit!");
                        String exit = input.nextLine();
                        
                        if(exit.equals("o")){
                            break;
                        }

                        else{
                            break;
                        }
                    }

                    else if(operation.equals("/")){
                        double result = first_digit / second_digit;
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        System.out.println("Result: " + first_digit + " " + operation + " " + second_digit + " = " + result);
                        System.out.println("-------------------------------------------------");
                        System.out.println("\0");
                        
                        System.out.println("Press enter to exit!");
                        String exit = input.nextLine();
                        
                        if(exit.equals("o")){
                            break;
                        }

                        else{
                            break;
                        }
                    }

                    else{
                        System.out.println("-------");
                        System.out.println("\0");
                        System.out.println("Invalid");
                        System.out.println("-------");
                        System.out.println("\0");
                    }

                }
            }

            else if(response.equals("x") || response.equals("X")){
                System.out.println("---------------------------------------------------------------");
                System.out.println("Thankyou! for using Calculator, Calculator exited successfully");
                System.out.println("---------------------------------------------------------------");
                break;
            }

            else{
                System.out.println("---------------------");
                System.out.println("Bad input! try again!");
                System.out.println("---------------------");
                System.out.println("\0");
                continue;
            }
        }
    }
}

