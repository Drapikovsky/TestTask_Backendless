package beckendless.testTask.model.fauna;

public class Lion<T extends Animal> extends Carnivorous<T> {
    @Override
    public void eat(T food) {
        super.eat(food);
    }
}
