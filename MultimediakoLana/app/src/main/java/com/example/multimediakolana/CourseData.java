package com.example.multimediakolana;

import java.util.ArrayList;
import java.util.List;

public class CourseData {
    private static ArrayList<Ekipoak> courseModelArrayList = new ArrayList<>();
    private static ArrayList<Ekipoak> courseModelArrayList1 = new ArrayList<>();

    public static void addCourse(Ekipoak courseModel) {
        courseModelArrayList.add(courseModel);
    }

    public static ArrayList<Ekipoak> getCourseList() {
        return courseModelArrayList;
    }

    public static void initializeCourseList() {
        courseModelArrayList.add(new Ekipoak("Betis", R.mipmap.betis));
        courseModelArrayList.add(new Ekipoak("Real Sociedad", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new Ekipoak("Osasuna", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new Ekipoak("Alaves", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new Ekipoak("Sevilla", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new Ekipoak("Cadiz", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new Ekipoak("Celta de Vigo", R.drawable.ic_launcher_background));
    }

    public static void PlayerList() {
        courseModelArrayList1.add(new Ekipoak("Betis", R.mipmap.betis));
    }

    public static ArrayList<Ekipoak> getCourseModelArrayList1() {
        return courseModelArrayList1;
    }

    public int getImageResource() {
        return  getImageResource();
    }

    public int getName() {
        return  getName();
    }

    public List<Ekipoak> get() {
        return get();
    }
}
