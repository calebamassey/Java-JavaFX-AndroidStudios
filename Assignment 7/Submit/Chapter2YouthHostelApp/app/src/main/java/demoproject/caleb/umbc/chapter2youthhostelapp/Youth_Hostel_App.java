package demoproject.caleb.umbc.chapter2youthhostelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Youth_Hostel_App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth__hostel__app);

        Button btnInformation = (Button) findViewById(R.id.buttonID);

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Youth_Hostel_App.this, Information_Page.class);
                startActivity(myIntent);
            }
        });
    }
}
