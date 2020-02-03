package com.exercism;

class RaindropConverter {

    public static void main(String[] args) {
        System.out.println("RaindropConverter");

        RaindropConverter rdc = new RaindropConverter();
        System.out.println( rdc.convert(9) );
    }


    String convert(int number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        StringBuffer returnMe = new StringBuffer("");;
        StringBuffer buf = new StringBuffer("");

        for (int i =1; i <= number; i++){
            if (number % i == 0){
                buf.append( " " + new Integer(i).toString() + " " );
            }
        }

        String pling = "Pling";
        String plang = "Plang";
        String plong = "Plong";

        boolean keywordFound = false;

        if ( buf.toString().contains(" 3 ") ){

            //System.out.println("\t\tcontains a 3  : " );
            if (keywordFound)
                returnMe.append(pling);
            else
                returnMe = new StringBuffer(pling);

            keywordFound = true;
        }

        if ( buf.toString().contains(" 5 ") ){

            //System.out.println("\t\tcontains a 5  : " );
            if (keywordFound)
                returnMe.append(plang);
            else
                returnMe = new StringBuffer(plang);

            keywordFound = true;
        }

        if ( buf.toString().contains(" 7 ") ){

            //System.out.println("\t\tcontains a 7  : " );
            if (keywordFound)
                returnMe.append(plong);
            else
                returnMe = new StringBuffer(plong);

            keywordFound = true;
        }

        if (!(keywordFound)) returnMe = ( new StringBuffer( new Integer(number).toString() ));

        return returnMe.toString();
    }

}
/*
Introduction
Convert a number to a string, the contents of which depend on the number's factors.

If the number has 3 as a factor, output 'Pling'.
If the number has 5 as a factor, output 'Plang'.
If the number has 7 as a factor, output 'Plong'.
If the number does not have 3, 5, or 7 as a factor, just pass the number's digits straight through.
Examples
28's factors are 1, 2, 4, 7, 14, 28.
In raindrop-speak, this would be a simple "Plong".
30's factors are 1, 2, 3, 5, 6, 10, 15, 30.
In raindrop-speak, this would be a "PlingPlang".
34 has four factors: 1, 2, 17, and 34.
In raindrop-speak, this would be "34".
Running the tests
You can run all the tests for an exercise by entering

$ gradle test
in your terminal.

Source
A variation on a famous interview question intended to weed out potential candidates. http://jumpstartlab.com

Submitting Incomplete Solutions
It's possible to submit an incomplete solution so you can see how others have completed the exercise.
 */
