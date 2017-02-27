package com.django1.yogesh.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"alia","alone","batman","chloe","deadpool","deepika","dino","joker","kid","logan","nice","padukone","portman","swift"};
        ListView mylistview=(ListView)findViewById(R.id.mylistview);
        ArrayAdapter myadapter=new customadapter(this,names);

        mylistview.setAdapter(myadapter);
        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
