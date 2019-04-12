/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

/**
 * @author n0172808
 *
 */
public interface GoalRepository {
	
	public Goal saveGoal(Goal goal);

	/**
	 * @return
	 */
	public List<Goal> findAllGoals();

	/**
	 * @return
	 */
	public List<GoalReport> findGoalReport();

}
