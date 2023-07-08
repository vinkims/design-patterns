class PizzaStore {
    
    public static void main(String[] args) {
        
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        Pizza pizza2 = new FarmHouse();

        // decorate with freshtomato topping
        pizza2 = new FreshTomato(pizza2);

        // decorate with paneer topping
        pizza2 = new Paneer(pizza2);
        
        System.out.println(pizza2.getDescription() + " Cost: " + pizza2.getCost());

        Pizza pizza3 = new Barbeque(null); // No specific pizza
        System.out.println(pizza3.getDescription() + " Cost: " + pizza3.getCost());
    }
}
