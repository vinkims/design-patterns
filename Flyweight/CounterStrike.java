import java.util.Random;

public class CounterStrike {
    
    // All player types abd weapon
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        // for 10 players
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

            // Assign a weapon chosen randomly uniformly
            player.assignWeapon(getRandomWeapon());

            // Send player on a mission
            player.mission();
        }
    }

    public static String getRandomPlayerType() {

        Random rand = new Random();

        int randInt = rand.nextInt(playerType.length);

        return playerType[randInt];
    }

    public static String getRandomWeapon() {

        Random rand = new Random();

        int randInt = rand.nextInt(weapons.length);

        return weapons[randInt];
    }
}
