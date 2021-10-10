public class Main {
    public static void main(String[] args) {
        int sumofftikket = 360;
        int bonusmiles;
        int savesum = 20;
        if (sumofftikket >= savesum) {
            bonusmiles = sumofftikket / savesum;
            System.out.println(bonusmiles);
        } else {
            bonusmiles = 0;
            System.out.println(bonusmiles);
        }
    }
}
