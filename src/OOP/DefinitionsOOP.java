package OOP;

/*
 * OOP: Object-oriented programming (OOP) is a programming paradigm based on the 
 * concept of "objects," which can contain data, in the form of fields (attributes or properties), 
 * and code, in the form of procedures (methods or functions). Objects are instances of classes, 
 * which act as blueprints for creating objects. OOP emphasises the organisation of software
 * as a collection of objects that interact with each other to perform tasks.
 * 
 * KEY Principles of OOP:
 * 1- Encapsulation: Encapsulation refers to the bundling of data and methods that operate
 * on the data into a single unit or class. It allows data to be hidden within a class 
 * and accessed only through well-defined interfaces.
 * 2- Abstraction: Abstraction involves simplifying complex systems by modelling classes based on 
 * real-world entities. it allows programmers to focus on the essential characteristics 
 * of an object while hiding unnecessary details.
 * 3- inheritance:  is a mechanism that allows a class (subclass or derived class) to inherit 
 * properties and behaviours (methods) from another class (superclass or base class). 
 * it promotes code reuse and supports the hierarchical classification of objects. 
 * 4- Polymorphism:  Polymorphism allows objects of different classes to be treated as 
 * objects of a common superclass. It enables flexibility in programming by allowing methods 
 * to behave differently based on the object's type or class.
 * 
 * What is CLASS?
 * a class is a blueprint or template for creating objects. It defines the 
 * properties (attributes or fields) and behaviors (methods or functions) that
 * all objects of that class will have.
 * 
 * Class ClassName{
 *   // fields, instance variable
 *   // methods
 * }
 * 
 * Key components of of a class: 
 * -Attributes/Fields:These represent the data associated with the class. 
 * They define the characteristics or properties of objects created from the class
 * -Methods/Functions: These define the behaviors or actions that objects of the class can perform. 
 * They can manipulate the class's data and interact with other objects.
 * -Constructor: This is a special method used for initializing newly created objects. It typically 
 * assigns initial values to the object's attributes.
 * 
 * What is an OBJECT?
 * An object is an instance of a class. It is a concrete realization of the class blueprint, 
 * with its own unique data and state. When you create an object from a class, 
 * you're essentially creating a specific instance of that class, 
 * with its own distinct set of attribute values.
 * 
 * NOT: file name and class name must be same
 * 
 * 
 * */


class BenimSinifim{
	int x = 5;  // this is not a variable. this is called attribute
	static int y = 5; // this is static variable
}
public class DefinitionsOOP {

	public static void main(String[] args) {
		// we cannot access x directly. However, we can access variable y(bc static variable).
		System.out.println("Accessing a static vairaible directly from a class "+BenimSinifim.y);
		//Wrong usage
		//System.out.println(BenimSinifim.x);
		// to access x, we need to create an object from BenimSinifim class
		BenimSinifim xObj = new BenimSinifim();
		System.out.println("accessing to x from an object "+xObj.x);

	}

}
