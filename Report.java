package Lec10_Abstraction.PrintableInterface;
public class Report implements Printable{
    private String title;
    public Report(String title) {
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("Title : " + this.title);
    }
}
