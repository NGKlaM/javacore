public class Cat extends DongVat{
    private int tuoi;
    private int height;

    public Cat(int tuoi, int height) {
        super();
        this.tuoi = tuoi;
        this.height = height;
    }

    public Cat(String name, int age, int height) {
        super(name);
        this.tuoi = tuoi;
        this.height = height;
    }

    public int getAge() {
        return tuoi;
    }

    public void setAge(int age) {
        this.tuoi = tuoi;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Thực hiện (implement) phương thức trừu tượng được khai báo tại lớp cha.
    @Override
    public String getAnimalName() {
        return "Cat";
    }

}

