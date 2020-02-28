package lab.assignment.afterrefactoring;


public abstract class CoffeeMaker {

    public final void prepareCoffee() {
        boilWater();
        brew();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }


    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();
    protected abstract void addIngredients();
    protected abstract void finalTouch();

}