public class Canario extends Ave{

    @Override
    public void makeSound(){
        System.out.println("Canta");
    }

    @Override
    public void vuela() {
        System.out.println("vuela con alas");
    }
}
