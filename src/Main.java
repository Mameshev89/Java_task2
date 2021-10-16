public class Main {
    public static void main(String[] args) {
        int sumOffTikket = 360;
        int bonusMiles;
        int saveSum = 20;
        if (sumOffTikket >= saveSum) {
            bonusMiles = sumOffTikket / saveSum;
            System.out.println(bonusMiles);
        } else {
            bonusMiles = 0;
            System.out.println(bonusMiles);
        }
    }
}
