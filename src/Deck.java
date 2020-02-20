import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> Cards = new ArrayList<Card>();
    String [] face = {"Hearts","Diamonds","Clubs","Spades"};
    //{"Hearts","Diamonds","Clubs","Spades"};

    public Deck(){
        for(int y =0; y<=4 -1; y++) {
            if(y ==0) {
                for (int i = 1; i <= 13; i++) {
                    Card c = new Card(i, face[y]);
                    Cards.add(c);

                }
            }
            if(y == 1){
                for (int i = 1; i <= 13; i++) {
                    Card c = new Card(i, face[y]);
                    Cards.add(c);

                }
            }
            if(y == 2){
                for (int i = 1; i <= 13 ; i++) {
                    Card c = new Card(i, face[y]);
                    Cards.add(c);

                }

            }
            if(y == 3){
                for (int i = 1; i <= 13 ; i++) {
                    Card c = new Card(i, face[y]);
                    Cards.add(c);

                }
            }
        }

    }
    public void shuffle(){
        Collections.shuffle(Cards);

    }


    public String toString(){
            return Cards.toString();

    }
}
