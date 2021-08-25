package day1115;

import java.util.*;

public class Test {
    public static void main(String[] args){
        List list = new ArrayList();
        Video video1 = new Video("小狗波西",5);
        Video video2 = new Video("刘华胜干饭王",6);
        Book book1 = new Book("波西崛起自传",4);
        Book book2 = new Book("刘珂舞蹈大全",6);
        Newspaper n1 = new Newspaper("人民日报",2);


        list.add(video1);
        list.add(video2);

        //System.out.println(list);

        list.add(book1);
        list.add(book2);

        //System.out.println(list);

        list.add(n1);


        //遍历

        System.out.println(list);
        ListIterator iterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}

