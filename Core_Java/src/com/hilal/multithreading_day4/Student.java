package com.hilal.multithreading_day4;

public class Student {
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	 void viewCoursesAndFees()
	{
		 System.out.println("----------Available Courses and Fees---------------");
		 int k=1;
		 for(Course all:institute.courses)
		 {
			 System.out.println(k+". "+all.getCourseName()+" - Fee: Rs."+all.getCourseFee());
			 k++;
		 }
	}
	 void viewOffers() {
		 System.out.println("----------Ongoing Offers:---------------");
		 for(Offer all:institute.offers)
		 {
			 System.out.println(all.getOfferText());
		 }
	 }
	 
	 void enrollInCourse(int courseId) {
		 Course[] courses = institute.getCourses();
		 for(Course course:courses)
		 {
			 if(course.getCourseId()==courseId)
			 {
				 System.out.println("Student "+name+" enrolled in course "+course.getCourseName());
			 }
		 }
	 }
}
