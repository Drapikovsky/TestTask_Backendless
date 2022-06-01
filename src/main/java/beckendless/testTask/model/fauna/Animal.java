package beckendless.testTask.model.fauna;

public abstract class Animal<T> {
    public void eat(T food) {
        System.out.println(this.getClass().getSimpleName() + " is eating "
                + food.getClass().getSimpleName());
    }
}
