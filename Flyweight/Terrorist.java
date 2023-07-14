class Terrorist implements Player {
    
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
