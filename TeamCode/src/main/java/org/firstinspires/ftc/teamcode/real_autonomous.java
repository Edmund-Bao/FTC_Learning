package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.storage;

@Autonomous(name = "Wautonomous")

public class real_autonomous extends LinearOpMode{
    private storage storage;

    @Override
    public void runOpMode() throws InterruptedException {

        storage = new storage();

        waitForStart();
        if(isStopRequested()) return;

        while (opModeIsActive() && !storage.stopMotors()) {

            storage.runWithEncoderLeftF();
            storage.runWithEncoderLeftB();
            storage.runWithEncoderRightB();
            storage.runWithEncoderRightF();

            storage.stopMotors();

        }
    }
}
