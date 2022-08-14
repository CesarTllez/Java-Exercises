package src.main.java.co.org.mycompany.javaexercises.Model;

/**
 * @author César Rodríguez
 */

public class Text {
    
    /**
     * @param text
     * @return Letter that does not repeat
     */
    public char findCharNoRepeated(String text){
        for(int i = 0; i < text.length(); i++){
            if(text.indexOf(text.charAt(i)) == text.lastIndexOf(text.charAt(i))){
               return  text.charAt(i);
            }
        }
        return '_';
    }

    /**
     * 
     * @param text
     * @return Number of vowels that there are in the text.
     */
    public int countVowels(String text){
        int count = 0;
        String[] vowels = "aeiou".split("");
        for(String leText: text.split("")){
            for(String leVowels: vowels){
                if(leText.equals(leVowels)) count += 1;
            }
        }
        return count;
    }

    /**
     * 
     * @param text
     * @param letter
     * @param replacement
     * @return New text with the corresponding letter replaced.
     */
    public String replaceLetter(String text, String letter, String replacement){
        String newText = "";
        for(String letText: text.split("")){
            newText += letText.equals(letter) ? replacement : letText;
        }
        return newText;
    }

    /**
     * 
     * @param text
     * @return Text in ASCII code.
     */
    public String replaceToASCII(String text){
        String newText = "";
        for(String letText: text.split("")){
            newText += (int)letText.charAt(0)+" ";
        }
        return newText;
    }

    /**
     * 
     * @param text
     * @return Text without spaces.
     */
    public String removeSpaces(String text){
        return text.replaceAll(" ", "");
    }
}
