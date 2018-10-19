package imooc.java.season3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerList {
	List<Poker> cardsList;
//	double ValueOfPokerList;
   PokerList(){
	   cardsList = new ArrayList<Poker>();
   }
	void shuffle(int size) {
		cardsList.clear();
		while (cardsList.size() < size) {
			int randColor = (int) (Math.random() * Poker.colorsList.size());
			int randPoint = (int) (Math.random() * Poker.pointsList.size());
//			System.out.println("randColor=" + randColor);
//			System.out.println("randPoint=" + randPoint);
			Poker poker = new Poker(Poker.colors[randColor], Poker.points[randPoint]);
			if(!cardsList.contains(poker)) {
				cardsList.add(poker);
			}
		}
	}
	
	void printCards() {
		for(Poker p:cardsList) {
			System.out.print(p.color+p.point +";");
		}
	}
	Poker getMax() {
	       Collections.sort(cardsList,new PokerComparator());
	       return cardsList.get(cardsList.size()-1);
	}
	
}
