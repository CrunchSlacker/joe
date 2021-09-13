public class ShootBall {
    boolean firePressed = false;
    Shooter shoot = new Shooter(0, 1);
    public ShootBall(boolean fire){
        this.firePressed = fire;
    }

    public void shoot(){
        if(firePressed){
            shoot.setFlywheelSpeed(100);
            shoot.offFlywheel();
        }
    }
}
