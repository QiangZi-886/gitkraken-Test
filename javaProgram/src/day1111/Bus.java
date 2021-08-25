package day1111;

public class Bus extends MotoVehicle{

    private int seatcount;//Bus特有的一个属性,租赁数量

    public Bus(){

    }

    public Bus(int no,String brand,int seatcount) {
        super(no,brand);
        this.seatcount = seatcount;
    }

    public void setSeatcount(int seatcount){
        this.seatcount = seatcount;
    }

    public int getSeatcount(){
        return seatcount;
    }

    @Override
    public int calcRent(int day) {
        if (seatcount>16){
            return 1500*day;
        }else{
            return 800*day;
        }
    }
}
