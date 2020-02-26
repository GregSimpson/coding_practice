import java.util.Random;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class DnDCharacter {
    private Random random = new Random();
    Map< String,Integer> abilities = new HashMap< String,Integer>();

    DnDCharacter() {
        abilities.put("CHARISMA", ability() );
        abilities.put("CONSTITUTION", ability() );
        abilities.put("DEXTERITY", ability() );
        abilities.put("INTELLIGENCE", ability() );
        abilities.put("STRENGTH", ability() );
        abilities.put("WISDOM", ability() );
    }


    public int getStrength() {
        String ability_name = "STRENGTH";
        return abilities.get(ability_name);
    }

    public int getDexterity() {
        String ability_name = "DEXTERITY";
        return abilities.get(ability_name);
    }

    public int getConstitution() {
        String ability_name = "CONSTITUTION";
        return abilities.get(ability_name);
    }

    public int getIntelligence() {
        String ability_name = "INTELLIGENCE";
        return abilities.get(ability_name);
    }

    public int getWisdom() {
        String ability_name = "WISDOM";
        return abilities.get(ability_name);
    }

    public int getCharisma() {
        String ability_name = "CHARISMA";
        return abilities.get(ability_name);
    }

    public int getHitpoints() {
        //hashmapIterator();
        return 10 + modifier( abilities.get("CONSTITUTION") );
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public int ability() {
        return IntStream.range(0, 4).map(i -> rollDice()).sorted().skip(1).sum();
    }

    public int modifier(int value) {
        return Math.floorDiv(value - 10, 2);
    }

    public void setReplaceExample() {
            String ability_name = "SETandREPLACE";
            int ability_value = Math.round((int)((rollDice() - 10)/2));

            if (abilities.containsKey(ability_name)) {
                abilities.replace(ability_name, ability_value);
            } else{
                abilities.put(ability_name, ability_value);
            }
            System.out.format("GJS: ability:\t%s\tvalue:\t%d\n", ability_name, abilities.get(ability_name) );
    }

    public void hashmapIterator() {
        String ability_name = "hashmapIterator";
        Set< Map.Entry< String,Integer> > st = abilities.entrySet();
        for (Map.Entry< String,Integer> abilities:st)
        {
            System.out.format("GJS: value:\t%d\tability:\t%s\n", abilities.getValue(), abilities.getKey() );
        }
        System.out.format("GJS:---------------\n" );
    }

}
