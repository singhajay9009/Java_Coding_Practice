package concepts;

public final class Child extends Car {

    private final int foo =2;

    public int getFoo(){
        return foo;
    }

    public static void main(String[] args) {
        new Child();
    }
}
