package com.example.tere.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

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


    public void mostrarmensaje(View v) {
        Toast.makeText(this, "message",
                Toast.LENGTH_SHORT).show();

    }

    public Random rand = new Random();
    public Random rand1 = new Random();

    public void Boton(View view) {
        rand = new Random();

        int n1 = rand.nextInt(100);
        int n2 = rand1.nextInt(100);
        if (view.getId() == R.id.button && n1 > n2) {
            Toast.makeText(this, "Ganó", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button2 && n2 > n1) {
            Toast.makeText(this, "Ganó", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(this, "Perdió", Toast.LENGTH_SHORT).show();
        }

        ((Button) findViewById(R.id.button)).setText(String.valueOf(n1));
        ((Button) findViewById(R.id.button2)).setText(String.valueOf(n2));
    }

}