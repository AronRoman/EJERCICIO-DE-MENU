package com.example.pc_r002.ejerciciomenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.opcion1:
                Toast mitostada = Toast.makeText(getApplicationContext(),"Esto es una tostada",Toast.LENGTH_LONG);
                mitostada.show();
                return true;
            case R.id.opcion2:
                return true;
            case R.id.opcion3:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}




