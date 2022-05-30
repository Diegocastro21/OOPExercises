package ExcerciseComplex4;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        super.greets();
        System.out.println("Woooow");
    }

    @Override
    public void greets(Dog another) {
        super.greets(another);
        System.out.println("Woooooow");
    }

    public void greets(BigDog another){
        System.out.println("WOooooooooooooooooW");
    }
}
