class StreetFighter {
    
    public static void main(String[] args) {

        JumpBehavior shortJump = new ShortJump();
        JumpBehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        Fighter ken = new Ken(tornadoKick, shortJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBehavior(longJump);
        ken.jump();
    }
}
