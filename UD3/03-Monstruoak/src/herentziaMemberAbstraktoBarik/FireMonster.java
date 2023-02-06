package herentziaMemberAbstraktoBarik;

public class FireMonster implements Monster {
    public FireMonster(String name) {
        super();
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
