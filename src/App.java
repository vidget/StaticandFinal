
class Thing{
	
	public final static int LUCKY_NUMBER = 21;
	public String name;
	public static String description;
	
	public static int count = 1;
	public int guid;
	
	
	public Thing(){
		guid = count;
		count++;
	}
	
	public void showID(){
		
		
		System.out.println("Object id: "+guid+","+ name);
	}
	
	
}



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before creating objects "+Thing.count);
		
Thing thing1 = new Thing();
Thing thing2 = new Thing();
		
thing1.name = "Bob";
thing2.name = "Sue";

Thing.description = "It works perfect";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		System.out.println(Thing.description);
		
		
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("After creating objects "+Thing.count);
		
		thing1.showID();
		thing2.showID();
		
	}

}
