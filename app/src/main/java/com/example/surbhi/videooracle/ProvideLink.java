package com.example.surbhi.videooracle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//import com.example.surbhi.videooracle.app.R;


public class ProvideLink extends BaseActionbar {

    Button analyze=null;
    String sub = "www.youtube.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseresult);
        analyze = (Button) findViewById(R.id.analyze);

        analyze.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //Implement Request Queue

                String val = analyze.getText().toString();
                if(val.equals("")||val.equals(null))
                {
                    Toast.makeText(getBaseContext(), "Supply a Youtube Link", Toast.LENGTH_LONG).show();
                    analyze.requestFocus(0);
                }
              /*  else if (val.toLowerCase().contains(sub.toLowerCase())==false)
                {
                    Toast.makeText(getBaseContext(), "Supply a Youtube Link", Toast.LENGTH_LONG).show();
                    analyze.requestFocus(0);
                } */
                else
                {

                    Intent choose = new Intent(getApplicationContext(), Chooseresult.class);
                    startActivity(choose);
                }
            }
        });

    }
}
