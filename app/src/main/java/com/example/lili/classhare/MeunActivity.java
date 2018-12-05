package com.example.lili.classhare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MeunActivity extends AppCompatActivity {

    private Button OpenNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // get the view from activity_menu.xml
        setContentView(R.layout.activity_meun);

        //Locate the button in activity_menu/xml
        OpenNote = (Button) findViewById(R.id.btnView);

        OpenNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //start newActovity.class
                Intent myIntent = new Intent(MeunActivity.this, NoteSelect.class);
                startActivity(myIntent);
            }
        });
    }

}
