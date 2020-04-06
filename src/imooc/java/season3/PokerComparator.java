package imooc.java.season3;

import java.util.Arrays;
import java.util.Comparator;

public class PokerComparator implements Comparator<Poker> {

	@Override
	public int compare(Poker o1, Poker o2) {
		// TODO Auto-generated method stub
		return o1.cardValue-o2.cardValue;
	}

}
