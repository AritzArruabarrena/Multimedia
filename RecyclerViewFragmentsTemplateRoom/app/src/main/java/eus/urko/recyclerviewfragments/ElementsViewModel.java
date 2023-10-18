package eus.urko.recyclerviewfragments;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import eus.urko.recyclerviewfragments.databinding.ViewholderElementBinding;
import kotlin.jvm.functions.Function1;

public class ElementsViewModel extends AndroidViewModel {

    ElementsRepository elementsRepository;
    MutableLiveData<Element> elementSelected= new MutableLiveData<>();

    MutableLiveData<String> termSearch = new MutableLiveData<>();

    public ElementsViewModel(@NonNull Application application) {
        super(application);

        elementsRepository = new ElementsRepository(application);

    }

    LiveData<List<Element>> resultSearch = Transformations.switchMap(termSearch, new Function1<String, LiveData<List<Element>>>() {
        @Override
        public LiveData<List<Element>> invoke(String input) {
            return elementsRepository.search(input);
        }
    });

    LiveData<List<Element>> search(){
        return resultSearch;
    }


    void select(Element element){
        elementSelected.setValue(element);
    }

    MutableLiveData<Element> selected(){
        return elementSelected;
    }



    void insert(Element element){
        elementsRepository.insert(element);
    }

    void delete(Element element){
        elementsRepository.delete(element);
    }

    void update(Element element, float rating){
        elementsRepository.update(element, rating);
    }

    class ElementViewHolder extends RecyclerView.ViewHolder {
        private final ViewholderElementBinding binding;

        public ElementViewHolder(ViewholderElementBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public void putTermSearch(String t){
        termSearch.setValue(t);
    }
    LiveData<List<Element>> bestRated(){
        return elementsRepository.bestRated();
    }

}
