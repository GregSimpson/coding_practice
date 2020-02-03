import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        // Convert the string in lower case letters
        phrase = phrase.toLowerCase();
        int len = phrase.length();

        char arr[] = phrase.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

}
