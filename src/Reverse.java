import java.util.Scanner;

import static java.lang.Math.random;

public class Reverse {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the game");
String Mymove;
while(true){
    System.out.println("Please press : stone, paper, scissor OR Press quit");
   Mymove =  scan.next();
    if (Mymove.equals("quit"))
    {System.out.println("Thanks for playing");
    break;}
    if (!Mymove.equals("stone") && !Mymove.equals("paper") && !Mymove.equals("scissor"))
    {
        System.out.println("Invalid move");
    }
    else {
        int random = (int) (Math.random() * 3);
        String Opponentmove = " ";
        if (random == 0) {
            Opponentmove = "stone";
        } else if (random == 1) {
            Opponentmove = "paper";
        } else {
            Opponentmove = "scissor";
        }

        System.out.println("OpponentMove = " + Opponentmove);
        if (Mymove.equals(Opponentmove))
        {
            System.out.println("Game tied");
        }
        else if (Mymove.equals("rock") && Opponentmove.equals("scissor") || Mymove.equals("scissor") && Opponentmove.equals("paper") || Mymove.equals("paper") && Opponentmove.equals("stone"))
        {
            System.out.println("You Won");
        }
else {
            System.out.println("You loose");
        }

    }
}
    }}