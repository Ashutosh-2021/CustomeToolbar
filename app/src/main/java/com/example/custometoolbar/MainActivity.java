package com.example.custometoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);


        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My App");
        }

        toolbar.setTitle("My App");
        toolbar.setSubtitle("My sub App");


    }
//  Create a menu


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        set the menu
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    //    Get the menu option
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.new_opt){
            Toast.makeText(this, "New option", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.save_opt) {
            Toast.makeText(this, "Save option", Toast.LENGTH_SHORT).show();
        }
//        Get the Back button id
        else if (itemId == android.R.id.home) {
            Toast.makeText(this, "Home Button", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}