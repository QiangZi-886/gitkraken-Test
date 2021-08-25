package day1115;

public class Newspaper extends Media{

    public Newspaper(String name,int number){
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return "name:"+name+"\tnumber:"+number;
    }
}

