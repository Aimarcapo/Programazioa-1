package herentziaMemberAbstraktoBarik;

public class StoneMonster implements Monster {
    public StoneMonster(String name) {
        super();
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
