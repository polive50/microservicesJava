package com.pom.springboot.learnspringgoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {

	/**
	 *  /courses
	 *  Course: id, name, author
	 */
	@RequestMapping("/courses")
	public List<Course> retrieveallCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "PomEnterprises"),
				new Course(2, "Learn DevOps", "PomEnterprises"),
				new Course(3, "Learn Azure", "PomEnterprises"),
				new Course(4, "Learn GCP", "PomEnterprises")
				
				);
	}
	
}
