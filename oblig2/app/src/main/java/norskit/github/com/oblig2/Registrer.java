package norskit.github.com.oblig2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Registrer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(null, "Vi er i klasse Registrer");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrer);
    }

}
