package com.giridhari.preachingassistant.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giridhari.preachingassistant.db.model.FollowUpAssignment;

@Repository
public interface FollowUpAssignmentRepo extends CrudRepository<FollowUpAssignment, Long> {
	
}