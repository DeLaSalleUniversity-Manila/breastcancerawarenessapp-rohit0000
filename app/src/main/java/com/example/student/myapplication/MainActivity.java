package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] main_menu = {
            "BC Prevention",
            "BC Causes",
            "BC Information",
            "HELP"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToprevention = new Intent(MainActivity.this, BCPrevention.class);
                        startActivity(goToprevention);
                        break;
                    case 1:
                        Intent goTocauses = new Intent(MainActivity.this, BCcauses.class);
                        startActivity(goTocauses);
                        break;
                    case 2:
                        Intent goToinfo = new Intent(MainActivity.this, BCinfo.class);
                        startActivity(goToinfo);
                        break;
                    case 3:
                        Intent goTohelp = new Intent(MainActivity.this, Help.class);
                        startActivity(goTohelp);
                        break;
                }

            }
        });
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
