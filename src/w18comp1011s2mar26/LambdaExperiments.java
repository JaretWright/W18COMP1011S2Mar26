package w18comp1011s2mar26;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author JWright
 */
public class LambdaExperiments
{
    public static void main(String[] args)
    {
        //Functional Interface "Predicate", accepts 1 argument and has a method called
        //"test" that returns a boolean
        System.out.println("~~~~~~~~~~~Example of a Predicate Interface~~~~~~~~~~~~");
        Predicate<String> pwChecker = (passwordArgument) -> passwordArgument.length() >= 8;
        System.out.printf("The password \"Bumblebee\" is big enough: %b%n", pwChecker.test("BumbleeBee"));
        System.out.printf("The password \"yeah!\" is big enough: %b%n", pwChecker.test("yeah!"));
        
        //Consumer Interface - takes in an argument, but does not return anything
        //Consumer Interface has 1 method called "accept"
        System.out.println("\n~~~~~~~~~~~Example of a Consumer Interface~~~~~~~~~~~~");
        Consumer<String> display = (stringArgument)->System.out.println(stringArgument.toUpperCase());
        display.accept("everyone loves Java!");
        
        //Function Interface - takes 1 argument and returns a result
        //The interface uses the method "apply"
        System.out.println("\n~~~~~~~~~~~Example of an Function Interface~~~~~~~~~~~~");
        Function<Integer, String> converter = (intToConvert) -> Integer.toString(intToConvert);
        System.out.printf("As numbers, 5+5=%d%n", 5+5);
        System.out.printf("As String objects, 5+5=%s%n", converter.apply(5)+converter.apply(5));
        
        
    }
}
