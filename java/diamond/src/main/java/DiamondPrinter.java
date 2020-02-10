import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class DiamondPrinter {

    void showRtnList(List<String> printMe){
        // show the array
        for(int rows=0; rows< printMe.size(); rows++) {
            System.out.println( printMe.get(rows) );
        }
    }

    List<String> printToList(char a) {

        //System.out.format("in printToList\n");
        int charDiff = ( (int)Character.toUpperCase(a) - (int)'A' );
        int numOfRows = (charDiff * 2) + 1;
        int numOfCols = numOfRows;
        int middleOfString = Math.round(numOfCols / 2);

        List<String> rtnList;
        rtnList = new ArrayList<String>(numOfRows);

        StringBuilder builder = new StringBuilder(numOfCols);// = new StringBuilder(string.length() * count);
        //build the row by col array of blanks
        for(int rows=0; rows< numOfRows; rows++) {
            builder = new StringBuilder(numOfCols);
            for (int cols = 0; cols < numOfCols; cols++)
                builder.append(' ');
            rtnList.add (builder.toString() );
        }

        for (int thisLetter = (int)'A'; thisLetter <= (int)Character.toUpperCase(a); thisLetter++) {
            //for (int thisRow = 0; thisRow < Math.round(numOfRows / 2 + .5); thisRow++) {
            for (int thisRow = 0; thisRow < numOfRows; thisRow++) {
                if (thisLetter == ( (int)'A' + thisRow) ) {

                    // reset build to all blanks
                    for (int cols = 0; cols < numOfCols; cols++)
                        builder.setCharAt(cols, ' ');

                    //define the current char
                    char newChar = (char) ((int) ('A') + thisRow);
                    //calc where to put the char
                    int firstPos = middleOfString - thisRow;
                    int secondPos = middleOfString + thisRow;

                    // set the char in the builder buffer at both offsets
                    builder.setCharAt(firstPos, newChar);
                    builder.setCharAt(secondPos, newChar);

                    // set instances of builder in rtnList at both offsets
                    rtnList.set(thisRow, builder.toString());
                    rtnList.set((numOfRows - thisRow) - 1, builder.toString());
                }
            }
        }

        // show the array
        //showRtnList(rtnList);

        return rtnList;
    }

    List<String> printToListGotThis(char a) {

        System.out.format("in printToList\n");
        int charDiff = ( (int)Character.toUpperCase(a) - (int)'A' );
        int numOfRows = (charDiff * 2) + 1;
        int numOfCols = (charDiff * 2) + 1;
        int centerRow = Math.round(numOfRows/2) ;
        int centerCol = Math.round(numOfCols/2) ;

        System.out.format("charDiff  is %d\n", charDiff);
        System.out.format("numOfRows is %d\n", numOfRows);
        System.out.format("numOfCols is %d\n", numOfCols);
        System.out.format("centerRow is %d\n", centerRow);
        System.out.format("centerCol is %d\n\n", centerCol);

        List<String> rtnList;
        rtnList = new ArrayList<String>(numOfRows);

        StringBuilder builder = new StringBuilder(numOfCols);// = new StringBuilder(string.length() * count);
        //build the row by col array of blanks
        for(int rows=0; rows< numOfRows; rows++) {
            builder = new StringBuilder(numOfCols);
            for (int cols = 0; cols < numOfCols; cols++)
                builder.append(' ');
            rtnList.add (builder.toString() );
        }

        System.out.format("rtnList size is %d\n", rtnList.size() );
        for (int thisLetter = (int)'A'; thisLetter <= (int)Character.toUpperCase(a); thisLetter++) {
            //System.out.format("thisLetter     is %c\n", thisLetter);

            for (int thisRow = 0; thisRow < Math.round(numOfRows / 2 + .5); thisRow++) {
                //System.out.format("thisRow        is %d\n", thisRow);
                //System.out.format("\trtnList[thisRow] size is %d\n", rtnList.get(thisRow).length());

                if (thisLetter == ( (int)'A' + thisRow) ) {
                    System.out.format("\tMATCH thisLetter     is %c\n", thisLetter);
                    System.out.format("\tMATCH thisRow        is %d\n", thisRow);

                    for (int cols = 0; cols < numOfCols; cols++)
                        builder.setCharAt(cols, ' ');

                    int middleOfString = Math.round(numOfCols / 2);
                    int charOffset = (((int) 'A' + thisRow) - (int) 'A');
                    int firstPos = middleOfString - thisRow;
                    int secondPos = middleOfString + thisRow;

                    int i2 = Character.getNumericValue(a);
                    char ch = (char) (i2 - thisRow);
                    char newChar = (char) ((int) ('A') + thisRow);
                    //System.out.format("char int value is %d\n", i2);
                    //System.out.format("ch   int value is %d\n", ch);
                    //System.out.format("newChar is        %c\n", newChar);


                    //if (thisLetter == ( (int)'A' + thisRow) ) {
                    builder.setCharAt(firstPos, newChar);
                    builder.setCharAt(secondPos, newChar);

                    System.out.format("builder is %s\n", builder.toString());
                    rtnList.set(thisRow, builder.toString());
                    rtnList.set((numOfRows - thisRow) - 1, builder.toString());
                    System.out.format("rtnList is %s\n", rtnList);


                    // show the array
                    for(int rows=0; rows< rtnList.size(); rows++) {
                        System.out.println( rtnList.get(rows) );
                    }
                }

                /*
                {
                    int middleOfString = Math.round(numOfCols / 2);
                    int charOffset = (((int) 'A' + thisRow) - (int) 'A');
                    int firstPos = middleOfString - thisRow;
                    int secondPos = middleOfString + thisRow;

                    System.out.format("thisRow        is %d\n", thisRow);
                    //System.out.format("thisLetter     is %d\n", thisLetter);
                    System.out.format("charOffset     is %d\n", charOffset);
                    System.out.format("middleOfString is %d\n", middleOfString);
                    System.out.format("firstPos      is %d\n", firstPos);
                    System.out.format("secondPos     is %d\n", secondPos);

                    int i2 = Character.getNumericValue(a);
                    char ch = (char) (i2 - thisRow);
                    char newChar = (char) ((int) ('A') + thisRow);
                    System.out.format("char int value is %d\n", i2);
                    System.out.format("ch   int value is %d\n", ch);
                    System.out.format("newChar is        %c\n", newChar);


                    //if (thisLetter == ( (int)'A' + thisRow) ) {
                    builder.setCharAt(firstPos, newChar);
                    builder.setCharAt(secondPos, newChar);
                    //}

                    System.out.format("builder is %s\n", builder.toString());
                    rtnList.set(thisRow, builder.toString());
                    rtnList.set((numOfRows - thisRow) - 1, builder.toString());
                    System.out.format("rtnList is %s\n", rtnList);
                }
                 */

            }
        }

        String[] thisStr= new String[numOfCols];

        System.out.format("Character %c has a value of %d\n"
                ,a
                //,Character.getNumericValue(a));
                ,(int)Character.toUpperCase(a));

        System.out.format("Character %c has a value of %d\n"
                ,'B'
                //,Character.getNumericValue('B'));
                ,(int)'B');

        System.out.format("Character %c has a value of %d\n"
                ,'b'
                //,Character.getNumericValue('b'));
                ,(int)'b');

        // show the array
        for(int rows=0; rows< rtnList.size(); rows++) {
            System.out.println( rtnList.get(rows) );
        }

        return rtnList;

    }

    List<String> printToListAlmostThere(char a) {

        System.out.format("in printToList\n");
        //int charDiff = ( Character.getNumericValue(a) % 10 );
        int charDiff = ( (int)Character.toUpperCase(a) - (int)'A' );
        int numOfRows = (charDiff * 2) + 1;
        int numOfCols = (charDiff * 2) + 1;
        int centerRow = Math.round(numOfRows/2) ;
        int centerCol = Math.round(numOfCols/2) ;

        System.out.format("charDiff  is %d\n", charDiff);
        System.out.format("Character.getNumericValue  %c has a value of %d\n"
                ,a
                ,Character.getNumericValue(a));
        System.out.format("(int)a of  %c has a int value %d\n"
                ,a
                ,(int)(a));
        System.out.format("numOfRows is %d\n", numOfRows);
        System.out.format("numOfCols is %d\n", numOfCols);
        System.out.format("centerRow is %d\n", centerRow);
        System.out.format("centerCol is %d\n\n", centerCol);

        List<String> rtnList;
        rtnList = new ArrayList<String>(numOfRows);

        StringBuilder builder = new StringBuilder(numOfCols);// = new StringBuilder(string.length() * count);
        //build the row by col array of blanks
        for(int rows=0; rows< numOfRows; rows++) {
            builder = new StringBuilder(numOfCols);
            for (int cols = 0; cols < numOfCols; cols++)
                builder.append(' ');
            rtnList.add (builder.toString() );
        }

        System.out.format("rtnList size is %d\n", rtnList.size() );
        //for (int thisLetter = (int)'A'; thisLetter <= (int)Character.toUpperCase(a); thisLetter++) {
        for (int thisRow = 0; thisRow < Math.round(numOfRows / 2 + .5); thisRow++) {
            System.out.format("\trtnList[thisRow] size is %d\n", rtnList.get(thisRow).length());

            int middleOfString = Math.round(numOfCols / 2);
            int charOffset = (((int) 'A' + thisRow) - (int) 'A');
            int firstPos = middleOfString - thisRow;
            int secondPos = middleOfString + thisRow;

            System.out.format("thisRow        is %d\n", thisRow);
            //System.out.format("thisLetter     is %d\n", thisLetter);
            System.out.format("charOffset     is %d\n", charOffset);
            System.out.format("middleOfString is %d\n", middleOfString);
            System.out.format("firstPos      is %d\n", firstPos);
            System.out.format("secondPos     is %d\n", secondPos);

            //final int RADIX = 10;
            //int g = Character.getNumericValue(a);
            //char ch = Character.forDigit(g, RADIX);

            //char ch = Character.forDigit(Character.getNumericValue(a), RADIX);
            //int i2 = Character.digit(a, RADIX);

            int i2 = Character.getNumericValue(a);
            char ch = (char) (i2 - thisRow);
            //char newChar = (char)((int)(a) - i );
            char newChar = (char) ((int) ('A') + thisRow);
            //System.out.println(ch);
            //System.out.format("newChar is        %c\n", (char)ch );
            System.out.format("newChar is        %c\n", newChar);
            System.out.format("char int value is %d\n", i2);

            //if (thisLetter == ( (int)'A' + thisRow) ) {
            builder.setCharAt(firstPos, newChar);
            builder.setCharAt(secondPos, newChar);
            //}

            System.out.format("builder is %s\n", builder.toString());
            rtnList.set(thisRow, builder.toString());
            rtnList.set((numOfRows - thisRow) - 1, builder.toString());
            System.out.format("rtnList is %s\n", rtnList);

        }
        //}

        String[] thisStr= new String[numOfCols];

        System.out.format("Character %c has a value of %d\n"
                ,a
                //,Character.getNumericValue(a));
                ,(int)Character.toUpperCase(a));

        System.out.format("Character %c has a value of %d\n"
                ,'B'
                //,Character.getNumericValue('B'));
                ,(int)'B');

        System.out.format("Character %c has a value of %d\n"
                ,'b'
                //,Character.getNumericValue('b'));
                ,(int)'b');

        // show the array
        for(int rows=0; rows< rtnList.size(); rows++) {
            System.out.println( rtnList.get(rows) );
        }

        return rtnList;

    }

}
