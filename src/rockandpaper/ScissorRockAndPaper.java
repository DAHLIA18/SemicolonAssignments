package rockandpaper;
import java.util.Scanner;
public class ScissorRockAndPaper {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter player one name: ");
            String playerOneName = input.nextLine();

            System.out.println("Enter player two name: ");
            String playerTwoName = input.nextLine();

            System.out.println("Jennifer enter a number 0, 1 or 2: ");
            System.out.println("Ky enter a number 0, 1 or 2: ");

            int Jennifer = input.nextInt();
            int Ky = input.nextInt();

            int ky = 0;
            if (Jennifer == ky){
                System.out.print("it's a draw!");
            }else if (Jennifer > Ky){
                System.out.print("Jennifer Won Ky!! ");
            }else {System.out.print("Ky Won Jennifer!! ");
            }

        }

    }
