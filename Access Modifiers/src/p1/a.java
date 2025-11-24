package p1;



public class a {

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;          // default access
    private int privateVar = 40;

    public void show() {
        System.out.println("Inside class A:");

    }

    public void publicVar() {
        System.out.println("publicVar: " + publicVar);
    }

    public void protectVar() {
        System.out.println("protectedVar: " + protectedVar);
    }

    public void defaultVar() {
        System.out.println("defaultVar: " + defaultVar);
    }

    public void privateVar() {
        System.out.println("privateVar: " + privateVar);
    }
}