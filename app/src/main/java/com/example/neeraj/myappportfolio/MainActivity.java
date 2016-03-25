package com.example.neeraj.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void displayToast1(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void displayToast2(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
    }

    public void displayToast3(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
    }

    public void displayToast4(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Build it bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void displayToast5(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ app!", Toast.LENGTH_SHORT).show();
    }

    public void displayToast6(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
