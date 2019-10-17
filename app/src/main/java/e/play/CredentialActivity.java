package e.play;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import e.play.HttpdServer.Server;


public class CredentialActivity extends AppCompatActivity {

    private static final String LOG_TAG = "e.foundation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cred);
        TextView textView = (TextView) findViewById(R.id.main_text);
        textView.setText("Credentials!");
        Log.d(LOG_TAG, "Credentials Activity!");
        try {
            new Server();


        } catch (IOException e) {
            Log.d(LOG_TAG, "ouch server error: " + e.getLocalizedMessage());
        }
    }

    private void signInCredentials() {


    }
}
