package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    adapter newAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        Call<MainDataClass> call=
             RetrofitInstance.getInstance().apiInterface.getData("VkwVupNrBp6hqKoi7noSkhpzvqC7XRGnLnWLIOmgeqtFMd1Ksw6TdQxOClec");
         call.enqueue(new Callback<MainDataClass>() {
             @Override
             public void onResponse(Call<MainDataClass> call, Response<MainDataClass> response) {

                 if (response.isSuccessful()){
                    List<ObjectDataClass> objectList= response.body().getData();
                    for (int i=0; i<objectList.size(); i++){

                        newAdapter= new adapter((ArrayList<ObjectDataClass>) objectList);
                        recyclerView.setAdapter(newAdapter);
                        newAdapter.notifyDataSetChanged();

                      /*  Log.d("id", String.valueOf(objectDataClass.getId()));
                        Log.d("name", String.valueOf(objectDataClass.getName()));
                        Log.d("resource", String.valueOf(objectDataClass.getResource()));
                        Log.d("updated_at", String.valueOf(objectDataClass.getUpdated_at()));*/

                    }
                 }
             }

             @Override
             public void onFailure(Call<MainDataClass> call, Throwable t) {

             }
         });
    }
}