/**
 *@author Hakkı Can Akut
 */
import java.util.Scanner;
//Main class
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        Thread.sleep(1000);
        System.out.println("************************************");
        //operation list
        String operations = "Choose an operation:\n" +
                "1. Calculate Area\n" +
                "2. Calculate length\n" +
                "3. Calculate Inner Product\n" +
                "q. Quit";
        //Main Page loop
        while (true) {
            System.out.println(operations);
            String selection = scanner.next();

            // Area calculating operation
            if (selection.equals("1")) {
                while (true) {
                    System.out.println("Choose a shape: \n" +
                            "a. Circle\n" +
                            "b. Triangle\n" +
                            "c. Quadrangle");
                    selection = scanner.next();
                    Thread.sleep(1000);
                    System.out.println("************************************");
                    //Choosing shape for area calculation
                    if (selection.equals("a")) {
                        Shape shape1 = new Problem.Mathematic.Circle();
                        shape1.AreaCalculating();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else if (selection.equals("b")) {
                        Shape shape1 = new Problem.Mathematic.Triangle();
                        shape1.AreaCalculating();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else if (selection.equals("c")) {
                        Shape shape1 = new Problem.Mathematic.Quadrangle();
                        shape1.AreaCalculating();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else {
                        System.out.println("This operation does not exist!");
                        Thread.sleep(1000);
                        System.out.println("Returning to main page!");
                        Thread.sleep(1000);
                        System.out.println("************************************");
                    }

                }
            }
            // Length of shape operation
            else if (selection.equals("2")) {
                while (true) {
                    System.out.println("Choose a shape: \n" +
                            "a. Circle\n" +
                            "b. Triangle\n" +
                            "c. Quadrangle");
                    selection = scanner.next();
                    Thread.sleep(1000);
                    System.out.println("************************************");
                    //Choosing shape for length calculation
                    if (selection.equals("a")) {
                        Shape shape1 = new Problem.Mathematic.Circle();
                        shape1.LengthOfShape();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else if (selection.equals("b")) {
                        Shape shape1 = new Problem.Mathematic.Triangle();
                        shape1.LengthOfShape();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else if (selection.equals("c")) {
                        Shape shape1 = new Problem.Mathematic.Quadrangle();
                        shape1.LengthOfShape();
                        Thread.sleep(1000);
                        System.out.println("************************************");
                        break;
                    } else {
                        System.out.println("This operation does not exist!");
                        Thread.sleep(1000);
                        System.out.println("Returning to main page!");
                        Thread.sleep(1000);
                        System.out.println("************************************");
                    }
                }
            }
            //Inner product operation
             else if (selection.equals("3")) {
                System.out.println("First Vector");
                Problem.Physics.Vector v1 = new Problem.Physics.Vector();
                Thread.sleep(1000);
                System.out.println("Second Vector");
                Problem.Physics.Vector v2 = new Problem.Physics.Vector();
                Thread.sleep(1000);
                Problem.Physics.InnerProduct(v1,v2);
                Thread.sleep(1000);
                System.out.println("************************************");

                //Quitting
            } else if (selection.equals("q")) {
                System.out.print("Are you sure to quit?(y/n): ");
                selection = scanner.next();
                if (selection.equals("y")){
                    System.out.println("Exiting!");
                    Thread.sleep(1000);
                    System.out.println("************************************");
                    break;
                }
                else if (selection.equals("n")){
                    Thread.sleep(1000);
                    System.out.println("************************************");
                    continue;
                }
                else{
                    System.out.print("This operation does not exist!");
                    Thread.sleep(1000);
                    System.out.print("Returning to main page!");
                    Thread.sleep(1000);
                    System.out.println("************************************");
                }
            }

            //Incorrect operation select
            else{
                System.out.print("This operation does not exist!");
                Thread.sleep(1000);
                System.out.println("Please pick carefully!");
                Thread.sleep(1000);
                System.out.println("************************************");
            }


        }
    }
}
