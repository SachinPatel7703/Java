class A {
    void function() {
        System.out.println("this is not static method");
    }

    static void function2() {
        System.out.println("this is static method");
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new A();   // create object
        obj.function();   // call non-static method
        A.function2();    // call static method
    }
}
