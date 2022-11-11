package Müsvedde;

public class C05 {
    @Override
    public String toString() {
        return "C05{}";
    }

    public static void main(String[] args) {

    String s="hello";
    StringBuilder sb=new StringBuilder();
    sb.reverse();


    if (s==sb.toString()){
        System.out.println("Equal");

    } else
        System.out.println("Not equal");



    }
}
