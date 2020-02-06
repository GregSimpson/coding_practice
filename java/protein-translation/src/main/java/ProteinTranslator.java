import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    private final static HashMap<String, String> goodList = new HashMap<String, String>();
    private final static HashMap<String, String> stopList = new HashMap<String, String>();

    static {
        stopList.put("UAA", "STOP");
        stopList.put("UAG", "STOP");
        stopList.put("UGA", "STOP");

        goodList.put("AUG","Methionine");
        goodList.put("UUC","Phenylalanine");
        goodList.put("UUU","Phenylalanine");

        goodList.put("UUA","Leucine");
        goodList.put("UUG","Leucine");

        goodList.put("UCA","Serine");
        goodList.put("UCC","Serine");
        goodList.put("UCG","Serine");
        goodList.put("UCU","Serine");

        goodList.put("UAC","Tyrosine");
        goodList.put("UAU","Tyrosine");

        goodList.put("UGC","Cysteine");
        goodList.put("UGU","Cysteine");

        goodList.put("UGG","Tryptophan");
    }

    List<String> translate(String rnaSequence) {
        int index = 0;
        String triplet;
        List <String> rtnList = new ArrayList<String>();
        int step = 3;

        while (index < rnaSequence.length()){
            triplet = rnaSequence.substring(index, Math.min(index + step, rnaSequence.length()));
            if (stopList.containsKey(triplet)) break;
            rtnList.add( goodList.get(triplet).toString());
            index += step;
        }
        return rtnList;
    }
}