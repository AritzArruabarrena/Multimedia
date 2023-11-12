package com.example.multimediakolana;

import android.content.Context;
import android.sax.Element;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Jokalariak> playerList;

    public CourseRVAdapter(Context context, ArrayList<Jokalariak> playerList) {
        this.context = context;
        this.playerList = playerList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.playerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Jokalariak player = playerList.get(position);

        // Bind data to the views in the ViewHolder
        holder.playerNameTextView.setText(player.getJokalariakName());
        holder.imageViewPlayer.setImageResource(player.getImage());
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView playerNameTextView;
        ImageView imageViewPlayer;

        public ViewHolder(View itemView) {
            super(itemView);
            playerNameTextView = itemView.findViewById(R.id.idTVCoursePlayer);
            imageViewPlayer = itemView.findViewById(R.id.imageViewPlayer);
        }
    }
}


