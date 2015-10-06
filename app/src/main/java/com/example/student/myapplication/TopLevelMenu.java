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

public class TopLevelMenu extends AppCompatActivity {

    private String[] topmenu = {"Information", "Causes", "Prevention", "Help"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level_menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, topmenu);
        ListView menuList = (ListView) findViewById(R.id.toplevelListView);
        menuList.setAdapter(adapter);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toInformation = new Intent(TopLevelMenu.this, Information.class);
                    startActivity(toInformation);
                } else if (position == 1) {
                    Intent toCauses = new Intent(TopLevelMenu.this, Causes.class);
                    startActivity(toCauses);
                } else if (position == 2) {
                    Intent toPrevention = new Intent(TopLevelMenu.this, Prevention.class);
                    startActivity(toPrevention);
                } else if (position == 3) {
                    Intent toHelp = new Intent(TopLevelMenu.this, Help.class);
                    startActivity(toHelp);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top_level_menu, menu);
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
