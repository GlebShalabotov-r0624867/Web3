package domain;

public class Teller {
    private int waarde;

    public int getTeller() {
        return waarde ;
    }

    public void add() {
        waarde ++;
    }

    public void reset() {
// dit is uiteraard niet juist, maar wordt
// later in de oefening aangepasst
    }
}
