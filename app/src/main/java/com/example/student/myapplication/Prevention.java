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

public class Prevention extends AppCompatActivity {

    private String[] preventionmenu = {"Foods", "Drinks", "Environment", "Habits"};
    Integer[] imageId = {R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        CustomList adapter = new CustomList(Prevention.this, preventionmenu, imageId);
        ListView preventionList = (ListView) findViewById(R.id.causeListView);
        preventionList.setAdapter(adapter);

        preventionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toPrevFoods = new Intent(Prevention.this, PrevFoods.class);
                    startActivity(toPrevFoods);
                } else if (position == 1) {
                    Intent toDrinks = new Intent(Prevention.this, PrevDrinks.class);
                    startActivity(toDrinks);
                } else if (position == 2) {
                    Intent toEnvironment = new Intent(Prevention.this, PrevEnvironment.class);
                    startActivity(toEnvironment);
                } else if (position == 3) {
                    Intent toHabits = new Intent(Prevention.this, PrevHabits.class);
                    startActivity(toHabits);
                }
            }
        });
    }

}
