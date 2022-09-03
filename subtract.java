public class subtract {
    public static void main(String[] args) {
//        subtractProductAndSum(254);
        int n = 134;
        int rem = 0;
        int answer = 1;
        int answer2 = 0;
        int aa = 0;
        while (n != 0) {
            rem = n % 10;
            answer = answer*rem;
            answer2 = answer2+rem;
            aa = answer - answer2;
            n = n / 10;

        }System.out.println(aa);
//        for (int i = 0; i < String.valueOf(n).length(); i++) {
//            rem = n % 10;
//            answer = answer*rem;
//            answer2 = answer2+rem;
//            aa = answer - answer2;
//            n = n / 10;
//        }
//        System.out.println(aa);
//        return aa;
    }
//    class Solution {
//        public int subtractProductAndSum(int n) {
//            int rem = 0;
//            int answer = 0;
//            int answer2 = 0;
//            int aa = 0;
//            for (int i = 0; i < n; i++) {
//                rem = n % 10;
//                answer *= rem;
//                answer2 += rem;
//                aa = answer - answer2;
//            }
//            System.out.println(aa);
//            return aa;
//        }
//
//    }
}
