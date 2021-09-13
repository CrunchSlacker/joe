public class Shooter {
    double turn_Motor, flywheel, angle, speed;

    public Shooter(double motor_1, double flywheel) {
        this.turn_Motor = motor_1;
        this.flywheel = flywheel;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    public void setFlywheelSpeed(double speed) {
        this.speed = speed;
    }

    public void offFlywheel() {
        this.speed = 0;
    }

    public void resetAngle() {
        this.angle = 0;
    }
}
