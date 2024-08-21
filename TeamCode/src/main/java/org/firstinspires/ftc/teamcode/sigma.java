
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

@Autonomous(name="sigma", group="Linear OpMode")
public class sigma extends LinearOpMode {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {

        frontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        backLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        backRight = hardwareMap.get(DcMotor.class, "BackRight");
        //change this as needed

        backLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        //Sometimes, motors will be facing backwards on the robot.
        //This is how you flip its direction at the start rather than having
        //to reverse all of the inputs for the whole program.

        telemetry.addData("Status", "Initialized");
        telemetry.addLine("testing");
        telemetry.update();
        //Telemetry is a very important part of debugging and programming your robot.
        //It allows you to output data to the screen of your driver hub.
        //You MUST call telemetry.update every frame, or it will stop rendering
        //on the driver hub screen.
        //You can have multiple things on the screen at once; just call
        //addData multiple times.

        AprilTagProcessor myAprilTagProcessor;

// Create the AprilTag processor and assign it to a variable.
        myAprilTagProcessor = AprilTagProcessor.easyCreateWithDefaults();

        waitForStart();
        while (opModeIsActive()) {
            AprilTagProcessor.Builder myAprilTagProcessorBuilder;
            AprilTagProcessor myAprilTagProcessor;

// Create a new AprilTagProcessor.Builder object and assign it to a variable.
            myAprilTagProcessorBuilder = new AprilTagProcessor.Builder();

// Set the tag library.
// Get the AprilTagLibrary for the current season.
            myAprilTagProcessorBuilder.setTagLibrary(AprilTagGameDatabase.getCurrentGameTagLibrary());

// Build the AprilTag processor and assign it to a variable.
            myAprilTagProcessor = myAprilTagProcessorBuilder.build();
        }
    }
}