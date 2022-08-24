public class Chuot extends DongVat {

    private int weight;
    public Chuot() {
        this(100);
    }
    public Chuot(int weight) {
        this.weight = weight;
    }
    public Chuot(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getAnimalName() {
        return "Chuot";
    }
}