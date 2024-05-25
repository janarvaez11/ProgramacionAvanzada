package com.example.appgroup;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        public void onWindowInsetsChanged(WindowInsetsCompat insets) {
            Insets insets = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            ViewCompat.setPaddingRelative(
                view,
                ViewCompat.getPaddingStart(view),
                ViewCompat.getPaddingTop(view),
                ViewCompat.getPaddingEnd(view),
                insets.bottom
            );
        }

    }
}