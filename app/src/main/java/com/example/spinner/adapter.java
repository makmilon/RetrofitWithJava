package com.example.spinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.myholder> {

    ArrayList<ObjectDataClass> objectList;

    public adapter(ArrayList<ObjectDataClass> objectList) {
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
          holder.id.setText(objectList.get(position).getId());
          holder.name.setText(objectList.get(position).getName());
          holder.resource.setText(objectList.get(position).getResource());
          holder.updateAt.setText(objectList.get(position).getUpdated_at());
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class myholder extends RecyclerView.ViewHolder{

        TextView id, name, resource, updateAt;

        public myholder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.item_id);
            name=itemView.findViewById(R.id.item_name);
            resource=itemView.findViewById(R.id.item_reso);
            updateAt=itemView.findViewById(R.id.item_updated);
        }
    }
}
