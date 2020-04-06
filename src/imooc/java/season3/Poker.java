package imooc.java.season3;

import java.util.Arrays;
import java.util.List;

public class Poker{
	final static String[] colors = { "∫⁄Ã“", "∫ÏÃ“", "√∑ª®", "∑Ω∆¨" };
	final static String[] points = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
	final static List<String> colorsList = Arrays.asList(colors);
	final static  List<String> pointsList = Arrays.asList(points);
	String color;
    String point;  
    int cardValue;
   Poker(String color,String point){
	   this.color = color;
	   this.point = point;
	   this.cardValue = pointsList.indexOf(point)*10 + colorsList.indexOf(color);

   }
}
