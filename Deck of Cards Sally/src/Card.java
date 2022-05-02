import java.util.LinkedList;

abstract class Card {
//hash code
    int suit;
    int number;

    Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }
    

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString(){
        return suit + "" + number;
    }

}
