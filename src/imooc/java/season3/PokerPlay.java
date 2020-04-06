package imooc.java.season3;

import java.util.Collections;

public class PokerPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       List<Poker> playerACards = new ArrayList<Poker>();
//       List<Poker> playerBCards = new ArrayList<Poker>();
       PokerList pl = new PokerList();
       PokerList playA = new PokerList();
       PokerList playB = new PokerList();
       System.out.println("��ʼϴ��------");
       pl.shuffle(52);
       pl.printCards();
       
       System.out.println("��ʼ����------");
       int i = 0;
       playA.cardsList.add(pl.cardsList.get(i));
       i=i+1;
       playB.cardsList.add(pl.cardsList.get(i));
       i=i+1;
       playA.cardsList.add(pl.cardsList.get(i));
       i=i+1;
       playB.cardsList.add(pl.cardsList.get(i));
       i=i+1;
       System.out.println("\nA��ҳ���------");
       playA.printCards();
       System.out.println("\nB��ҳ���------");
       playB.printCards();
       System.out.println("\n�������------");
       int cmp = PokerPlay.compare(playA,playB);
       if (cmp<0) {
    	       	   System.out.println("A��һ�ʤ");
       }else {    
        	   System.out.println("B��һ�ʤ");
       }
       
	}
	
	public static int compare(PokerList o1, PokerList o2) {
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
