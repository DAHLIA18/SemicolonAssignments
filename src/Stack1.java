import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {

        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Candy Rush");
        games.add("Temple Hill");

        System.out.println(games.pop());
        System.out.println(games.pop());
        System.out.println(games.pop());

        System.out.println(games);


    }
}