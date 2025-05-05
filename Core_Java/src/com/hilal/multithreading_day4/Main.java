package com.hilal.multithreading_day4;

public class Main {

	public static void main(String[] args) {
		Course c1 =new Course(1, "Mathematics", 1000);
		Course c2 =new Course(2, "Science ", 1200);
		Course c3 =new Course(3, "English ", 900);
		
		Offer o1 = new Offer("Special discount: Get 20% off on all courses!");
		Offer o2 = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		
		Course[] courses = {c1, c2, c3};
		Offer[] offers = {o1, o2};
		
		EducationInstitute e = new EducationInstitute(courses, offers);
		
		Student s1 = new Student("Virat", e);
		Student s2 = new Student("Dhoni", e);
		
		
		
		
		}
		
		
		
	}


