package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by rao_a on 8/31/2017.
 */
@Autonomous(name="First autonomous", group="group")
public class testAutonomous extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    ColorSensor colorSensor1;
    int blue;
    int red;
    int green;
    public void runOpMode(){
        motorLeft = hardwareMap.dcMotor.get("leftmotor");
        motorRight = hardwareMap.dcMotor.get("rightmotor");

        Move(2000);

        colorSensor1 = hardwareMap.colorSensor.get("colorSensor");

        blue = colorSensor1.blue();
        red = colorSensor1.red();
        green = colorSensor1.green();

        if (red < blue && green < blue) {
            Move(5000);

        }
    }


    public void Move(int EncoderSteps) {
        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorLeft.setTargetPosition(EncoderSteps);
        motorRight.setTargetPosition(EncoderSteps);

        motorLeft.setPower(1.0);
        motorRight.setPower(1.0);

        while(motorLeft.getCurrentPosition()<motorLeft.getTargetPosition() && motorRight.getCurrentPosition()<motorRight.getTargetPosition() && opModeIsActive()){

        }

        motorLeft.setPower(0);
        motorRight.setPower(0);
    }
}
