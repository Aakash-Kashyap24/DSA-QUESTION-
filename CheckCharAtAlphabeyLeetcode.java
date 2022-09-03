public class CheckCharAtAlphabeyLeetcode {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelaydog";
        String sen=  "abcdefghijklmnopqrstuvwxyz";
        int y = 0;
        for (char c = 'a'; c <= 'z'; c++) {

            if (!sentence.contains(c + "")) {

                System.out.println(false);
            }
        }
        System.out.println(true);


    }
}
