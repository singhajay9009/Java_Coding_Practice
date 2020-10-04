package concepts;

public class Car {

    private final int foo =1;

    public Car(){
        System.out.println(getFoo());
    }
    public int getFoo(){
        return foo;
    }
}
