package com.hilal.multithreading_day4;

public class EducationInstitute {
	Course courses[];
	Offer offers[];
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public Offer[] getOffers() {
		return offers;
	}
	public void setOffers(Offer[] offers) {
		this.offers = offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName){
		String courseName=null;
		boolean flag=false;
		for(Course c:courses)
		{
			if(c.getCourseId()==courseId)
			{
				flag=true;
				courseName=c.getCourseName();
			}
		}
		if(flag)
		{
			System.out.println(studentName+" has enrolled in the course: "+courseName);
		}
		else
		{
			System.out.println("course not availble");
		}
	}
}
