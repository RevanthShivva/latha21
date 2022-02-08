package solidPrinciples;

interface databaseconnection{
    public void connectwiddata();
}
class mysqlconnect1 implements databaseconnection {
    String database;
    @Override
    public void connectwiddata() {
        System.out.println("Connection is established");
    }
}
class payment {
    private databaseconnection d;
    public void connct(databaseconnection my){
        this.d = my;
        System.out.println("Connected");
    }
}
