package com.example.erronka_t4;

import java.util.ArrayList;
import java.util.List;

public class ElementsRepository {

    List<Element> elements = new ArrayList<>();

    ElementsRepository(){
        elements.add(new Element("Android", R.drawable.android_original));
        elements.add(new Element("AngularJS" , R.drawable.angularjs_original));
        elements.add(new Element("Bash",R.drawable.bash_original));
        elements.add(new Element("C",R.drawable.c_original));
        elements.add(new Element("Bootstrap",R.drawable.bootstrap_original));
        elements.add(new Element("C++",R.drawable.cplusplus_original));
        elements.add(new Element("C#",R.drawable.csharp_original));
        elements.add(new Element("CSS3",R.drawable.css3_original));
        elements.add(new Element("Java",R.drawable.java_original));
        elements.add(new Element("Unity",R.drawable.unity_original));
        elements.add(new Element("Unreal Engine",R.drawable.unrealengine_original));
    }

    public List<Element> get() {
        return elements;
    }
}
