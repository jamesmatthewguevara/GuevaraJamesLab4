package com.guevara.james;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(){
        super.onStart();
        Log.d("logs", "Oncreate() was called");
    }
    protected void onStart(){
        super.onStart();
        Log.d("logs", "Application has started running");
    }

    protected void onResume(){
        super.onResume();
        Log.d("logs", "Application has resumed running");
    }

    protected void onPause(){
        super.onPause();
        Log.d("logs", "Application is on Pause");
    }

    protected void onStop(){
        super.onStop();
        Log.d("logs", "Application has stopped running");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("logs", "Application has restarted");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("logs", "Application has been destroyed");
    }

    protected Button toastButton;
    String myToast = "You have tapped the back button";
    protected Button snackbarButton;
    View run;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastButton = (Button)findViewById(R.id.button);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),myToast,Toast.LENGTH_LONG).show();
            }
        });

        snackbarButton = (Button)findViewById(R.id.button3);
        run = findViewById(android.R.id.content);

        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(run, "You have tapped the next button", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
