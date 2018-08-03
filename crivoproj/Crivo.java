import java.util.Vector;
import java.util.Arrays;
import java.lang.Math;

public class Crivo {
    public static final int MAX = (int) Math.pow(10, 3);
    public static void main(String[] args) {
        boolean[] table = new boolean[MAX];
        Arrays.fill(table, true);
        Vector<Integer> resp = new Vector<Integer>();

        for(int i = 2; i < MAX; i++) {
            if(table[i] == true) {
                resp.add(i);
                //System.out.println(i);
                for(int j = i; j < MAX; j = j + i) table[j] = false;
            }
        }
    }
}
