package com.example.android.quizapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.android.quizapp.R.id.btnDisplay;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void submitAnswers(View v) {
        RadioButton rbRivers = (RadioButton) findViewById(R.id.radioMissouri);
        RadioButton rbMountain = (RadioButton) findViewById(R.id.radioDenali);
        EditText edSouthern = (EditText) findViewById(R.id.state_entry);
        CheckBox checkWyoming = (CheckBox) findViewById(R.id.wyoming_checkbox);
        boolean hasWyoming = checkWyoming.isChecked();
        CheckBox checkAlaska = (CheckBox) findViewById(R.id.alaska_checkbox);
        boolean hasAlaska = checkAlaska.isSelected();
        CheckBox checkVermont = (CheckBox) findViewById(R.id.vermont_checkbox);
        boolean hasVermont = checkVermont.isSelected();
        CheckBox checkDelaware = (CheckBox) findViewById(R.id.delaware_checkbox);
        boolean hasDelaware = checkDelaware.isSelected();


        if (rbRivers.isChecked() && rbMountain.isChecked() && edSouthern.getText().toString().equals("Hawaii")
        && hasWyoming && hasAlaska && hasVermont && hasDelaware)

            {Toast.makeText(this, "You are Right! 4/4", Toast.LENGTH_SHORT).show();
            }

        else {
            Toast.makeText(this, "Sorry Try Again!", Toast.LENGTH_SHORT).show();
                            }
    }


}
