package patterns.observer.dog_cat_human;

public class Cat implements IObserver {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void update(IObservable observable) {
        if (observable instanceof Dog) {
            runAway();
        } else if (observable instanceof Human) {
            sayMay();
        }
    }

    public void runAway() {
        System.out.println("Cat " + name + " is scared and run away...");
    }

    public void sayMay() {
        System.out.println("Human goes and Cat " + name + "  says may!");
    }


}
