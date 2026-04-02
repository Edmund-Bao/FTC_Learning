package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "WAuto")
public class real_mecanum_auto extends LinearOpMode {

    private storage storage;
    private PID_controller PID_controller;
    private DcMotor rightFrontMotor;
    private DcMotor rightBackMotor;
    private DcMotor leftFrontMotor;
    private DcMotor leftBackMotor;
    private double targetPosition = 500;


    PID_controller controller = new PID_controller(0.01, 0, 0.0001);

    @Override
    public void runOpMode() throws InterruptedException {

        leftBackMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftFrontMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightBackMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFrontMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();

        while (opModeIsActive()) {

            double lfcurrentPos = leftFrontMotor.getCurrentPosition();
            double lbcurrentPos = leftBackMotor.getCurrentPosition();
            double rfcurrentPos = rightFrontMotor.getCurrentPosition();
            double rbcurrentPos = rightBackMotor.getCurrentPosition();

            double lfpower = controller.calculate(targetPosition, lfcurrentPos);
            double lbpower = controller.calculate(targetPosition, lbcurrentPos);
            double rfpower = controller.calculate(targetPosition, rfcurrentPos);
            double rbpower = controller.calculate(targetPosition, rbcurrentPos);

            leftFrontMotor.setPower(Math.max(-1, Math.min(1, lfpower)));
            rightFrontMotor.setPower(Math.max(-1, Math.min(1, lbpower)));
            leftBackMotor.setPower(Math.max(-1, Math.min(1, lbpower)));
            rightBackMotor.setPower(Math.max(-1, Math.min(1, lbpower)));


            telemetry.addData("lfPos", lfcurrentPos);
            telemetry.addData("Target", targetPosition);
            telemetry.update();
        }
    }
}
