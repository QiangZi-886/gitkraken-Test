package day1115;

public class Book extends Media{

    public Book(String name,int number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return "name:"+name+"\tnumber:"+number;
    }
}

