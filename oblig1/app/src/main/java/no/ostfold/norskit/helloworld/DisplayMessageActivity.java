package no.ostfold.norskit.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity{
    Bundle CurrentBundle;
    int amountPressed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CurrentBundle = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_display_message);

        //Henter Intent som startet aktiviteten og drar ut stringen.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //fanger layoute sitt TextView og endrer teksten til bestem string.
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hei " + message);
    }


}
