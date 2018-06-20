import java.util.Random;

public class TabLosLiczb {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random rand = new Random(10);
        for(int liczba=0;liczba<10;liczba++) {
            tab[liczba] = rand.nextInt(100);
        }
        int a =9;
        for (int i = 0; i < 21; i++) {

            if(i<10) {
                System.out.print(tab[i] + " ");
            }
            else if (i>10) {
                System.out.print(tab[a] + " ");
                a-=1;
            }
        }
    }
}