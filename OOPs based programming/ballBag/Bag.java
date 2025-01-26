class Bag {
    Ball b;

    Bag() {
    };

    public void addBall(Ball b1) {
        if (b == null) {
            b = b1;
            System.out.println("\t\t\tBall Added to the bag");
        } else {
            System.out.println("\t\t\tBag is Already having Ball");
        }
    }

    public void removeBall() {
        if (b != null) {
            b = null;
            System.out.println("\t\t\tBall Removed Sucessfully");
        } else {
            System.out.println("\t\t\tAlready ball is removed");
        }
    }

    public boolean isBagEmpty() {
        return b == null;
    }

    public String showGame() {
        if (b instanceof Tennis) {
            Tennis t = (Tennis) b;
            return t.game;
        } else if (b instanceof BaskatBall) {
            BaskatBall bb = (BaskatBall) b;
            return bb.game;
        }
        return "\t\t\tNo game is played Bag is Empty";
    }
}
