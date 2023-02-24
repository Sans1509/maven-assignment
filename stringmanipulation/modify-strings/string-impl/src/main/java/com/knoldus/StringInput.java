package com.knoldus;
import java.io.IOException;
import java.util.Scanner;
public class StringInput {
    public static void main(String agrs[])
    //getting input from user
    throws IOException
    {
        Scanner readInput = new Scanner(System.in);
        String userInput = readInput.nextLine();

        ReverseandLength stringObject = new ReverseandLength();
        stringObject.reverseString(userInput);
        stringObject.stringLength(userInput);



    }




}
