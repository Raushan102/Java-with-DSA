package recursion.easy_question.stringQuestion;

public class DicePermutation {
    public static void main(String[] args) {
        dicePermutation("",4);
    }

    static  void dicePermutation(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target  && i <= 6;i++){
            dicePermutation(p+i,target-i);
        }
    }
}
