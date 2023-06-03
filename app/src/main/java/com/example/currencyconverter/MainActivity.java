package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button dollar , riyal , pound;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar = findViewById(R.id.dollar);
        riyal = findViewById(R.id.riyal);
        pound = findViewById(R.id.pound);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = editText.getText().toString();

                if (TextUtils.isEmpty(a))
                {
                    editText.setError("PLease input for convert");
                }
                else
                {
                    double n , k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 82.37;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });

        riyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = editText.getText().toString();

                if (TextUtils.isEmpty(a))
                {
                    editText.setError("PLease input for convert");
                }
                else
                {
                    double n , k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 21.95;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });


        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = editText.getText().toString();

                if (TextUtils.isEmpty(a))
                {
                    editText.setError("PLease input for convert");
                }
                else
                {
                    double n , k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 99.04;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                }
            }
        });
    }
}
