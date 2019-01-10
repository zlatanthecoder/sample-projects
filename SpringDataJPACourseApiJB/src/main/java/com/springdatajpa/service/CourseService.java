package com.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.model.Course;
import com.springdatajpa.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired	
	private CourseRepository courserepo;
	
	
	public List<Course> getCourses(String topicid) {
		return courserepo.findByTopicId(topicid);
	}

	
	public Course getCourse(String id) {
		return courserepo.findById(id).orElse(new Course());		
	}

	public Course addCourse(Course course) {
		courserepo.save(course);
		return course;
	}


	public Course updateCourse(Course newcourse) {
		courserepo.save(newcourse);
		return newcourse;
	}

	public Course deleteCourse(String id) {
		Course course = getCourse(id);
		courserepo.deleteById(id);
		return course;
	}
}
