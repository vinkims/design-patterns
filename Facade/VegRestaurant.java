public class VegRestaurant implements Hotel {
    
    public Menus getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
