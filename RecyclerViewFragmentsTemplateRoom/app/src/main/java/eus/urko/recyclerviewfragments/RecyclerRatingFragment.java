package eus.urko.recyclerviewfragments;

import androidx.lifecycle.LiveData;

import java.util.List;

public class RecyclerRatingFragment  extends  RecyclerFragment{
    @Override
    LiveData<List<Element>> getElements() {
        return elementsViewModel.bestRated();
    }
}
