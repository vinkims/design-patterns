import java.util.HashMap;

/**
 * Used to get a player using a HashMap
 * Returns an existing player if a player of given type exists
 * Else creates a new player and returns it
 */
class PlayerFactory {
    
    // Stores the reference to the object of Terrorist(TS) or CounterTerrorist(CT)
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {

        Player player = null;

        if (hm.containsKey(type)) {
            player = hm.get(type);
        } else {
            // Create an object
            switch(type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            hm.put(type, player);
        }

        return player;
    }
}
