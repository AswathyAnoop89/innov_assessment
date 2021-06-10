package com.firstexample.newproject;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {
    // creating a variable for array list and context.
    private ArrayList<CourseModalNew> courseModalArrayList;
    private Context context;
    // creating a constructor for our variables.
    public CourseAdapter(ArrayList<CourseModalNew>
                                 courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public CourseAdapter.ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
// below line is to inflate our layout.
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_itemnew, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.ViewHolder holder, int position) {
// setting data to our views of recycler view.
        CourseModalNew modal =
                courseModalArrayList.get(position);
        holder.idTv.setText(modal.get_id());

        holder.nameTV.setText(modal.getName());
        holder.latTV.setText(modal.getLat());
        holder.lngIV.setText(modal.getLng());
    }
    @Override
    public int getItemCount() {
// returning the size of array list.
        return courseModalArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our views.
        private TextView idTv, nameTV,
                latTV,lngIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
// initializing our views with their ids.
            idTv = itemView.findViewById(R.id.id_id);
            nameTV= itemView.findViewById(R.id.id_Name);
            latTV = itemView.findViewById(R.id.id_lat);
            lngIV= itemView.findViewById(R.id.id_lng);

        }
    }
}
