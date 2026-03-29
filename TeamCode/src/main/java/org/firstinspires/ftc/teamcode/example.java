package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "WTeleOp")
public class example extends LinearOpMode {

    private DcMotor rightFrontMotor; // motor define
    @Override
    public void runOpMode() throws InterruptedException {
        rightFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");

        waitForStart();
        if(isStopRequested()) return;

        while (opModeIsActive()) {
            if (gamepad1.a) {
                rightFrontMotor.setPower(0);
            }
            if (gamepad1.b) {
                rightFrontMotor.setPower(1);
            }
            if (gamepad2.a) {
                telemetry.addLine("Test");
                telemetry.update();

            }

        }
    }
}
