package demoproject.caleb.umbc.chapter3concerttickets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double costPerTicket = 79.99;
    int ticketNum;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tickets = (EditText)findViewById(R.id.editText);
        final Spinner group = (Spinner)findViewById(R.id.group);
        final Button btnCost = (Button)findViewById(R.id.btnCost);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.results));
            @Override
            public void onClick(View v) {
                ticketNum = Integer.parseInt(tickets.getText().toString());
                totalCost = ticketNum * costPerTicket;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));
            }
        });
    }
}
