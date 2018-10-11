import java.util.Random;
import java.util.Random.*;


public class DiceRoll{
public void simulate(int rolls) {
    Random rand = new Random();
    int [] counts = new int [13]; //to use from 0 ~ 12;

    for(int i = 0; i < rolls; i++) {
        int d1 = rand.nextInt(6) + 1;
        int d2 = rand.nextInt(6) + 1;
        System.out.println("rolls is " + d1 + "+" + d2 + "=" (d1+d2));
        counts[d1+d2] += 1;
    }
    for(int i =2; i <= 12; k++) {
    System.out.println(k + "'s=\t" + counts[k] + "\t" + 100.0 * counts[k]/rolls);   
        }
}
}