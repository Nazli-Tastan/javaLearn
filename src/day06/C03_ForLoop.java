package day06;

public class C03_ForLoop {
    public static void main(String[] args) {
        //Convert "Java" TO "J*a*v*a*"
        /*ForLoop
        print even number from 100to 0 but not use decrement i--
        INPUT:
        OUTPUT:100 98 96 ...2 0
         */

  String str="java";
  for (int i= 0; i <str.length(); i++){
      System.out.println(str.charAt(i)+"*");
  }
  int num=100;
  for(int i=100; i>=0; i-=2){//i-=2 ya da i=i-2
      System.out.print(" "+i);
    }
}






    }

