package lv.infinity.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Stats_en extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_en);

        BottomNavigationView bottomNav = findViewById(R.id.navigation);
        bottomNav.setOnNavigationItemSelectedListener(navlistener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new Home()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_Statistics:
                    selectedFragment = new Home();
                    break;
                case R.id.navigation_Offers:
                    selectedFragment = new Offer();
                    break;
                case R.id.navigation_Shop:
                    selectedFragment = new Shop();
                    break;
                case R.id.navigation_Call:
                    selectedFragment = new Call();
                    break;
                case R.id.navigation_Profile:
                    selectedFragment = new User();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedFragment).commit();
            return true;
        }
    };

}
