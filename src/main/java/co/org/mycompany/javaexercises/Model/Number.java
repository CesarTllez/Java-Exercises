package src.main.java.co.org.mycompany.javaexercises.Model;

/**
 * @author César Rodríguez
 */

public class Number {
    
    /**
     * 
     * @param number
     * @return If a number is prime or not.
     */
    public boolean checkIsPrime(int number){
        boolean isPrime = true;
        for(int count = (int)Math.sqrt(number); count > 1; count--){
            if(number%count==0) isPrime = false;
        }
        return isPrime == true && number > 1 ? true : false;
    }

    /**
     * 
     * @param length
     * @return Amount of prime numbers equal to length.
     */
    public String generatePrimes(int length){
        String primeNumbers = "";
        for(int count = 2; count <= length; count++){
            if(checkIsPrime(count) == true) primeNumbers += count+" ";
        }
        return primeNumbers;
    }

    /**
     * 
     * @param a
     * @param b
     * @param sign
     * @return The result that corresponding.
     */
    public int reversePolishCalculator(int a, int b, String sign){
        int result = 0;
        if(sign.equals("+")) result = a+b;
        if(sign.equals("-")) result = a-b;
        if(sign.equals("*")) result = a*b;
        if(sign.equals("/")) result = a/b;
        if(sign.equals("^")) result = (int)Math.pow(a, b);
        if(sign.equals("%")) result = a%b;
        return result;
    }
}
