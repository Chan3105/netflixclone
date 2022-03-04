/* 
INHERITANCE: 
The ability to derive the properties from the parent class is called inheritance.

TYPES OF INHERITANCE:

1.SINGLE INHERITANCE:
The type of inheritance where the derived class has a single parent class (base class).

2.MULTIPLE INHERITANCE:
The type of inheritance where the derived class can have more than one parent classes (base class).

3.MULTILEVEL INHERITANCE:
The type of inheritance where one derived class is innherited from another derived class.

4.HIERARCHICAL INHERITANCE:
The type of inheritance where several derived classes are inherited from a single base class.

5.HYBRID INHERITANCE:
Hybrid inheritance is a combination of more than one type of inheritance

*/

public class Java20124097_lab6 {
    public static void main(String args[]) {
        System.out.println("\n***20124097 SINCHANA S DODDALINGANNAVAR*\n");

        System.out.println("\n SINGLE INHERITANCE");
        // Single inheritance
        // A -> D
        D obj_D = new D(); 
        // Calling Parent Class () / Super function
        obj_D.method_A(); 
        // Calling Child Class () / Local function
        obj_D.method_D(); 
        System.out.println("\n");


        System.out.println("MULTILEVEL INHERITANCE");
        // Multilevel inheritance
        // A -> B -> C 
        C obj_c = new C(); 
        // Calling First Parent Class() / Grand Super class method
        obj_c.method_A(); 
        // Calling Next Parent Classes() / Super class method
        obj_c.method_B(); 
        // Calling Child Class () / Local function
        obj_c.method_C(); 
        System.out.println("\n");


        System.out.println("\n HIERARCHIAL INHERITANCE");
        // Hierarchical Inheritance
        //  A -> E
        E obj_E = new E();
         // Calling Parent Class () / super function of class E
        obj_E.method_A();
        // Calling Child Class () /  local function of class E
        obj_E.method_E(); 
        
        // A -> D 
        // Calling Parent Class () / super function of class D
        obj_D.method_A(); 
        // Calling Child Class () / local function of class D
        obj_D.method_D(); 
        System.out.println("\n");


        System.out.println("\n MULTIPLE INHERITANCE");
        // Multiple Inheritance
        F obj_F = new F();
        // Calling interface I's function
        obj_F.method_I(); 
        // Calling interface J's function
        obj_F.method_J(); 
        System.out.println("\n");
    }

}

class A {
    public void method_A() {
        System.out.println("Class A's method called.");
    }
}

class B extends A {
    public void method_B() {
        System.out.println("Class B's method called.");
    }
}

class C extends B {
    public void method_C() {
        System.out.println("Class C's method called.");
    }
}

class D extends A {
    public void method_D() {
        System.out.println("Class D's method called.");
    }
}

class E extends A {
    public void method_E() {
        System.out.println("Class E's method called.");
    }
}

// Creating interface
interface I {
    void method_I();
}

// Creating interface
interface J {
    void method_J();
}

class F implements I, J {
    public void method_I() {
        System.out.println("Interface I's method called.");
    }

    public void method_J() {
        System.out.println("Interface J's method called.");
    }
}


