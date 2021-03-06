package com.chrisyoo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chrisyoo.hibernate.demo.entity.Course;
import com.chrisyoo.hibernate.demo.entity.Instructor;
import com.chrisyoo.hibernate.demo.entity.InstructorDetail;
import com.chrisyoo.hibernate.demo.entity.Review;
import com.chrisyoo.hibernate.demo.entity.Student;

public class AddCoursesForMaryDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		
		
		try {
			
			session.beginTransaction();
		
//			Course tempCourse = new Course("Pacman - How To Score One Million Points");
//			
//			
//			System.out.println("\nSaving the course ... ");
//			session.save(tempCourse);
//			System.out.println("Saved the course: " + tempCourse);
//			
//			Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
//			Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
//			
//			tempCourse.addStudent(tempStudent1);
//			tempCourse.addStudent(tempStudent2);
//			
//			
//			System.out.println("\nSaving students ... ");
//			session.save(tempStudent1);
//			session.save(tempStudent2);
//			System.out.println("Saved students: " + tempCourse.getStudents());
//			
			
			
			int studentId = 2;
			Student tempStudent = session.get(Student.class, studentId);
			System.out.println("\nLoaded student: " + tempStudent);
			System.out.println("Courses: " + tempStudent.getCourses());
			
			Course tempCourse1 = new Course("Rubik's Cube - How to Speed Cube");
			Course tempCourse2 = new Course("Atari 2600 - Game Development");
			
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			
			System.out.println("\nSaving the courses ... ");
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			session.close();
			factory.close();
		}
		
		

	}

}
