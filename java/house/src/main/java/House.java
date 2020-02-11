import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
"This is the horse and the hound and the horn " +
"that belonged to the farmer sowing his corn " +
"that kept the rooster that crowed in the morn " +
"that woke the priest all shaven and shorn " +
"that married the man all tattered and torn " +
"that kissed the maiden all forlorn " +
"that milked the cow with the crumpled horn " +
"that tossed the dog " +
"that worried the cat " +
"that killed the rat " +
"that ate the malt " +
"that lay in the house that Jack built.";
 */

class House {

    int numOfRows = 12;
    String intro = "This is ";

    List<String> mstrList;
    StringBuilder answer = new StringBuilder();
    StringBuilder multiAnswer = new StringBuilder();

    String sing() {
        return this.verses(1, numOfRows);
    }

    String verses(int start, int end) {
        for (int thisVerse=start; thisVerse<=end; thisVerse++){
            answer = new StringBuilder();
            multiAnswer.append( this.verse(thisVerse) );
            if (thisVerse != end) {
                multiAnswer.append("\n");
            }
        }
        return multiAnswer.toString();
    }

    String verse(int verse) {

        mstrList = new ArrayList<String>();
        setUp();

        answer.append(intro);
        for (int row=0; row<verse; row++){
            //System.out.format("\t:%s\n", mstrList.get(row).toString());
            answer.replace(0,intro.length(), intro + mstrList.get(row).toString() );
        }
        //showAnswer();
        return answer.toString();
    }

    void showAnswer() {
        System.out.println(answer.toString());
    }

    void setUp() {
        mstrList = new ArrayList<String>(numOfRows);

        mstrList.add("the house that Jack built.");
        mstrList.add("the malt that lay in ");
        mstrList.add("the rat that ate ");
        mstrList.add("the cat that killed ");
        mstrList.add("the dog that worried ");
        mstrList.add("the cow with the crumpled horn that tossed ");
        mstrList.add("the maiden all forlorn that milked ");
        mstrList.add("the man all tattered and torn that kissed ");
        mstrList.add("the priest all shaven and shorn that married ");
        mstrList.add("the rooster that crowed in the morn that woke ");
        mstrList.add("the farmer sowing his corn that kept ");
        mstrList.add("the horse and the hound and the horn that belonged to ");
    }
}
