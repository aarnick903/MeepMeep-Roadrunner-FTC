package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting_Aarnick_copy {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccfel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(56, -5, 90))
                //.lineToX(-12)
                //.strafeToLinearHeading(new Vector2d(5,5), Math.toRadians(90))
                .strafeToLinearHeading(new Vector2d(36,5), Math.toRadians(90))
                .waitSeconds(.1)
                .lineToY(52)
                //.lineToY(12)
                .waitSeconds(.1)
                .strafeToLinearHeading(new Vector2d(0,0), Math.toRadians(135))
                                .waitSeconds(3)
                //.strafeToLinearHeading(new Vector2d(5,5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(12,5), Math.toRadians(90))
                .waitSeconds(.1)
                .lineToY(52)
                //.lineToY(12)
                .waitSeconds(.1)
                //.strafeToLinearHeading(new Vector2d(5,5), Math.toRadians(90))
                .strafeToLinearHeading(new Vector2d(0,0), Math.toRadians(135))
                .waitSeconds(3)
                .strafeToLinearHeading(new Vector2d(-12,5), Math.toRadians(90))
                        .waitSeconds(.1)
                        .lineToY(52)
                        .waitSeconds(.1)
                .strafeToLinearHeading(new Vector2d(0,0), Math.toRadians(135))
                        .waitSeconds(3)
                .strafeToLinearHeading(new Vector2d(37,-33), Math.toRadians(90))
                // .splineToConstantHeading(new Vector2d(-12,-14), Math.toRadians(180))
//                        .lineToXLinearHeading(-12,Math.toRadians(225))
//                        .waitSeconds(3)
//                        // .lineToXLinearHeading(36,Math.toRadians(270))
//                        .strafeToLinearHeading(new Vector2d(36,-14), Math.toRadians(270))
//                        //   .splineToConstantHeading(new Vector2d(36,-14), Math.toRadians(270))
//                        .waitSeconds(.1)
//                        .lineToYConstantHeading(-50)
//                        .strafeToLinearHeading(new Vector2d(54,-10), Math.toRadians(210))
//                        .waitSeconds(3)
                //   .strafeToLinearHeading(new Vector2d(38,-10), Math.toRadians(270))
                //   .waitSeconds(1)
                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_DECODE_JUICE_BLACK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}