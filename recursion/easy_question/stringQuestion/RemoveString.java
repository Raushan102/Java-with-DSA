package recursion.easy_question.stringQuestion;

public class RemoveString {

    public static void skipApple(String str, String removelString) {
        String st = "";
        System.out.println(helper(str, st, removelString));

    }

    private static String helper(String str, String st, String removelString) {

        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (str.startsWith(removelString)) {
            return helper(str.substring((removelString.length())), st, removelString);

        }

        return ch + helper(str.substring(1), st + str.charAt(0), removelString);

    }

    public static void main(String[] args) {
        String str = "Rausapplehan";
        skipApple(str, "apple");
    }
}
