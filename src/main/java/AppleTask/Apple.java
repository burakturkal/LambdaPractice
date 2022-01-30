package AppleTask;//PART BEHAVIOUR PARAMETERIZATION

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
QUESTION:
Imagine an application to help a farmer understand his inventory.
- Find all green apples in the
- Find all apples heavier than 200
As a developer, we have to minimize our engineering effort.
 */
@Getter
@Setter
@ToString
public class Apple {
    private int weight;
    private Color color; //building ENUM here

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AppleTask.Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
