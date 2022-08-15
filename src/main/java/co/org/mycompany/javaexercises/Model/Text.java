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
                if(leText.equalsIgnoreCase(leVowels)) count += 1;
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
            newText += letText.equalsIgnoreCase(letter) ? replacement : letText;
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

    /**
     * 
     * @param phrase
     * @return
     */
    public boolean checkIfPhraseIsVoid(String phrase){
        boolean isVoid = phrase.length() == 0 ? false : true;
        if(isVoid == true){
            String ABC = "abcdefghijklmnñopqrstuvwxyz";
            for(String character: phrase.split("")){
                if (ABC.contains(character.toLowerCase()) == true) return true;
            }
        }
        return false;
    }

    /**
     * 
     * @param option
     * @param phrase
     * @return Phrase format changed.
     */
    public String changeLowerOrUpperPhrase(byte option, String phrase){
        return option == 1 ? phrase.toLowerCase() : phrase.toUpperCase();
    }

    /**
     * 
     * @param wordOne
     * @param wordTwo
     * @return True or False depending on the case.
     */
    public boolean equalizeTwoWords(String wordOne, String wordTwo){
        return wordOne.equalsIgnoreCase(wordTwo) ? true : false;
    }

    /**
     * 
     * @param day
     * @return Day that corresponding.
     */
    public String checkSchedule(String day){
        String message = "It does not exist.";
        for(Schedule scheduleDay: Schedule.values()){
            message = scheduleDay.getDay().equalsIgnoreCase(day) ? scheduleDay.getInfo() : message;
        }
        return message;
    }

    /**
     * 
     * @param text
     * @return True or False depending on the case.
     */
    public boolean checkIfItsPalindrome(String text){
        String newText = "";
        for(String character: text.split("")){
            newText = character+newText;
        }
        return newText.equalsIgnoreCase(text) ? true : false; 
    }
}
