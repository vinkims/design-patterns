class BirdAdapter implements ToyDuck {
    
    // Implement the interface the client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}
