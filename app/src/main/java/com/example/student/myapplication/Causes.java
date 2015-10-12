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

    private String[] causemenu = {"Foods", "Drinks", "Environment", "Habits"};
    Integer[] imageId = {R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causes);
        CustomList adapter = new CustomList(Causes.this, causemenu, imageId);
        ListView causeList = (ListView) findViewById(R.id.causeListView);
        causeList.setAdapter(adapter);

        causeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toFoods = new Intent(Causes.this, Foods.class);
                    startActivity(toFoods);
                }
                else if (position == 1) {
                    Intent toDrinks = new Intent(Causes.this, Drinks.class);
                    startActivity(toDrinks);
                }
                else if (position == 2) {
                    Intent toEnvironment = new Intent(Causes.this, Environment.class);
                    startActivity(toEnvironment);
                }
                else if (position == 3) {
                    Intent toHabits = new Intent(Causes.this, Habits.class);
                    startActivity(toHabits);
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
