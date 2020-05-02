package com.ivanodibenedetto.simplepopup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopupActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*0.6f),(int)(height*0.3f));

        Bundle b = getIntent().getExtras();
        if(b!=null) {

            this.setTitle(b.getString("title"));
            bt = findViewById(R.id.idButton);
            tv = findViewById(R.id.idText);

            String btnText = b.getString("buttonText");
            if(btnText!=null)
                bt.setText(btnText);
            tv.setText(b.getString("message"));
        }
    }

    public void closePopup(View view) {
        finish();
    }
}
