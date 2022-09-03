public class KunalDays {
    public static void main(String[] args) {
        int day = 31;
        int kunal = 7;
        int ii = 0;
        for (int i = 1; i <= day; i++) {
            if (i % 2 == 0) {
                ii++;
                System.out.println(i);
            }
        }

        System.out.println(ii);
    }
}
