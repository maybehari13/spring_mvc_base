/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 18, 2019
 */

package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

/**
 * @author n0172808
 *
 */
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise saveExercise(Exercise exercise) {
		em.persist(exercise);
		em.flush();
		return exercise;
	}

}
