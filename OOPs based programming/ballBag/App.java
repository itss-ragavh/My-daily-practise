import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Tennis t = new Tennis(3);
        BaskatBall bb = new BaskatBall(10);

        Bag bag = new Bag();

        boolean flag = true;

        do {
            System.out.println("1.Add Ball \n2.Remove Ball\n3.Is Bag Empty\n4.Show Game\n5.Exit");
            System.out.print("Enter the Input : ");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    if(bag.isBagEmpty()){
                        switch (display()) {
                            case 1:{
                                bag.addBall(t);
                                break;}
                            case 2:{
                                bag.addBall(bb);
                                break;}
                            default:
                            System.out.println("\t\t\tInvalid Input");
                                break;
                        }
                    }
                    else{
                        System.out.println("\t\t\tBag is Already contain ball");
                    }
                    break;}
                case 2:{
                    bag.removeBall();
                    break;}
                case 3:{
                    System.out.println(bag.isBagEmpty()?"\t\t\tYes empty":"\t\t\tNo Bag is Not empty");
                    break;}
                case 4:{
                    System.out.println("\t\t\tplaying "+bag.showGame());
                    break;}
                case 5:{
                    flag = false;
                    break;}
                default:{
                    System.out.println("\t\t\tInvalid Input");
                    break;
                }
            }
        } while (flag);
    }

    public static int display(){
        System.out.println("Select one \n1.Tennis\n2.Baskat Ball");
        System.out.print("Enter the input : ");
        return sc.nextInt();
    }
}
