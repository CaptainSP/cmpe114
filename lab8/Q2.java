import java.util.ArrayList;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> BurgerQueen = new LinkedList<>();
        BurgerQueen.add("French fries");
        BurgerQueen.add("Big Queen");
        BurgerQueen.add("Truffle Queen");
        ArrayList<String> McJhonas = new ArrayList<>();

        McJhonas.add("Jho Fries");
        McJhonas.add("Jho Cheese");
        McJhonas.add("Double Jho");


        LinkedList<String> Arbies = new LinkedList<>();
        Arbies.addAll(BurgerQueen);
        Arbies.addAll(McJhonas);

        System.out.println("First Menu: " + Arbies);

        Arbies.push("Queen Jhonas”");
        Arbies.pollFirst();

        System.out.println("Menu Size: " + Arbies.size());

        Arbies.set(1,"Big Jho");
        System.out.println("4th Meal Is: " + Arbies.get(3));

        System.out.println("Last Meal Is: " + Arbies.peekLast());

        System.out.println("Final Menu: " + Arbies);


    }
}
