package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ElementsViewModel extends AndroidViewModel {

    ElementsRepository elementsRepository;
    MutableLiveData<List<Element>> listElementsMutableLiveData = new MutableLiveData<>();

    MutableLiveData<Element> elementSelected= new MutableLiveData<>();

    public ElementsViewModel(@NonNull Application application) {
        super(application);

        elementsRepository = new ElementsRepository();

        listElementsMutableLiveData.setValue(elementsRepository.get());
    }

    void select(Element element){
        elementSelected.setValue(element);
    }

    MutableLiveData<Element> selected(){
        return elementSelected;
    }


    MutableLiveData<List<Element>> get(){
        return listElementsMutableLiveData;
    }

    void add(Element element){
        elementsRepository.insert(element, new ElementsRepository.Callback() {
            public void whenFinish(List<Element> elements) {
                listElementsMutableLiveData.setValue(elements);
            }
        });
    }

    void delete(Element element){
        elementsRepository.delete(element, new ElementsRepository.Callback() {
            @Override
            public void whenFinish(List<Element> elements) {
                listElementsMutableLiveData.setValue(elements);
            }
        });
    }

}
