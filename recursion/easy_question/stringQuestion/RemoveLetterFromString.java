package recursion.easy_question.stringQuestion;

public class RemoveLetterFromString {

    static void stringRemove(String str, char ele) {
        System.out.println(helper(str, ele, 0));
    }


    static StringBuilder helper(String str, char ele, int i) {
        StringBuilder WithOutElement = new StringBuilder();

        if (i == str.length()) {
            return WithOutElement;
        }

        if (!(str.charAt(i) == ele)) {
            WithOutElement.append(str.charAt(i));
        }

        StringBuilder st = helper(str, ele, ++i);  // collect all the letter from upperCall
        WithOutElement.append(st);                 // adding in the main String builder

        return WithOutElement;                    // return
    }


    public static void main(String[] args) {
        String str = "Raushan";
        stringRemove(str, 'a');
    }
}
