import java.util.Random;

public class TabLosLiczb {
    public static void main(String[] args) {

        int[] tab = new int[10];
        for(int i=0; i<tab.length; i++) {
            Random rand = new Random();
            tab[i] = rand.nextInt(10);
            System.out.println(tab[i]);
        }
        for(int x=tab.length-1;x>0;x--){
            System.out.println(tab[x]);
        }
    }


}
