package com.example.erronka_t4;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ElementsViewModel extends AndroidViewModel {

    ElementsRepository elementsRepository;
    MutableLiveData<List<Element>> listElementsMutableLiveData = new MutableLiveData<>();

    public ElementsViewModel(@NonNull Application application) {
        super(application);

        elementsRepository = new ElementsRepository();

        listElementsMutableLiveData.setValue(elementsRepository.get());
    }


    MutableLiveData<List<Element>> get(){
        return listElementsMutableLiveData;
    }


}

