class Animal {
    private String Aname;
    private int count;
    private String origin;

    public Animal(String Aname, int count, String origin) {
        this.Aname = Aname;
        this.count = count;
        this.origin = origin;
    }

    public String GetAname() {
        return Aname;
    }

    public int GetCount() {
        return count;
    }

    public String GetOrigin() {
        return origin;
    }
}

