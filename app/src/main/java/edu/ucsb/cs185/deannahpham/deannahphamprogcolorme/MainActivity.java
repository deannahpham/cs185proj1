package edu.ucsb.cs185.deannahpham.deannahphamprogcolorme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Button;
import android.graphics.Color;
import android.view.View.OnClickListener;
import android.widget.Toast;

/**
 * Created by Deanna on 1/22/17.
 */

public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        linearLayout.setWeightSum(3);
        setContentView(linearLayout, layoutParams);

        final Button redButton = new Button(this);
        redButton.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1.0f));
        redButton.setBackgroundColor(Color.WHITE);
        redButton.setText("RED");
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                redButton.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "Red Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
        linearLayout.addView(redButton);

        final Button greenButton = new Button(this);
        greenButton.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1.0f));
        greenButton.setBackgroundColor(Color.WHITE);
        greenButton.setText("GREEN");
        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                greenButton.setBackgroundColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "Green Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
        linearLayout.addView(greenButton);

        final Button blueButton = new Button(this);
        blueButton.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1.0f));
        blueButton.setBackgroundColor(Color.WHITE);
        blueButton.setText("BLUE");
        blueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                blueButton.setBackgroundColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "Blue Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
        linearLayout.addView(blueButton);
    }
}
