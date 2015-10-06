package com.example.student.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Causes extends AppCompatActivity {

    private String[] causemenu = {"Foods", "Drinks", "Hobbits", "Environment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, causemenu);
        ListView causeList = (ListView) findViewById(R.id.causeListView);
        causeList.setAdapter(adapter);

        causeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toInformation = new Intent(Causes.this, Foods.class);
                    startActivity(toInformation);
                } else if (position == 1) {
                    Intent toCauses = new Intent(Causes.this, Drinks.class);
                    startActivity(toCauses);
                } else if (position == 2) {
                    Intent toPrevention = new Intent(Causes.this, Hobbits.class);
                    startActivity(toPrevention);
                } else if (position == 3) {
                    Intent toHelp = new Intent(Causes.this, Environment.class);
                    startActivity(toHelp);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_causes, menu);
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
