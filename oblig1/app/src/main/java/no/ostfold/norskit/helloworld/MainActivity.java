package no.ostfold.norskit.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    boolean test = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        int limit = message.length();
        if(limit < 1) {
            Context context = getApplicationContext();
            CharSequence text = "Skriv inn ditt navn";

            Toast toast = Toast.makeText(context, text, 5000);
            toast.show();
        }
        else {
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }

}
