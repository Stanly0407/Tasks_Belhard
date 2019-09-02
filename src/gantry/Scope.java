package gantry;

public class Scope {

    private double lgth, depth;
    private int weight;

    public Scope(double lgth, double depth, int weight) {
        this.lgth = lgth;
        this.depth = depth;
        this.weight = weight;
    }

    public double getLgth() {
        return lgth;}

    public double getDepth() {
        return depth;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {

        return "Размеры полки: " + lgth + "x" + depth + "; Вес полки: " + weight + " кг.";

    }
}