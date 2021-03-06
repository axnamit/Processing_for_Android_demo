package com.example.processsingprojectforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import processing.android.CompatUtils;
import processing.android.PFragment;
import processing.core.PApplet;

public class MainActivity extends AppCompatActivity {
    private PApplet sketch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frame = new FrameLayout(this);
        frame.setId(CompatUtils.getUniqueViewId());
        setContentView(frame, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        sketch = new sketch();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(frame,this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (sketch != null) {
            sketch.onRequestPermissionsResult(
                    requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        if (sketch != null) {
            sketch.onNewIntent(intent);
        }
    }
}


