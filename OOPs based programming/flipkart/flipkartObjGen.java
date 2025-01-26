
import java.util.*;

class flipkartObjGen {
    static flipkart product1 = new flipkart(1, "xiaomi civi 14 Mobile", 45000);
    static flipkart product2 = new flipkart(2, "HP Intel core 15 Laptop", 47990);
    static flipkart product3 = new flipkart(3, "Gemma Mattress         ", 12629);
    static flipkart product4 = new flipkart(4, "TVS Raider Bike        ", 108016);
    static flipkart product5 = new flipkart(5, "Thar model  [Toy]      ", 1100);
    static flipkart[] products = { product1, product2, product3, product4, product5 };
    static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) throws Exception {
        boolean flag = true;
        do {
			System.out.println("\n\t\tWelcome to flipkart\n");
            System.out.println("\t1.Products Available\n\n\t2.Price high to low\n\n\t3.Price low to high\n\n\t4.exit");
			System.out.println("\n");
            System.out.print("\t\tEnter the Option : ");
            int input = sc.nextInt();
            Thread.sleep(2000);
			System.out.println("\n");
            switch (input) {
                case 1: {
                    idSort(products);
                    print();
                    break;
                } // list

                case 2: {
                    objBubbleSort(products, true);
                    print();
                    break;
                } // low to high
                
                case 3: {
                    objBubbleSort(products, false);
                    print();
                    break;
                } // high to low
                
                case 4: {
                    flag = false;
                    break;
                } // exit
                
                default: {
                    System.out.println("\t===========Invalid Input===========");
                    break;
                } // exit
            }
        } while (flag);
		System.out.println("\tThank you for visiting ==>flipkart<== \n\t\tSee You Soon..");
    }

    public static void objBubbleSort(flipkart[] products, boolean flag) {
        if (flag) {
            for (int i = 0; i < products.length; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[i].getPrice() < products[j].getPrice()) {
                        flipkart temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < products.length; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[i].getPrice() > products[j].getPrice()) {
                        flipkart temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }
                }
            }
        }
    }
    public static void idSort(flipkart [] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].getPid() > products[j].getPid()) {
                    flipkart temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
    }

    public static void print() {
        System.out.println("\t\t----------------------");
        System.out.println("\tId\tProduct_Name\t\tprice");
		System.out.println("\n");
		for (int i = 0; i < products.length; i++) {
            System.out.println("\t"+products[i].getPid() + "\t" + products[i].getPname() + "\t" + products[i].getPrice());
        }
        System.out.println("\n\t\t----------------------\n");
    }
}
