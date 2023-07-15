public class Client {
    
    public static void main(String[] args) {
        
        HotelKeeper keeper = new HotelKeeperImpl();
        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        Both both = keeper.getVegNonMenu();
    }
}
