package Lec10_Abstraction.PrintableInterface;
public class Processor {
    public static void main(String[] args) {
        Printable p = new Report("Hello world :))");
        p.print();
    }
}
