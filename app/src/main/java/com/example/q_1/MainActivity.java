package com.example.q_1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);

        findViewById(R.id.arrow_up).setOnClickListener(v -> animateBox("up"));
        findViewById(R.id.arrow_down).setOnClickListener(v -> animateBox("down"));
        findViewById(R.id.arrow_left).setOnClickListener(v -> animateBox("left"));
        findViewById(R.id.arrow_right).setOnClickListener(v -> animateBox("right"));
    }

    private void animateBox(String direction) {
        float translationValue = 300f;
        box.animate().cancel();

        switch (direction) {
            case "up":
                box.animate().translationYBy(-translationValue).setDuration(500).withEndAction(() -> box.setTranslationY(0));
                break;
            case "down":
                box.animate().translationYBy(translationValue).setDuration(500).withEndAction(() -> box.setTranslationY(0));
                break;
            case "left":
                box.animate().translationXBy(-translationValue).setDuration(500).withEndAction(() -> box.setTranslationX(0));
                break;
            case "right":
                box.animate().translationXBy(translationValue).setDuration(500).withEndAction(() -> box.setTranslationX(0));
                break;
        }
    }
}
