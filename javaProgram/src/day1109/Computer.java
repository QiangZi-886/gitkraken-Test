package day1109;

public class Computer {
    public static void main(String[] args) {
        A3Paper a3=new A3Paper();
        BlackInkBox black=new BlackInkBox();

        Printer printer=new Printer(a3,black);
        printer.print();
        A4Paper a4=new A4Paper();
        ColorInkBox color = new ColorInkBox();
        Printer printer1 = new Printer(a4,color);
        printer1.print();
    }
}
