package day1115;


// import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {
    public static void main(String[] args) {
        int numHands = Integer.parseInt(args[0] = "2");
        int cardsPerHand=Integer.parseInt(args[1]="5");
        //生成一副牌
        String[] rank=new String[]{
                "ace","2","3","4","5","6","7","8","9","10","jack","queen","king"
        };
        List<String> deck=new ArrayList<String>();
        //遍历枚举类型，并且将枚举类型名字存储到集合里
        for(Meiju ss:Meiju.values())
            for(String sr:rank)
                deck.add(sr+"  of  "+ss.name());
        Collections.shuffle(deck);
        for(int i=0;i<numHands;i++) {
            System.out.println();
            System.out.println("********************************************");
            System.out.println(dealHand(deck,cardsPerHand));
        }
    }
    public static List dealHand(List<String>deck,int n)	{
        int deckSize=deck.size();
        //从deck中截取一个子链表
        List<String> handView=deck.subList(deckSize-n, deckSize);
        List<String> hand=new ArrayList<String>(handView);
        handView.clear();
        return hand;

    }
}

