package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Wautonomous")
public class example2 extends LinearOpMode{

    private storage storage;

    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor rightFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        DcMotor rightBackMotor = hardwareMap.dcMotor.get("rightBackMotor");
        DcMotor leftFrontMotor = hardwareMap.dcMotor.get("leftFrontMotor");

        storage = new storage();

        waitForStart();
        if(isStopRequested()) return;

        while (opModeIsActive()) {

            rightFrontMotor.setPower(storage.leftBackMotorSpeed);
            storage.runWithEncoderLeftB();
            rightBackMotor.setPower(0.5);
            leftFrontMotor.setPower(0.5);

            storage.stopMotors();

        }
    }
}
