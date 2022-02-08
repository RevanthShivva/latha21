package solid_p;
class mysqlconnect{
    String database;
    public void connectionwiddata(){
        System.out.println("Connection is established");
    }
}
class CollegeDatabase{
    private mysqlconnect m;
    public void connect(mysqlconnect my){
        this.m = my;
        System.out.println("Connected");
    }
}


