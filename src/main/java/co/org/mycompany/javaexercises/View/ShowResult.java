package src.main.java.co.org.mycompany.javaexercises.View;

import java.util.Scanner;

import src.main.java.co.org.mycompany.javaexercises.Model.Text;
import src.main.java.co.org.mycompany.javaexercises.Model.Number;

/**
 * @author César Rodríguez
 */

public class ShowResult {

    Scanner sc = new Scanner(System.in);
    Text textClass = new Text();
    Number numberClass = new Number();

    //Text class.
    /**
     * 
     * @param text
     */
    public void showFindCharNoRepeated(String text){
        System.out.println("Non-repeating character: "+textClass.findCharNoRepeated(text));
    }

    public void showCountVowels(){
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.println("There are "+textClass.countVowels(text)+" vowels in the text.");
    }

    public void showReplaceLetter(){
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.print("Enter the letter to replace: "); String letter = sc.nextLine();
        System.out.print("Enter the replacement: "); String replacement = sc.nextLine();

        System.out.println("Original text: "+text+".\n"
                          +"New text: "+textClass.replaceLetter(text, letter, replacement));
    }

    public void showReplaceToASCII(){
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.println("Each letter of the text converted to ASCII code:"+textClass.replaceToASCII(text));
    }

    public void showReversePolishCalculator(){
        System.out.print("Reverse Polish Calculator.\nOperations:"
                          +"\nSum (+) => a+b"
                          +"\nSubtraction (-) => a-b"
                          +"\nMultiplication (*) => a*b"
                          +"\nDivision (/) => a/b"
                          +"\nPower (^) => a^b"
                          +"\nRemainder (%) => a%b\n\n");

        System.out.print("Enter the number (a): "); int a = sc.nextInt();
        System.out.print("Enter the number (b): "); int b = sc.nextInt();
        System.out.print("Enter the sign + - * / ^ %: "); String sign  = sc.next();

        System.out.println("Result: "+numberClass.reversePolishCalculator(a, b, sign));
    }

    public void showRemoveSpaces(){
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.println("Text without spaces: "+textClass.removeSpaces(text));
    }

    //Number class.
    public void showIsPrime(){
        System.out.print("Enter a number: "); int number = Integer.parseInt(sc.nextLine());
        System.out.println(numberClass.checkIsPrime(number) == true ? "It's prime." : "It's not prime");
    }

    public void showGeneratePrimes(){
        System.out.print("Enter a length: "); int length = Integer.parseInt(sc.nextLine());
        System.out.println(numberClass.generatePrimes(length));
    }

    public void showCountUntilMinusOneEntered(){
        int counter = 0; double number;
        do {
            System.out.print("Enter a number: "); number = Double.parseDouble(sc.next());
            counter += 1;
        } while (number != (-1));
        System.out.println("Number of numbers entered: "+ counter);
    }
}
