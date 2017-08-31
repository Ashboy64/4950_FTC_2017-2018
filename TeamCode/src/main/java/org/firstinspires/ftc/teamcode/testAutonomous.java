package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by rao_a on 8/31/2017.
 */
@Autonomous(name="First autonomous", group="group")
@Disabled
public class testAutonomous extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    public void runOpMode(){
        motorLeft = hardwareMap.dcMotor.get("motor1");
        motorRight = hardwareMap.dcMotor.get("motor2");

        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorLeft.setTargetPosition(2000);
        motorRight.setTargetPosition(2000);

        motorLeft.setPower(1.0);
        motorRight.setPower(1.0);

        while(motorLeft.getCurrentPosition()<motorLeft.getTargetPosition() && motorRight.getCurrentPosition()<motorRight.getTargetPosition() && opModeIsActive()){

        }

        motorLeft.setPower(0);
        motorRight.setPower(0);
    }
}
