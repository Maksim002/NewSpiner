package com.example.newspiner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Moto extends AppCompatActivity {

    private AutoCompleteTextView myEditText1;
    private Integer number;
    private String[] cats1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);

        String[] cats = {"aaa", "sss", "ddd", "fff"};

        Intent intent = getIntent();


        cats1 = new String[] {intent.getStringExtra("name")};

        int position = 0;

        for (int i = 0; i == cats.length; i++){
            for (int b = 0; b == cats1.length; i++){

            }
        }

        myEditText1 = findViewById(R.id.myEditText1);

        ArrayAdapter myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, cats1);
        myEditText1.setAdapter(myAdapter);

        myEditText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                myEditText1.showDropDown();
            }
        });


    }
}
