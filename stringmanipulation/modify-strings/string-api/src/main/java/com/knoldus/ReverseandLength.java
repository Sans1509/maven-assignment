package com.knoldus;

 class ReverseandLength {
     String emptyString = "";
     char character;
     public void reverseString(String userInput)
      // method for reversing a string
    {
        for (int index=0; index<userInput.length(); index++)
        {
            character= userInput.charAt(index); //extracts each character
            emptyString= character+emptyString;
        }
        System.out.println("Reversed word: "+ emptyString);
    }

    public void stringLength(String userInput)
     // method for determining the length of string
    {
        int index = 0;
        for(char character: userInput.toCharArray()) {
            index++;
        }
        System.out.println("Length of the given string ::"+index);
    }
}
