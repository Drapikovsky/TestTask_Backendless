package beckendless.testTask.model.fauna;

public abstract class Animal<T> {
    public void eat(T food) {
        if (this.getClass() == food.getClass()) {
            return;
        }
        System.out.println(this.getClass().getSimpleName() + " is eating "
                + food.getClass().getSimpleName());
    }
}
