class foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var ";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // error
	}

	public void instancMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar); 
	}
	
}
public class main {

	public static void main(String[] args) {
		System.out.println(foo.classVar); //OK
//		System.out.println(foo.instanceVar); // error

		foo.classMethod();
//		foo.instanceMethod(); error
		
		foo f1 = new foo();
		foo f2 = new foo();
	
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
//      
        f1.classVar = "changed by f1";
        System.out.println(foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
//      
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
		
        
	
	
	
	
	}

}
