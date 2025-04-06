package recursion.medium;

public class DuplicateValue {

  public static StringBuilder removeDuplicate(String str, boolean AtoZ[], int i, StringBuilder newStr) {
    StringBuilder st = new StringBuilder(str);
//checking base case 
    if (i == st.length()) {
      return newStr;
    }
// fetching character from the string
    char ch = st.charAt(i);
// calculate the position of character 
    int charPosition = ch - 'a';
// check if character already exist or not if no append in newstr and make that position true in AtoZ array
    if (AtoZ[charPosition] != true) {
      newStr.append(ch);
      AtoZ[charPosition] = true;
      removeDuplicate(str, AtoZ, i + 1, newStr);
    }
    removeDuplicate(str, AtoZ, i + 1, newStr);
    return newStr;
  }

  public static void main(String[] args) {
    int i = 0;
    boolean[] arrAtoZ = new boolean[26];
    String str = "rauusshhaanzzddsfdsfdefdsfdsfdrtdfvdssds";
    StringBuilder newStr = new StringBuilder();
    String st = removeDuplicate(str, arrAtoZ, i, newStr).toString();
    System.out.println(st);

  }
}
