package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 3) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex += 1;
                } else if (mStoryIndex == 2 || mStoryIndex == 4) {
                    mStoryText.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex += 2;
                } else if (mStoryIndex == 2 || mStoryIndex == 4) {
                    mStoryText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    mStoryText.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });


    }
}
