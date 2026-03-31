package org.firstinspires.ftc.teamcode;

public class PID_controller {
    private double kP, kI, kD;

    private double integral = 0;
    private double lastError = 0;

    public PID_controller(double kP, double kI, double kD) {
        this.kP = kP;
        this.kI = kI;
        this.kD = kD;
    }

    public double update(double target, double current, double dt) {

        double error = target - current;
        integral += error * dt;
        double derivative =
                //not done!!!!!!
    }
}
