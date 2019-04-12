/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.repository;

import com.pluralsight.model.Exercise;

/**
 * @author n0172808
 *
 */
public interface ExerciseRepository {

	/**
	 * @param exercise
	 * @return
	 */
	public Exercise saveExercise(Exercise exercise);

	
	
}
