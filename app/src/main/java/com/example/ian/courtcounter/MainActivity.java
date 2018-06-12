package com.example.ian.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message;
    private TextView newText, showText;
    private Button newButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void textView(){
        newText = (TextView) findViewById(R.id.textView1);
        newButton = (Button) findViewById(R.id.button1);
        showText = (TextView) findViewById(R.id.text);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               message = newText.getText().toString();
               Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
               showText.setText(message);
            }
        });

    }

}
