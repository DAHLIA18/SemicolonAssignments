package segment;

import java.util.Arrays;
import java.util.*;

public class SevenSegment {
    private static final int[][] segment = new int[5][4];

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        System.out.println("Enter digit");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

       inputValue(value);
        display();
    }

    static void fillA() throws InterruptedException{
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;
    }
    static void fillB() throws InterruptedException{
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;

    }
    static void fillC() throws InterruptedException{
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    static void fillD() throws InterruptedException{
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    static void fillE()throws InterruptedException{
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }

    static void fillF()throws InterruptedException{
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    static void fillG()throws InterruptedException{
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }

    static void display() throws InterruptedException{
        for (int[] i : segment){
            for (int j : i){
                if (j == 1){
                    System.out.print("* ");
                } else
                    System.out.print("  ");
                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    static void inputValue(String value) throws IllegalAccessError, InterruptedException, IllegalAccessException {
        if (value.length() > 9){
            value = value.substring(0, 9);
        }

        char[] array = value.toCharArray();
        for (char i : array){
            if (!(i== '1' || i == '0')){
                throw new IllegalAccessException("Input Must be 1 or 0");
            }
        }

        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) == '1' && value.charAt(7) == '1'){
                switch (i){
                    case 0-> fillA();
                    case 1-> fillB();
                    case 2-> fillC();
                    case 3-> fillD();
                    case 4-> fillE();
                    case 5-> fillF();
                    case 6-> fillG();
                }
            }
        }
    }
}