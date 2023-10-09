package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ElementsRepository {

    ElementsDB.ElementsDAO elementsDAO;
    Executor executor = Executors.newSingleThreadExecutor();

    ElementsRepository(Application application){
        elementsDAO = ElementsDB.obtainInstance(application).getElementsDAO();
    }
    ElementsRepository(){

    }
    LiveData<List<Element>> get(){
        return elementsDAO.getElements();
    }


    public void insert(Element element) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                elementsDAO.insert(element);
            }
        });
    }

    public void delete(Element element) {

        executor.execute(new Runnable() {
            @Override
            public void run() {
                elementsDAO.delete(element);
            }
        });
    }

    public void update(Element element, float rating) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                element.rating = rating;
                elementsDAO.update(element);
            }
        });

    }
    LiveData<List<Element>> bestRated() {
        return elementsDAO.bestRated();
    }

    LiveData<List<Element>> search(String t) {
        return elementsDAO.search(t);
    }

}
