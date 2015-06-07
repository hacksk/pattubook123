package com.pattubookv2.ahk.pattubook;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PATTU BOOK");
        setContentView(R.layout.activity_my);
        Button btnOUT = (Button) findViewById(R.id.button);
        btnOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"OUT", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MyActivity.this, UP.class);
                startActivity(intent);
            }
        });
        Button btnIN = (Button) findViewById(R.id.button2);
        btnIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Toast.makeText(MyActivity.this, "IN", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MyActivity.this, DOWN.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
