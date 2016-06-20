/**
* Representative of the using application
*/
public class Application{
    
    public static void main(String[] args) {
		ConcreteDBHandler Handler = new ConcreteDBHandler();
		Handler.dosmth();           //calls DBHandler
		Handler.getUpdateSequence();//calls DBHandlerSlave
		Handler.write();            //calls ConcreteDBHandler
	}
}
