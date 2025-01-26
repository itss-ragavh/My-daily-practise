public class Amazon{
    private int pid;
    private String pname;
    private double price;

    public Amazon(int pid,String pname,double price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    
    public int getPid(){
        return pid;
    }
    public String getPname(){
        return pname;
    }
    public double getPrice(){
        return price;
    }
}