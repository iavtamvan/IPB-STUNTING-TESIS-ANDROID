package com.iav.ipb.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iav.ipb.R;
import com.iav.ipb.adapter.MateriAdapter;
import com.iav.ipb.data.MateriData;
import com.iav.ipb.model.MateriModel;

import java.util.ArrayList;

public class MateriActivity extends AppCompatActivity {

    private ArrayList<MateriModel> list;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(MateriData.getMateri());
        showRecyler();
    }

    private void showRecyler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MateriAdapter materiAdapter = new MateriAdapter(this);
        materiAdapter.setListmateri(list);
        recyclerView.setAdapter(materiAdapter);
    }
}
