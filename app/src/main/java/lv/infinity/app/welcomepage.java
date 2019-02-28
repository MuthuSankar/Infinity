package lv.infinity.app;

import android.os.Handler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class welcomepage extends AppCompatActivity {
    private static int SPLASH_TIME = 3000;
    RelativeLayout introMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);

        introMessage = findViewById(R.id.welcome_message_layout);

        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent mySuperIntent = new Intent(welcomepage.this, ActivityHome.class);
            startActivity(mySuperIntent);
            finish();
        }
    }, SPLASH_TIME);
    }
}