package com.gookkis.nofindviewbyid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gookkis.nofindviewbyid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        KlikHandlers handlers = new KlikHandlers();
        activityMainBinding.setHandlers(handlers);
        activityMainBinding.hello.setText("Gak make Data Binding");

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_fragment, new ContohFragment())
                    .commit();
        }
    }

    public class KlikHandlers {
        public void onGantiText(View view) {
            activityMainBinding.hello.setText("Textnya Ganti");
        }
    }
}
