/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

/**
 * @author n0172808
 *
 */
@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Goal saveGoal(Goal goal) {
		
		if(goal == null){
			em.persist(goal);
			em.flush();
		}else {
			goal = em.merge(goal);
		}
		
		return goal;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Goal> findAllGoals() {
		Query query = em.createQuery("Select goal from Goal goal");
		List goals = query.getResultList();
		return goals;
	}

//	Projection - Creating a new modal object at query execution time	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public List<GoalReport> findGoalReport() {
//		Query query = em.createQuery("Select new com.pluralsight.model.GoalReport("
//				+ "g.minutes, e.minutes, e.activity) from Goal g, Exercise e "
//				+ "where g.id = e.goal.id");
//
//		List goalReport = query.getResultList();
//		return goalReport;
//	}
	
//	Named Query Example - eliminates unchecked and rawtypes warnings	
	public List<GoalReport> findGoalReport() {
		TypedQuery<GoalReport> goalReport = 
				em.createNamedQuery(Goal.FIND_GOAL_REPORT, GoalReport.class);

		return goalReport.getResultList();
	}

}
