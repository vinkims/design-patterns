class Main {

    public static void main(String[] args) {
    
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap bird in a birdAdapter so that it behaves like a toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duch behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
