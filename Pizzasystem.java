import java.util.Scanner;

public class Pizzasystem {
    static int pepporoni = 0;
    static int chicken = 0;
    static int extraCheese = 0;
    static int buttonMushroom = 0;
    static int creminiMushroom = 0;
    static int spinach = 0;
    static int olives = 0;

    public static void main(String[] args) {
        int orderArray [] = new int [8];
        String lastDes;
        int saleNumber = 0;
         int max1 = 0 ;
        int popular = 0;
        String top;

        do {
            String pizzasize, basesize;
            int i = 0;
            boolean register;
            Scanner input = new Scanner(System.in);
            System.out.println("*Welcome to Dons Pizza Service*");
            System.out.println("select pizza size");
            System.out.println("Small pizza = 1");
            System.out.println("Medium pizza = 2");
            System.out.println("Large pizza = 3");
            int size = input.nextInt();
            if (size == 1) {
                pizzasize = "small pizza";
                System.out.println("selected= Small pizza");
            } else if (size == 2) {
                pizzasize = "medium pizza";
                System.out.println("selected= medium pizza");
            } else {
                System.out.println("selected= large pizza");
            }
            System.out.println("Enter which type of pizza you need");
            System.out.println("thin base = 1");
            System.out.println("thick base = 2");
            int base = input.nextInt();

            if (base == 1) {
                System.out.println("selected= thin base");
                ;

            } else if (base == 2) {
                System.out.println("selected= thick base");
            }
            while (i < 3) {
                System.out.println("Enter which type of toppings do you need");
                System.out.println("Pepporoni = 1");
                System.out.println("Chicken = 2");
                System.out.println("extra cheese = 3");
                System.out.println("button mushroom=4");
                System.out.println("cremini mushroom=5");
                System.out.println("Spinach= 6");
                System.out.println("Olives = 7");
                int toppings = input.nextInt();
                if (toppings == 1) {
                    pepporoni++;
                    top = "pepporoni";
                } else if (toppings == 2) {
                    chicken++;
                    top = "chicken";
                } else if (toppings == 3) {
                    extraCheese++;
                    top = "extra cheese";
                } else if (toppings == 4) {
                    buttonMushroom++;
                    top = "you selected button mushrooms for your topping";
                } else if (toppings == 5) {
                    creminiMushroom++;
                    top = "you selected button cremini for your topping";
                } else if (toppings == 6) {
                    spinach++;
                    top = "you selected button spinach for your topping";
                } else if (toppings == 7) {
                    olives++;
                    top = "you selected olives for your topping";

                   // System.out.println("You recieved cheese and tomato toppings and " + top + "to your pizza");

                }

                i++;
                

            orderArray[0] = pepporoni;
            orderArray[1] = chicken;
            orderArray[2] = extraCheese;
            orderArray[3] = buttonMushroom;
            orderArray[4] = creminiMushroom;
            orderArray[5] = creminiMushroom;
            orderArray[6] = spinach;
            orderArray[7] = olives;

            for (int j = 0; j<8 ; j++){
                if (orderArray[j] > max1){
                    max1 = orderArray[j];
                }
            }



             if (max1 == pepporoni){
                 System.out.println("Most popular Topping : pepperoni");
             }else if (max1 == chicken){
                 System.out.println("Most popular Topping : Chicken");
             }else if (max1 == extraCheese){
                 System.out.println("Most popular Topping : Extra Cheese");
             }else if (max1 == buttonMushroom){
                 System.out.println("Most popular Topping : Button mushroom");
             }else if (max1 == creminiMushroom){
                 System.out.println("Most popular Topping : cremini mushroom");
             }else if (max1 == spinach){
                 System.out.println("Most popular Topping : Spinach");
             }else if(max1 == olives){
                 System.out.println("Most popular Topping : Olives");
             }
                System.out.println("");


            }

            System.out.println("Enter confirm-1 of Retrail-0");
            int des = input.nextInt();
            System.out.println("Confirm=1");
            System.out.println("Revoke=0");
            if (des == 1) {
                System.out.println("your order is confirmed");
                saleNumber++;
            } else if (des == 0) {
                System.out.println("Your order is retrailed");
            }
            System.out.println("");
            System.out.println("Total Orders : "+saleNumber);
            System.out.println("");




            System.out.print("Do you need another ?(y/n) : ");
            lastDes = input.next();
        }while (lastDes.equals("y"));

    }
}





Group Members
1.Kirulu Chamupathi - D/ICT/22/0008
2.Binupa Iduwara - D/ICT/22/0010
3.Heshan Kanishka - D/ICT/22/0011
4.Nethmina Damsara - D/ICT/22/0014
5.Kaveeja Wijayarathna - D/ICT/22/0032
