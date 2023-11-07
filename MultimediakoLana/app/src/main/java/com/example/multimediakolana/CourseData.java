package com.example.multimediakolana;

import java.util.ArrayList;
import java.util.List;

public class CourseData {
    private static ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();

    public static void addCourse(CourseModel courseModel) {
        courseModelArrayList.add(courseModel);
    }

    public static ArrayList<CourseModel> getCourseList() {
        return courseModelArrayList;
    }

    public static void initializeCourseList() {
        courseModelArrayList.add(new CourseModel("Betis", R.mipmap.betis));
        courseModelArrayList.add(new CourseModel("Real Sociedad", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Osasuna", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Alaves", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Sevilla", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Cadiz", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Celta de Vigo", R.drawable.ic_launcher_background));
    }

    public int getImageResource() {
        return  getImageResource();
    }

    public int getName() {
        return  getName();
    }

    public List<CourseModel> get() {
        return get();
    }
}
