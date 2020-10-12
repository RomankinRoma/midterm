import MedCenter.ASAP;
import MedCenter.MedCenter;
import MedCenter.SNAKE;
import builder.Order;
import builder.OrderFactory;
import observable.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu=new Menu();
        OrderFactory orderFactory = new OrderFactory();
        Integer chose=-1;
        User user=new User(1,"Asdsd ada","12.12.12",new ArrayList<>(),new ArrayList<>());
        menu.getUserList().add(user);
        menu.getMedCenters().add(new ASAP());
        menu.getMedCenters().add(new SNAKE());

        Integer userID=1;

        while (chose!=0){
            System.out.println("");
            System.out.println("1.Add user");
            System.out.println("2.Make order");
            System.out.println("3.Delete order");
            System.out.println("4.Get orders");
            System.out.println("5.Get results");
            System.out.println("6.Check current account");
            System.out.println("7.Change account");
            System.out.println("8.Subscribe");
            System.out.println("9.Payment");
            System.out.println("0.Exit");
            chose=in.nextInt();
            switch (chose){
                case 1:
                    menu.addUser();
                    break;
                case 2:
                    menu.makeOrder(userID);
                    break;
                case 3:
                    menu.deleteOrder(userID);
                    break;
                case 4:
                    menu.getOrders(userID);
                    break;
                case 5:
                    menu.getResults(userID);
                    break;
                case 6:
                    menu.checkAcc(userID);
                    break;
                case 7:
                    menu.getUsers();
                    System.out.println("Choose your id:");
                    userID=in.nextInt();
                    break;
                case 8:
                    menu.subscribe(userID);
                    break;
                case 9:
                    menu.payment(userID);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect choise!");
                    break;

            }
        }
   }
}
