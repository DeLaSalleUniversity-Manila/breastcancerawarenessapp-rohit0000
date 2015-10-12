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

public class Information extends AppCompatActivity {

    private String[] infomenu = {"History", "Statistics", "Treatment"};
    Integer[] imageId = {R.drawable.image5, R.drawable.image6, R.drawable.image7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        CustomList adapter = new CustomList(Information.this, infomenu, imageId);
        ListView infoList = (ListView) findViewById(R.id.informationListView);
        infoList.setAdapter(adapter);
        infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toHistory = new Intent(Information.this, History.class);
                    startActivity(toHistory);
                }
                else if (position == 1) {
                    Intent toStats = new Intent(Information.this, Statistics.class);
                    startActivity(toStats);
                }
                else if (position == 2) {
                    Intent toTreatment = new Intent(Information.this, Treatment.class);
                    startActivity(toTreatment);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_information, menu);
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
