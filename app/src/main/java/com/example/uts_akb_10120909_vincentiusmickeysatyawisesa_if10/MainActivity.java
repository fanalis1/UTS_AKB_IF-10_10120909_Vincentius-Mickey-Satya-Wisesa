package com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

//  Nama  : Vincentius Mickey Satya Wisesa
//  Kelas : IF-10
//  Nim   : 10120909
//  UTS Project My Self Apps Aplikasi Komputasi Bergerak (AKB)

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{

    private BottomNavigationView bottomNavigationView;
    private HomeF homefragment = new HomeF();
    private ActivityF activityfragment = new ActivityF();

    private MusicF muscicfragment = new MusicF();
    private GalleryF galleryfragment = new GalleryF();
    private ProfileF profilefragment = new ProfileF();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homefragment).commit();
        bottomNavigationView = findViewById(R.id.btmview);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homefragment).commit();
                return true;
            case R.id.activity:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, activityfragment).commit();
                return true;
            case R.id.music:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, muscicfragment).commit();
                return true;
            case R.id.gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, galleryfragment).commit();
                return true;
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, profilefragment).commit();
                return true;
        }

        return false;
    }


}