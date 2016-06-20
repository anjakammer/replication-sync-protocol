public abstract class DBHandlerSlave extends DBHandler{
    
    public void getUpdateSequence(){
         System.out.println("returns transactions to update DB as Slave");
    }
    
    abstract void write();
}
