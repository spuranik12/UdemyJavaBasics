import accessModifierExamPackage.AccessModifiesExample3;

public class AccessModifiesExample2 extends AccessModifiesExample3 {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiesExample1 ex1 = new AccessModifiesExample1();
		ex1.publicMethod(); //Public properties can be accessed across all classes
		ex1.defaultMethod(); //default properties can be accessed only by creating object of class within package.
		ex1.protectedMethod(); //Protected method can be used after creating object.
		
		AccessModifiesExample2 ex2 = new AccessModifiesExample2();
		ex2.anotherPackageProtectedMethod(); //Protected method from another package which can be accesed only after extending
	}

}
