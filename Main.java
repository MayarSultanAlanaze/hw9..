// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book M=new Book("mayar",2.9,"arwa");
        System.out.println(M.getName());
        System.out.println(M.getPrice());
        System.out.println(M.getAuthor());
        M.getDiscount();

        Movie n=new Movie("maha",4.8,"mohamed");
        System.out.println(n.getName());
        System.out.println(n.getPrice());
        System.out.println(n.getdirector());

    }
}