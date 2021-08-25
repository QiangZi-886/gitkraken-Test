package day1115;

public class Video extends Media{


    public Video(String name,int number){
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return "name:"+name+"\tnumber:"+number;
    }
}

