public class Q01 {
    public static void main(String[] args) {
        System.out.println("ortak(\"bandana\",\"andac\") = " + ortak("badana", "adana"));
    }
    public static String ortak(String str1,String str2){
        String ortak="";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length(); j >i ; j--) {
                if (str2.contains(str1.substring(i,j))){
                    ortak=str1.substring(i,j).length()>ortak.length()?str1.substring(i,j):ortak;
                }
            }
        }
        return ortak.length()==0?"Stringinizin icinde ortak bir substring yoktur":ortak;
    }




    }

