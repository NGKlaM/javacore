

public abstract class DongVat {
    private String name;


    public DongVat() {

        this.name = this.getAnimalName();
    }

    public DongVat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String getAnimalName();

}


