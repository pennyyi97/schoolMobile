package com.example.sec.sep12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i("DEBUG","Hello at the Main2 Activity");

    }




    public void Gotoback (View ddd){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void NextScene (View bbb){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void Goto3 (View ddd){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
    public void onClick(View v) {
        EditText aa = (EditText) findViewById(R.id.writeTitle);

        TextView bb = (TextView) findViewById(R.id.title);
        bb.setText(aa.getText());
    }
}
