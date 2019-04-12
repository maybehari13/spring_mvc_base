/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.model;

/**
 * @author n0172808
 *
 */
public class GoalReport {

	private int goalMinutes;
	private int exerciseMinutes;
	private String activity;

	public GoalReport(int goalMinutes, int exerciseMinutes, String activity){
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.activity = activity;
	}
	
	/**
	 * @return the goalMinutes
	 */
	public int getGoalMinutes() {
		return goalMinutes;
	}
	/**
	 * @param goalMinutes the goalMinutes to set
	 */
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	/**
	 * @return the exerciseMinutes
	 */
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	/**
	 * @param exerciseMinutes the exerciseMinutes to set
	 */
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}
	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
}
