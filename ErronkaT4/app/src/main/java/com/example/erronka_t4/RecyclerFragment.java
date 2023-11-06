package com.example.erronka_t4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import com.example.erronka_t4.databinding.ActivityMainBinding;
import com.example.erronka_t4.databinding.GridItemBinding;

public class RecyclerFragment extends Fragment {

    private GridItemBinding binding;
    private ActivityMainBinding activityMainBinding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = GridItemBinding.inflate(inflater, container, false)).getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        elementsViewModel = new ViewModelProvider(requireActivity()).get(ElementsViewModel.class);
        navController = Navigation.findNavController(view);
        ElementsAdapter elementsAdapter = new ElementsAdapter();
        binding.GridItemBinding.setAdapter(elementsAdapter);
    }

    class ElementsAdapter extends RecyclerView.Adapter<ElementViewHolder> {

        List<Element> elements;

        @NonNull
        @Override
        public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ElementViewHolder(GridItemBinding.inflate(getLayoutInflater(), parent, false));
        }
        @Override
        public void onBindViewHolder(@NonNull ElementViewHolder holder, int position) {

            Element element = elements.get(position);

            holder.binding.name.setText(element.name);
            holder.binding.gridImage.setImageResource(element.image);
        }
        @Override
        public int getItemCount() {
            return elements != null ? elements.size() : 0;
        }

        public void establishList(List<Element> elements){
            this.elements = elements;
            notifyDataSetChanged();
        }
    }
    class ElementViewHolder extends RecyclerView.ViewHolder {
        private final GridItemBinding binding;

        public ElementViewHolder(GridItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}