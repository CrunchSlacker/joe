public class turnTurret {
    double angleOfRotatation;
    Shooter shot = new Shooter(0, 1);
    public turnTurret(double angleOfRotation) {
        this.angleOfRotatation = angleOfRotation;
    }

    public void turnAngle(){
        shot.setAngle(angleOfRotatation);
    }

}
