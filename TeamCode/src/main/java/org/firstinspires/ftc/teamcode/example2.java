package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Wautonomous")
public class example2 extends LinearOpMode{
    private static double leftBackMotorSpeed;
    private storage stopMotors;

    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor rightFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        DcMotor rightBackMotor = hardwareMap.dcMotor.get("rightBackMotor");
        DcMotor leftBackMotor = hardwareMap.dcMotor.get("leftBackMotor");
        DcMotor leftFrontMotor = hardwareMap.dcMotor.get("leftFrontMotor");

        waitForStart();
        if(isStopRequested()) return;

        while (opModeIsActive()) {

            rightFrontMotor.setPower(leftBackMotorSpeed);
            leftBackMotor.setPower(0.5);
            rightBackMotor.setPower(0.5);
            leftFrontMotor.setPower(0.5);

            sleep(5000);

            stopMotors.stopMotors();

        }
    }
}
