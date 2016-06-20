public class Application{
    
    public static void main(String[] args) {
		ConcreteDBHandler Handler = new ConcreteDBHandler();
		Handler.dosmth();
		Handler.write();
		Handler.dosmthelse();
	}
}
