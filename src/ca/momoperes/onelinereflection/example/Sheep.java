package ca.momoperes.onelinereflection.example;

public class Sheep extends Entity implements Colorable {

    private boolean sheared;
    private DyeColor color;

    public Sheep(boolean sheared, DyeColor color) {
        super(true);
        this.sheared = sheared;
        this.color = color;
    }

    public boolean isSheared() {
        return sheared;
    }

    @Override
    public DyeColor getColor() {
        return color;
    }
}
