import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to game");
        String mymove;
        while (true) {
            System.out.println("Press : stone , paper, scissor as input Or to quit press :Quit ");
            mymove = scan.next();
            if (mymove.equals("Quit")) {
                System.out.println("Thank you for playing");
                break;
            }
            if (!mymove.equals("stone") && !mymove.equals("paper") && !mymove.equals("scissor")) {
                System.out.println("Invalid move");
            }
            else {
                int random = (int) (Math.random() * 3);
                String Opponentmove = "";
                if (random == 0) {
                    Opponentmove = "stone";
                } else if (random == 1) {
                    Opponentmove = "paper";
                } else {
                    Opponentmove = "scissor";
                }//rock>Scissor , Scissor>Paper, Paper>Rock

                System.out.println("Opponent move : " + Opponentmove);

                if (mymove.equals(Opponentmove)) {
                    System.out.println("This is a tie");
                } else if (mymove.equals("stone") && Opponentmove.equals("scissor") || mymove.equals("scissor") && Opponentmove.equals("paper") || mymove.equals("paper") && Opponentmove.equals("stone")) {
                    System.out.println("You won");
                } else {
                    System.out.println("You lose");
                }
            }
        }
    }
}
