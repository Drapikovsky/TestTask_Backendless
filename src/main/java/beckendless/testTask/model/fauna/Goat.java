package beckendless.testTask.model.fauna;

import beckendless.testTask.model.flora.Grass;

public class Goat<T extends Grass> extends Herbivores<T> {
    @Override
    public void eat(T food) {
        super.eat(food);
    }
}
