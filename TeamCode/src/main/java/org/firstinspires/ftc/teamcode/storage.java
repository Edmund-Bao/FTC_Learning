package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class storage {
    final static double leftBackMotorSpeed = 0.5;
    final static double leftFrontMotorSpeed = 0.5;
    final static double  rightBackMotorSpeed = 0.5;
    final static double rightFrontMotorSpeed = 0.5;
    private DcMotor leftBackMotor;
    private DcMotor leftFrontMotor;
    private DcMotor rightBackMotor;
    private DcMotor rightFrontMotor;
    public void stopMotors() {
        rightFrontMotor.setPower(0);
        leftBackMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftFrontMotor.setPower(0);
    }
}
