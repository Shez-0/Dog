import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog [] pack = new Dog[5];

        Dog a = new Dog("Luna", 13, 40.0);
        Dog b = new Dog("Bryce", 0, 39.0);
        Dog c = new Dog("Thryce", 13, 2.3);
        Dog d = new Dog("Vice", 5, 99.3);
        Dog e = new Dog("Slice", 13, 47.3);

        pack[0] = a;
        pack[1] = b;
        pack[2] = c;
        pack[3] = d;
        pack[4] = e;

        Arrays.sort(pack);

        for(int i = 0; i < pack.length; i++) {
            System.out.println(pack[i]);
        }
    }


}