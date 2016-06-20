public abstract class DBHandlerMaster extends DBHandler{

 public void getUpdateSequence(){
  System.out.println("returns transactions to update DB as Master");
 }
 
 abstract void write();
 
 abstract void delete();
 
}
