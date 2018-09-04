package norskit.github.com.oblig2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ImageView thumbBilde;
    private Bitmap imageBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            thumbBilde.setImageBitmap(imageBitmap);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    public void beOmBildeIntent(View view) {
        Log.e(null, "Pressed beOmBildeIntent()");
        Intent taBildeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(taBildeIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(taBildeIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    public void registerButton(View view) {
        Log.e(null, "Knappen er trykket");
        Intent dispatchRegistrerIntent = new Intent(this, Registrer.class);
        startActivity(dispatchRegistrerIntent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            imageBitmap = (Bitmap) extras.get("data");
            thumbBilde = findViewById(R.id.thumbnailImage);
            thumbBilde.setImageBitmap(imageBitmap);

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
