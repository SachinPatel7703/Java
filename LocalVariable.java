class LocalVariable {

    static void display() {
        int a = 10;   // local variable
        System.out.println(a);
    }

    public static void main(String[] args) {
        display();   // no object, no new keyword
    }
}
