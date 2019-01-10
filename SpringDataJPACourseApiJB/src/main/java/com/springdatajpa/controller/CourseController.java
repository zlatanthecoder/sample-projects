package com.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.model.Course;
import com.springdatajpa.service.CourseService;
import com.springdatajpa.service.TopicService;

@RestController
//a Course can have multiple courses & a course can consist of multiple lessons
public class CourseController {
	
	@Autowired //this will make the courseservice instance available for this class usage
	private CourseService courseservice;
	
	@Autowired
	private TopicService topicservice;

	
	
	@RequestMapping("topics/{topicid}/courses") //gives all the courses belong to a particular topic(topicid)
	public List<Course> getCourses(@PathVariable String topicid) { //this List object will be converted to JSON response automatically by Jackson jars by spring mvc as this controller is annotated by @RestController
		//http://localhost:8080/topics/Spring/courses
		
		return courseservice.getCourses(topicid) ;
	}
	
	
	
	@RequestMapping("topics/{topicid}/courses/{courseid}") //gives the particular course of that particular topicid
	public Course getCourse(@PathVariable String courseid) {
		//http://localhost:8080/topics/Spring/courses/SpringDI
		
		return courseservice.getCourse(courseid);
	}

	
	@PostMapping(value="topics/{topicid}/courses") //adding course on a particular topicid
	public Course addCourse(@RequestBody Course course, @PathVariable String topicid) {
		//http://localhost:8080/topics/Spring/courses
		
		course.setTopic(topicservice.getTopic(topicid));
		return courseservice.addCourse(course);
	}
	
	
	@PutMapping(value="topics/{topicid}/courses/{courseid}") //updating a course of a particular topicid
	public Course updateCourse(@RequestBody Course course, @PathVariable String topicid) {
		//http://localhost:8080/topics/Spring/courses/SpringDI  Spring=topicid, SpringDI=courseid
		
		course.setTopic(topicservice.getTopic(topicid));
		return courseservice.updateCourse(course);
	}
	
	
	@DeleteMapping(value="courses/{courseid}") //delete a particular course
	public Course deleteCourse(@PathVariable String courseid) {
		//http://localhost:8080/courses/SpringDI
		
		return courseservice.deleteCourse(courseid);
	}
}
