package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "WTeleOp")
public class real_teleOp_tank_drive extends LinearOpMode {
    private storage storage;

    private DcMotor rightFrontMotor;
    private DcMotor rightBackMotor;
    private DcMotor leftFrontMotor;
    private DcMotor leftBackMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        storage = new storage();

        rightBackMotor = hardwareMap.dcMotor.get("rightBackMotor");
        rightFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        leftBackMotor = hardwareMap.dcMotor.get("leftBackMotor");
        leftFrontMotor = hardwareMap.dcMotor.get("leftFrontMotor");

        waitForStart();
        if(isStopRequested()) return;

        while (opModeIsActive()) {

            if (gamepad1.left_stick_y < -0.05){

                rightFrontMotor.setPower(storage.rightFrontMotorSpeed);
                rightBackMotor.setPower(storage.rightBackMotorSpeed);
                leftBackMotor.setPower(storage.leftBackMotorSpeed);
                leftFrontMotor.setPower(storage.leftFrontMotorSpeed);
            }

            else if (gamepad1.left_stick_y > 0.05){

                rightFrontMotor.setPower(storage.rightFrontMotorSpeed * -1.0);
                rightBackMotor.setPower(storage.rightBackMotorSpeed * -1.0);
                leftBackMotor.setPower(storage.leftBackMotorSpeed * -1.0);
                leftFrontMotor.setPower(storage.leftFrontMotorSpeed * -1.0);
            }


            else {
                rightFrontMotor.setPower(0);
                rightBackMotor.setPower(0);
                leftBackMotor.setPower(0);
                leftFrontMotor.setPower(0);
            }
        }
    }
}