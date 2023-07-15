public class NonVegRestaurant implements Hotel {
    
    public Menus getMenus() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
