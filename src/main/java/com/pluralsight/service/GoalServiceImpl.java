/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;

/**
 * @author n0172808
 *
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService{

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal saveGoal(Goal goal) {
		return goalRepository.saveGoal(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.findAllGoals();
	}

	public List<GoalReport> findGoalReport() {
		return goalRepository.findGoalReport();
	}	
	
}
