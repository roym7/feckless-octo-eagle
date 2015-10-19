package eagleeye.eagleeye;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.File;

public class TakePicture extends AppCompatActivity {

    private static final int CAMERA = 1;
    public Uri locationToPhotos;
    public String targetFileName = "building.jpg";

    public void cancel(){

    }

    public void onTakePicPressed(View v) {

        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File targetFile = new File(getExternalFilesDir(null), targetFileName);
        locationToPhotos = Uri.fromFile(targetFile);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, locationToPhotos);
        startActivityForResult(cameraIntent, CAMERA);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {



    }



    // -----------SYSTEM FUNCTIONS------------
    //      added by Mike R
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_picture);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_take_picture, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
