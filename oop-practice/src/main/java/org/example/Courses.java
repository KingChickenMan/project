package org.example;

import java.util.List;

public class Courses {
    private final List<Course> course;

    public Courses(List<Course> course) {
        this.course = course;
    }

    public double multiplyCreditAndCourseGrade() {
        return course.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotlaCompletedCredit() {
        return course.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
