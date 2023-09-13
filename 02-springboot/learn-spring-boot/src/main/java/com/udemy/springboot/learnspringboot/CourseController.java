package com.udemy.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	// if someone hits the /courses then we get the list of all courses
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Udemy"),
				new Course(2, "Learn DevOps", "Udemy"),
				new Course(3, "Learn Azure", "Udemy"),
				new Course(4, "Learn GCP", "Udemy")
				
				
				);
	}

}
