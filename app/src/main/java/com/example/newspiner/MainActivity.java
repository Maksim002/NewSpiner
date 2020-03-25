package com.example.newspiner;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.ganfra.materialspinner.MaterialSpinner;

public class MainActivity extends AppCompatActivity {
    private MaterialSpinner textView;
    private TextInputLayout text;
    private Button button;

    private String[] cats;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cats = new String[]{"aaa", "sss", "ddd", "fff"};

        text = findViewById(R.id.text_my_editText1);
        textView = findViewById(R.id.spinner1);


        String[] ITEMS = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ITEMS);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        textView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setSelection(2);
    }
}
