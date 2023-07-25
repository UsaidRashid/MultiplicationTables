package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private EditText getEditText;
    private EditText getGetEditText;
    private EditText getGetGetEditText;
    private EditText getGetGetGetEditText;
    private EditText getGetGetGetGetEditText;
    private EditText getGetGetGetGetGetEditText;
    private EditText getGetGetGetGetGetGetEditText;
    private EditText getGetGetGetGetGetGetGetEditText;

    private EditText getGetGetGetGetGetGetGetGetEditText;
    private EditText getGetGetGetGetGetGetGetGetGetGetEditText;
    private EditText getGetGetGetGetGetGetGetGetGetEditText;

    private EditText getGetGetGetGetGetGetGetGetGetGetGetEditText;

    private EditText n10;
    private EditText n9;
    private EditText n8;
    private EditText n7;
    private EditText n6;
    private EditText n5;
    private EditText n4;
    private EditText n3;
    private EditText n2;
    private EditText n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName2);
        getEditText=findViewById(R.id.editTextNumber);
        getGetEditText=findViewById(R.id.editTextNumber2);
        getGetGetEditText=findViewById(R.id.editTextNumber3);
        getGetGetGetEditText=findViewById(R.id.editTextNumber4);
        getGetGetGetGetEditText=findViewById(R.id.editTextNumber5);
        getGetGetGetGetGetEditText=findViewById(R.id.editTextNumber6);
        getGetGetGetGetGetGetEditText=findViewById(R.id.editTextNumber7);
        getGetGetGetGetGetGetGetEditText=findViewById(R.id.editTextNumber8);
        getGetGetGetGetGetGetGetGetEditText=findViewById(R.id.editTextNumber9);
        getGetGetGetGetGetGetGetGetGetEditText=findViewById(R.id.editTextNumber10);
        getGetGetGetGetGetGetGetGetGetGetEditText=findViewById(R.id.editTextNumber11);

        n1=findViewById(R.id.editTextNumber12);
        n2=findViewById(R.id.editTextNumber13);
        n3=findViewById(R.id.editTextNumber14);
        n4=findViewById(R.id.editTextNumber15);
        n5=findViewById(R.id.editTextNumber16);
        n6=findViewById(R.id.editTextNumber17);
        n7=findViewById(R.id.editTextNumber18);
        n8=findViewById(R.id.editTextNumber19);
        n9=findViewById(R.id.editTextNumber20);
        n10=findViewById(R.id.editTextNumber21);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(getEditText.getText().toString());
                getGetEditText.setText(n);
                getGetGetEditText.setText(n);
                getGetGetGetEditText.setText(n);
                getGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetGetGetGetGetEditText.setText(n);
                getGetGetGetGetGetGetGetGetGetGetEditText.setText(n);
                int k2=n*2;
                int k3=n*3;
                int k4=n*4;
                int k5=n*5;
                int k6=n*6;
                int k7=n*7;
                int k8=n*8;
                int k9=n*9;
                int k10=n*10;
                n1.setText(n);
                n2.setText(k2);
                n3.setText(k3);
                n4.setText(k4);
                n5.setText(k5);
                n6.setText(k6);
                n7.setText(k7);
                n8.setText(k8);
                n9.setText(k9);
                n10.setText(k10);
            }
        });
    }
}