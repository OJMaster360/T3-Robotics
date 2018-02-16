/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7312.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends IterativeRobot {
	private DifferentialDrive m_myRobot;
	private Joystick m_leftStick;
	private Joystick m_rightStick;
	private Joystick m_leftStick1;
	private Joystick m_rightStick1;
	

	//@Override
	/*public void robotInit() {
		m_myRobot = new DifferentialDrive(new Spark(3), new Spark(4));
		m_myRobot = new Joystick(3);
		m_myRobot = new Joystick(4);
	}*/
	@Override
	public void robotInit() {
		m_myRobot = new DifferentialDrive(new Spark(0), new Spark(1), new Spark(2), new Spark(3);
		m_leftStick = new Joystick(0);
		m_rightStick = new Joystick(1);
		m_leftStick1 = new Joystick(2);
		m_rightStick1 = new Joystick(3);
		
	}

	@Override
	public void teleopPeriodic() {
		m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
		m_myRobot.tankDrive(m_leftStick1.getY(), m_rightStick1.getY());
		
	}
	/*public void teleopPeriodic() {
		m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
	}*/
	public void autoPeriodic() {
	
	}
	@SuppressWarnings("deprecation")
	public void testPeriodic() {
		LiveWindow.run();
		
	}
}
