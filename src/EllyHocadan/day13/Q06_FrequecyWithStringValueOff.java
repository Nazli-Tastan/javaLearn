package EllyHocadan.day13;

public class Q06_FrequecyWithStringValueOff {
      /*
Count the frequency of the letters in a given String as the format below:
Input: String str = "Java is so Good";
Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
 */

    /*
     Count the frequency of the letters in a given String as the format below:
     Input: String str = "Java is so Good";
     Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
      */
    public static void main(String[] args) {
        String str = "Java is so Good";
        String strOutputu = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (!strOutputu.contains(String.valueOf(str.charAt(i)))) { //char olan karakteri String e donsuturduk
                strOutputu += "" + str.charAt(i) + counter + " ";
            }
        }
        System.out.println(strOutputu);
    }

}



