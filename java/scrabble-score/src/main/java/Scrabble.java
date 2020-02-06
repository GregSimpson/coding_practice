import java.util.HashMap;
import java.util.Map;

class Scrabble {

    String word = "";
    Map<Character, Integer> myMap = new HashMap<Character, Integer>();
    int score = 0;

    Scrabble(String word) {
        this.word = word;
        this.setupMap();
    }

    void setupMap() {
        myMap.put('a', 1);
        myMap.put('b', 3);
        myMap.put('c', 3);
        myMap.put('d', 2);
        myMap.put('e', 1);
        myMap.put('f', 4);
        myMap.put('g', 2);
        myMap.put('h', 4);
        myMap.put('i', 1);
        myMap.put('j', 8);
        myMap.put('k', 5);
        myMap.put('l', 1);
        myMap.put('m', 3);
        myMap.put('n', 1);
        myMap.put('o', 1);
        myMap.put('p', 3);
        myMap.put('q', 10);
        myMap.put('r', 1);
        myMap.put('s', 1);
        myMap.put('t', 1);
        myMap.put('u', 1);
        myMap.put('v', 4);
        myMap.put('w', 4);
        myMap.put('x', 8);
        myMap.put('y', 4);
        myMap.put('z', 10);
    }

    int getScore() {
        score = 0;
        this.word.chars().forEach(i -> score += (myMap.get(Character.toLowerCase((char) i)) - 0) );
        //System.out.format("  Score of %s is %d : " , this.word, this.score );
        return score;
    }

}
