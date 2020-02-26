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

}
