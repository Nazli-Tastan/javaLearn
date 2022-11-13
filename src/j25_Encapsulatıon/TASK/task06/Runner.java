package j25_Encapsulatıon.TASK.task06;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("ismini giriniz");
        scan.next();
      String name= scan.nextLine();


        System.out.println("üyelığini seç:\n1-Gold \n2-Silver\n 3-Bronz");
        String whichMember= scan.nextLine();

        System.out.println("Abonelik istiyor musunuz");
        System.out.println();
        boolean doYouWanaSubscribe= scan.nextBoolean();



      Subscribe sub=new Subscribe(name,doYouWanaSubscribe,whichMember);
      sub.setName(name);
      sub.setDoYouWanaSubscribe(doYouWanaSubscribe);
      sub.setWhichMember(whichMember);

      if(sub.isDoYouWanaSubscribe()==true){
          if(sub.getWhichMember().equals("Gold")){
              System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,\n" +
                      "    all homework and see you soon.");
          }
          if(sub.getWhichMember().equals("Silver")) {
              System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the .");

          }
          if(sub.getWhichMember().equals("Bronze")) {
              System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.");
          }

      }
      else{
          System.out.println("See you when you want to be a member. Thanks");
      }


    }

    }