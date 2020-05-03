package com.ivanodibenedetto.simplepopup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class SimplePopup extends Activity {
    private String title;
    private String message;
    private String buttonText;
    private Context context;


    public SimplePopup(Context context, String title, String message, String buttonText){

        this.context = context;
        this.title = title;
        this.message = message;
        this.buttonText = buttonText;
    }

    public void Create(){

        Intent i = new Intent (context, PopupActivity.class);
        i.putExtra("title",title);
        i.putExtra("message",message);
        i.putExtra("buttonText",buttonText);
        context.startActivity(i);
    }
}
