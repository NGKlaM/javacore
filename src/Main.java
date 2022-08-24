public class Main {


        public static void main(String[] args) {
            DongVat tom = new Cat("Tom", 3, 20);

            System.out.println("name: " + tom.getName());
            System.out.println("animalName: " + tom.getAnimalName());
            boolean isMouse = tom instanceof Chuot;
            System.out.println("Tom is mouse? " + isMouse);

            boolean isCat = tom instanceof Cat;
            System.out.println("Tom is cat? " + isCat);

            boolean isAnimal = tom instanceof DongVat;
            System.out.println("Tom is animal? " + isAnimal);

        }

}

