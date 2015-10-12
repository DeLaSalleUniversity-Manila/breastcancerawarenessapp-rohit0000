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

import java.util.ArrayList;
import java.util.List;

public class TopLevelMenu extends AppCompatActivity {

    private String[] topmenu = {"Information", "Causes", "Prevention", "Help"};
    Integer[] imageId = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level_menu);
        CustomList adapter = new CustomList(TopLevelMenu.this, topmenu, imageId);
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

}
