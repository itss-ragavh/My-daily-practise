import java.util.*;

class Aadhar {
    static Scanner sc = new Scanner(System.in);
    // States
    private String name;
    private long aadhar_no;
    private long contact;
    private String address;

    // Constructor
    public Aadhar(String name, long aadhar_no, long contact, String address) {
        this.name = name;
        this.aadhar_no = aadhar_no;
        this.contact = contact;
        this.address = address;
    }

    // Behaviors (Getters)
    public String getName() {
        return name;
    }

    public long getAadharNo() {
        return aadhar_no;
    }

    public long getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    // Method for Verification
    public boolean doVerification() {
        System.out.print("\t\t\t\tEnter Registered Contact Number: ");
        long user_entered_contact = sc.nextLong();

        if (user_entered_contact == contact) {
            // Eligible for OTP generation
            int sys_otp = (int) (Math.random() * 9999 + 9999);  // Random OTP generation
            System.out.println("\t\t\t\tEnter OTP: "+sys_otp);
			System.out.print("\t\t\t\tEnter thr OTP :");
            int user_entered_otp = sc.nextInt();
            if (user_entered_otp == sys_otp) {
                return true;
            }
        }
        return false;
    }

    // Setters with Verification
    public void setName(String name) {
        if (doVerification()) {
            this.name = name;
            System.out.println("\t\t\t\tName Updated");
        } else {
            System.out.println("\t\t\t\tVerification Failed");
        }
    }

    public void setContact(long contact) {
        if (doVerification()) {
            this.contact = contact;
            System.out.println("\t\t\t\tContact Updated");
        } else {
            System.out.println("\t\t\t\tVerification Failed");
        }
    }

    public void setAddress(String address) {
        if (doVerification()) {
            this.address = address;
            System.out.println("\t\t\t\tAddress Updated");
        } else {
            System.out.println("\t\t\t\tVerification Failed");
        }
    }
}

class AadharPortal {
    static Scanner sc = new Scanner(System.in);

    // Sample Aadhar cards
    static Aadhar card1 = new Aadhar("Tabrez", 123456789L, 9876543210L, "London");
    static Aadhar card2 = new Aadhar("Shekar", 945235789L, 7545243210L, "Hyderabad");
    static Aadhar card3 = new Aadhar("Nagraj", 874126789L, 6521243210L, "Vizag");
    static Aadhar card4 = new Aadhar("Akanta", 754568975L, 8668143210L, "Tirupati");
    static Aadhar card5 = new Aadhar("Shambu", 100056789L, 7111110321L, "Hubli");

    // Aadhar cards array
    static Aadhar[] cards = { card1, card2, card3, card4, card5 };

    public static void main(String[] args) {
        boolean home_page = true;

        do {
            System.out.println("\n\n\t\t\tWelcome to Aadhar Portal ");
            System.out.println("\t1. Get Info\n\t2. Set Info\n\t3. Exit\n");
			System.out.print("\t\tEnter the choice (1-3) :");
			
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    getInfo();
                    break; // Get Info

                case 2:
                    setInfo();
                    break; // Set Info

                case 3:
                    home_page = false;
                    break; // Exit
            }
        } while (home_page);
        System.out.println("\t\t\t---Thank You For Using Aadhar Portal---");
    }

    // Method to get info
    public static void getInfo() {
        System.out.print("\t\t\tEnter Aadhar Number to retrieve Info: ");
        long aadhar_number = sc.nextLong();

        Aadhar foundCard = null;
        for (Aadhar card : cards) {
            if (card.getAadharNo() == aadhar_number) {
                foundCard = card;
                break;
            }
        }

        if (foundCard != null) {
            System.out.println("\n\t\t\tAadhar Details: ");
            System.out.println("\t\t\t\tName: " + foundCard.getName());
            System.out.println("\t\t\t\tAadhar Number: " + foundCard.getAadharNo());
            System.out.println("\t\t\t\tContact: " + foundCard.getContact());
            System.out.println("\t\t\t\tAddress: " + foundCard.getAddress());
			System.out.println("\t\t\t----------------------------------\n");
        } else {
            System.out.println("\t\t\tNo Aadhar card found with the provided number.\n	");
        }
    }

    // Method to set info
    public static void setInfo() {
        System.out.print("\t\t\tEnter Aadhar Number to update Info: ");
        long aadhar_number = sc.nextLong();

        Aadhar foundCard = null;
        for (Aadhar card : cards) {
            if (card.getAadharNo() == aadhar_number) {
                foundCard = card;
                break;
            }
        }

        if (foundCard != null) {
            System.out.println("\tWhat would you like to update?");
            System.out.println("\t\t1. Name\n\t\t2. Contact\n\t\t3. Address\n\t\t4. Back");
			System.out.print("\t\t\tEnter your choice :");
            int updateChoice = sc.nextInt();
            switch (updateChoice) {
                case 1:
                    System.out.print("\t\t\t\tEnter new Name: ");
                    String newName = sc.next();
                    foundCard.setName(newName);
                    break;
                case 2:
                    System.out.print("\t\t\t\tEnter new Contact: ");
                    long newContact = sc.nextLong();
                    foundCard.setContact(newContact);
                    break;
                case 3:
                    System.out.print("\t\t\t\tEnter new Address: ");
                    String newAddress = sc.next();
                    foundCard.setAddress(newAddress);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\t\t\t\t\tInvalid Choice");
            }
        } else {
            System.out.println("\n\t\t\tNo Aadhar card found with the provided number.");
        }
    }
}
