package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="goals")	//Denotes name of table to be used in DB - if no annotation is specified
						//the table name used would be the class name default due to @Entity
@NamedQueries({
	@NamedQuery(name=Goal.FIND_GOAL_REPORT, query="Select new com.pluralsight.model.GoalReport("
		+ "g.minutes, e.minutes, e.activity) from Goal g, Exercise e "
		+ "where g.id = e.goal.id")
})
public class Goal {		

	public static final String FIND_GOAL_REPORT = "findGoalReport";
	
	@Id
	@GeneratedValue
	@Column(name="goalId")		//Override column names to be different from POJO
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="minutes")
	private int minutes;

	@OneToMany(mappedBy="goal", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	/**
	 * @return the exercises
	 */
	public List<Exercise> getExercises() {
		return exercises;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param exercises the exercises to set
	 */
	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
