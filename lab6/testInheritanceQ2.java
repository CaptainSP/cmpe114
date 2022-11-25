
public class testInheritanceQ2 {

    public static void main(String[] args) {
        Material m1 = new Material();
        Book b1=new Book();
        Journal j1=new Journal();
        Material m2 = new Material();
        Book b2=new Book();
        Journal j2=new Journal();

        m1.setNumberOfPages(80);
        b1.setNumberOfPages(100);
        j1.setNumberOfPages(40);
        m1.setNumberOfPages(80);
        b1.setNumberOfPages(50);
        j1.setNumberOfPages(40);

        m1.setPagePrice(2);
        b1.setPagePrice(1);
        j1.setPagePrice(5);
        m2.setPagePrice(2);
        b2.setPagePrice(1.5);
        j2.setPagePrice(4.75);

        b1.setStartingPrice(10);
        j1.setStartingPrice(15);



        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(b1.toString());
        System.out.println(j1.toString());
        System.out.println(m1.equals(m2));
        System.out.println(b1.equals(b1));
        System.out.println(b1.equals(b2));
        System.out.println(j1.equals(j1));
        System.out.println(j1.equals(j2));





    }

}