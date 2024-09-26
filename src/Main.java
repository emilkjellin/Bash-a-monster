import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Bash a monster sigma!");
        Character c1 = new Character();
        c1.character_hp = 100;

        System.out.println("player_1 hp: " + c1.character_hp);

        Character c2 = new Character();
        c2.character_hp = 100;

        System.out.println("player_2 hp: " + c2.character_hp);




            System.out.println("player_1 hp: " + c1.character_hp);
            System.out.println("player_2 hp: " + c2.character_hp);

while (c1.character_hp > 0 && c2.character_hp > 0 )
{
    System.out.println("player_1 hp: " + c1.character_hp);
    System.out.println("player_2 hp: " + c2.character_hp);
    System.out.println("Vad vill du göra");
    System.out.println("1. Attackera");
    System.out.println("2. Heala");
    System.out.println();

    int choice = sc.nextInt();
    if (choice == 1) {
        System.out.println("player_1 slår player_2 och gör 10 skada");
        c2.changehp(-10);

    }
    else if (choice == 2){
        System.out.println("player_1 healar");
        c1.changehp(+20);
    }  else {
        continue;
    }
    choice = rand.nextInt(2);
    choice++;
    if (choice == 1){
        System.out.println("player_2 slår player_1 och gör 10 skada");
        c1.changehp(-10);
    }
     else if (choice == 2){
        System.out.println("player_2 healar");
        c2.changehp(+20);
    }





}





    }
}