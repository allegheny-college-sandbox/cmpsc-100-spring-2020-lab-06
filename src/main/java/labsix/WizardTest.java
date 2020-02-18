package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/** Helps G. Wiz generate test questions.
 *
 * @author Solution Repository
 */
public class WizardTest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {    
    // Start the generator
    System.out.println("WIZARD TEST QUESTION GENERATOR");
    System.out.println();
    
    // Set up file input
    File file = null;
    Scanner fileInput = null;
    try {
      file = new File("input/test.question");
      fileInput = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String question = fileInput.nextLine();
    Scanner keyboardInput = new Scanner(System.in);

    // Replace String placeholders
    
    // Replace {PLACE} placeholder
    System.out.print("Enter the name of a fictional place: ");
    question = question.replace("{PLACE}",keyboardInput.nextLine());
    // Replace {JOB} placeholder
    System.out.print("Enter the singular form of a type of job: ");
    question = question.replace("{JOB}",keyboardInput.nextLine());
    // Replace {POTION} placeholder
    System.out.print("Enter the title of a potion: ");
    question = question.replace("{POTION}",keyboardInput.nextLine());
    // Replace {INGREDIENT} placeholder
    System.out.print("Enter the name of an ingredient: ");
    question = question.replace("{INGREDIENT}",keyboardInput.nextLine());
    
    // Replace number placeholders with random items
    
    Random generator = new Random();
    
    double ounces = generator.nextDouble() * 50;
    question = question.replace("{OUNCES}", String.valueOf(ounces));
    int quantity = generator.nextInt(10) + 1;
    question = question.replace("{QUANTITY}", String.valueOf(quantity));
    double amount = generator.nextDouble() * 100;
    question = question.replace("{AMOUNT}", String.valueOf(amount));
    
    int answer = (int)(amount / ounces) * quantity;

    System.out.println(question);
    System.out.println();
    System.out.println("> " + answer);
  }
}