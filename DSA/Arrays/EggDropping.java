//Egg Drop With 2 Eggs and N Floors

import java.util.*;

public class EggDropping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int move = 0;
        int total = 0;

        while (total < n) {
            move++;
            total += move;
        }

        System.out.println(move);
    }
}
