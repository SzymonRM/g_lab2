package com.example.z2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnCreate");
        Toast.makeText(this, "metoda OnCreate", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        Log.d("Lab2", "metoda OnResume");
        Toast.makeText(this, "metoda OnResume", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Lab2", "metoda onPause");
        Toast.makeText(this, "metoda onPause", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Lab2", "metoda onStop");
        Toast.makeText(this, "metoda onStop", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Lab2", "metoda onDestroy");
        Toast.makeText(this, "metoda onDestroy", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Lab2", "metoda onRestart");
        Toast.makeText(this, "metoda onRestart", Toast.LENGTH_SHORT);
    }
}
