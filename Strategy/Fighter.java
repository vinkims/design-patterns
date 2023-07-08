abstract class Fighter {

    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }

    public void punch() {
        System.out.println("Default punch");
    }

    public void kick() {
        // delegate to kick behavior
        kickBehavior.kick();
    }

    public void jump() {
        // delegete to jump behavior
        jumpBehavior.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public abstract void display();
}