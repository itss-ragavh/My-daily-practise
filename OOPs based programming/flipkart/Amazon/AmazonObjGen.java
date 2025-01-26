import java.util.*;

class AmazonObjGen {
    static Amazon product1 = new Amazon(1, "laptop   ", 30000);
    static Amazon product2 = new Amazon(2, "mobile   ", 20000);
    static Amazon product3 = new Amazon(3, "pendrive ", 500);
    static Amazon product4 = new Amazon(4, "tablet    ", 10000);
    static Amazon product5 = new Amazon(5, "ssd 1 tb  ", 6000);
    static Amazon[] products = { product1, product2, product3, product4, product5 };
    static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) throws Exception {
        boolean flag = true;
        do {
            System.out.println("1.List products\n2.Price low to high\n3.Price high to low\n4.exit");
            System.out.print("Enter the Option : ");
            int input = sc.nextInt();
            Thread.sleep(2000);
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
                    System.out.println("Invalid Input");
                    break;
                } // exit
            }
        } while (flag);

    }

    public static void objBubbleSort(Amazon[] products, boolean flag) {
        if (flag) {
            for (int i = 0; i < products.length; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[i].getPrice() < products[j].getPrice()) {
                        Amazon temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < products.length; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[i].getPrice() > products[j].getPrice()) {
                        Amazon temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }
                }
            }
        }
    }
    public static void idSort(Amazon [] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].getPid() > products[j].getPid()) {
                    Amazon temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
    }

    public static void print() {
        System.out.println("----------------------");
        System.out.println("Id\tProductName\tprice");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getPid() + "\t" + products[i].getPname() + "\t" + products[i].getPrice());
        }
        System.out.println("----------------------");
    }

}
