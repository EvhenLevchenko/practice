package labwork134;

public class Main {
    public static void main(String[] args) {
        final int STANDART=52;

        Card[] cards=new Card[STANDART];
        int i=0;
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                cards[i++]=new Card(suit,rank);
            }
        }
        for(int j=0;j<cards.length;j++){
            System.out.println(cards[j]);
        }
    }
}
