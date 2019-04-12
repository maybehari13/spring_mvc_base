package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {

	@Id
	@GeneratedValue
	@Column(name="exerciseId")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="minutes")
	private int minutes;

	@NotNull
	@Column(name="activity")
	private String activity;
	
	@ManyToOne
	private Goal goal;

	public String getActivity() {
		return activity;
	}

	/**
	 * @return the goal
	 */
	public Goal getGoal() {
		return goal;
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

	public void setActivity(String activity) {
		this.activity = activity;
	}

	/**
	 * @param goal the goal to set
	 */
	public void setGoal(Goal goal) {
		this.goal = goal;
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
