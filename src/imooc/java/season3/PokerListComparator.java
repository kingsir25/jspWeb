package imooc.java.season3;

import java.util.Collections;
import java.util.Comparator;

public class PokerListComparator implements Comparator<PokerList> {

	@Override
	public int compare(PokerList o1, PokerList o2) {
		// TODO Auto-generated method stub
		int Asize = o1.cardsList.size();
		
		int Bsize =o2.cardsList.size();
		int Ai =0;
		int Bi =0;
		Collections.sort(o1.cardsList,new PokerComparator());
		Collections.reverse(o1.cardsList);
		Collections.sort(o2.cardsList,new PokerComparator());
		Collections.reverse(o2.cardsList);
		
		int rst = o1.cardsList.get(Ai).cardValue - o2.cardsList.get(Bi).cardValue;
		while(Ai<Asize && Bi<Bsize &&  rst ==0) {
			Ai=Ai+1;
			Bi=Bi+1;
			rst = o1.cardsList.get(Ai).cardValue - o2.cardsList.get(Bi).cardValue;
		}
		return rst;
	}

}
