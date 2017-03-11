package com.example.surbhi.videooracle;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chooseresult extends BaseActionbar {

    Button audio=null,video=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseresult);

        audio = (Button) findViewById(R.id.audioresults);
        video = (Button) findViewById(R.id.videoresults);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent send_msg = new Intent(getApplicationContext(), AudioResult.class);
                startActivity(send_msg);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent send_msg = new Intent(getApplicationContext(), VideoResult.class);
                startActivity(send_msg);
            }
        });


    }
}
