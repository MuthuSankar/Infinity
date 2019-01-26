package lv.amigo.amigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityHome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.button).setOnClickListener(engPage());
        findViewById(R.id.button2).setOnClickListener(latPage());
        findViewById(R.id.button3).setOnClickListener(rusPage());
    }
    public View.OnClickListener engPage() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityHome.this.goToActivity(EnglishActivity.class);
            }
        };
    }

    public View.OnClickListener latPage() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityHome.this.goToActivity(LatvianActivity.class);
            }
        };
    }

    public View.OnClickListener rusPage() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityHome.this.goToActivity(RussianActivity.class);
            }
        };
    }
    public void goToActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
