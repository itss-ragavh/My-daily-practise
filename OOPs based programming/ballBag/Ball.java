class Ball {
    private int radius;

    Ball(){}

    Ball(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

}

class BaskatBall extends Ball{
    String game = "baskat ball" ;

    BaskatBall(){}

    BaskatBall(int radius){
        super(radius);
    }
}

class Tennis extends Ball{
    String game = "tennis";

    Tennis(){}

    Tennis(int radius){
        super(radius);
    }
}