/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
import java.util.stream.IntStream;


class Bob {

    //https://github.com/charles-wangkai/exercism/blob/master/java/bob/src/main/java/Bob.java
    String hey(String s) {
        if (s.chars().filter(ch -> !Character.isWhitespace(ch)).count() == 0) {
            return "Fine. Be that way!";
        } else if (generateCandidateStream(s).count() > 0
                && generateCandidateStream(s).allMatch(Character::isUpperCase)) {
            if (isQuestion(s)) {
                return "Calm down, I know what I'm doing!";
            } else {
                return "Whoa, chill out!";
            }
        } else if (isQuestion(s)) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

    boolean isQuestion(String s) {
        return s.replaceAll("\\s", "").endsWith("?");
    }

    IntStream generateCandidateStream(String s) {
        return s.chars().filter(Character::isLetter);
    }

    String hey_orig (String origStr) {

        System.out.format("in hey\n");
        String wrkStr = ltrim(rtrim( origStr ));
        String rtnStr = "Whatever.";

        System.out.format("\twrkStr               is ::%s::\n", wrkStr);
        System.out.format("\twrkStr.toUpperCase() is ++%s++\n", wrkStr.toUpperCase());
        System.out.format("\twrkStr-lastChar      is ::%c::\n", wrkStr.charAt(wrkStr. length() - 1));

        if (wrkStr.length() == 0 ) rtnStr = "Fine. be that way!";
        if ( (wrkStr.matches(".*[a-zA-Z]+.*") ) || ((wrkStr.endsWith("?") ) )
            || !(wrkStr.matches(".*[0-9]+.*") ) )
         {
            if (wrkStr.endsWith("?")) rtnStr = "Sure.";
            if (wrkStr.toUpperCase().equals(wrkStr)
                    && !(wrkStr.matches(".*[0-9]+.*"))
            ) rtnStr = "Whoa, chill out!";
            if (((wrkStr.toUpperCase()).equals(wrkStr)) & (wrkStr.endsWith("?"))
                    && !(wrkStr.matches(".*[0-9]+.*"))
            ) {
                rtnStr = "Calm down, I know what I'm doing!";
            }
        }

        return rtnStr;
    }


    public static String ltrim(String s) {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s) {
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }

}

