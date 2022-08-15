package src.main.java.co.org.mycompany.javaexercises.View;

import java.util.Scanner;

import javax.swing.JOptionPane;

import src.main.java.co.org.mycompany.javaexercises.Model.Text;
import src.main.java.co.org.mycompany.javaexercises.Model.Number;
import src.main.java.co.org.mycompany.javaexercises.Model.Inheritance.Programmer;
import src.main.java.co.org.mycompany.javaexercises.Model.Inheritance.SoccerPlayer;

/**
 * @author César Rodríguez
 */

public class ShowResult {

    Scanner sc;
    Text textClass;
    Number numberClass;
    Programmer programmerClass;
    SoccerPlayer soccerPlayerClass;

    // Text class.
    /**
     * 
     * @param text
     */
    public void showFindCharNoRepeated() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.println("Non-repeating character: " + textClass.findCharNoRepeated(text));
    }

    public void showCountVowels() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.println("There are " + textClass.countVowels(text) + " vowels in the text.");
    }

    public void showReplaceLetter() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.print("Enter the letter to replace: ");
        String letter = sc.nextLine();
        System.out.print("Enter the replacement: ");
        String replacement = sc.nextLine();

        System.out.println("Original text: " + text + ".\n"
                + "New text: " + textClass.replaceLetter(text, letter, replacement));
    }

    public void showReplaceToASCII() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.println("Each letter of the text converted to ASCII code:" + textClass.replaceToASCII(text));
    }

    public void showReversePolishCalculator() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Reverse Polish Calculator.\nOperations:"
                + "\nSum (+) => a+b"
                + "\nSubtraction (-) => a-b"
                + "\nMultiplication (*) => a*b"
                + "\nDivision (/) => a/b"
                + "\nPower (^) => a^b"
                + "\nRemainder (%) => a%b\n\n");

        System.out.print("Enter the number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter the sign + - * / ^ %: ");
        String sign = sc.next();

        System.out.println("Result: " + numberClass.reversePolishCalculator(a, b, sign));
    }

    public void showRemoveSpaces() {
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.println("Text without spaces: " + textClass.removeSpaces(text));
    }

    public void showCheckIfPhraseIsVoid() {
        textClass = new Text();
        String phrase = "", superPhrase = "";
        do {
            phrase = JOptionPane.showInputDialog(null, "Enter a phrase: ");
            superPhrase += phrase;
        } while (textClass.checkIfPhraseIsVoid(phrase) != false);
        System.out.println(superPhrase);
    }

    public void showChangeLowerOrUpperPhrase() {
        textClass = new Text();
        String phrase = JOptionPane.showInputDialog(null, "Enter the phrase: ");
        byte option = Byte.parseByte(JOptionPane.showInputDialog(null,
                "Phrase Formater.\nEnter the number that corresponding:\n1. Lowercase\n2. Uppercase."));
        System.out.println(textClass.changeLowerOrUpperPhrase(option, phrase));
    }

    public void showEqualizeTwoWords(){
        sc = new Scanner(System.in); textClass = new Text();
        String wordOne, wordTwo;
        System.out.print("Enter the first word: "); wordOne = sc.next();
        System.out.print("Enter the second word: "); wordTwo = sc.next();
        System.out.print("The two words are "+(textClass.equalizeTwoWords(wordOne, wordTwo) == true ? "the same." : "different."));
    }

    public void showCheckSchedule(){
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter the day: "); String day = sc.nextLine();
        System.out.println(day.toUpperCase()+" => "+textClass.checkSchedule(day));
    }

    public void showCheckIfItsPalindrome(){
        sc = new Scanner(System.in); textClass = new Text();
        System.out.print("Enter a text: "); String text = sc.nextLine();
        System.out.println(textClass.checkIfItsPalindrome(text) == true ? "It's a palindorme." : "It's not a palindrome.");
    }

    // Number class.
    public void showIsPrime() {
        sc = new Scanner(System.in); numberClass = new Number();
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(numberClass.checkIsPrime(number) == true ? "It's prime." : "It's not prime");
    }

    public void showGeneratePrimes() {
        sc = new Scanner(System.in); numberClass = new Number();
        System.out.print("Enter a length: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println(numberClass.generatePrimes(length));
    }

    public void showCountUntilMinusOneEntered() {
        sc = new Scanner(System.in); numberClass = new Number();
        int counter = 0;
        double number;
        do {
            System.out.print("Enter a number: ");
            number = Double.parseDouble(sc.next());
            counter += 1;
        } while (number != (-1));
        System.out.println("Number of numbers entered: " + counter);
    }

    //Inheritance
    public void showIntroduceOneself(){
        //Programmer class.
        programmerClass = new Programmer("César Rodríguez", (byte)22, 000000000, "Java");
        System.out.println(programmerClass.introduceOneself());

        //SoccerPlayer class.
        soccerPlayerClass = new SoccerPlayer();
        soccerPlayerClass.setFullName("César Rodríguez");
        soccerPlayerClass.setAge((byte)22);
        soccerPlayerClass.setTeam("Juventus");
        System.out.println(soccerPlayerClass.introduceOneself());
    }
}
