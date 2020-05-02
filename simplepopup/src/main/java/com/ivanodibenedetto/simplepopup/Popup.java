package com.ivanodibenedetto.simplepopup;

import android.app.Activity;
import android.content.Intent;

public class Popup extends Activity {
    private String title;
    private String message;
    private String buttonText;

    public Popup(String title, String message){
        this.title = title;
        this.message = message;
    }
    public Popup(String title, String message, String buttonText){
        this.title = title;
        this.message = message;
        this.buttonText = buttonText;
    }

    public void Create(){

        Intent i = new Intent (getApplicationContext(), PopupActivity.class);
        i.putExtra("title",title);
        i.putExtra("body",message);
        if(buttonText!=null)
            i.putExtra("buttonText",buttonText);
        startActivity(i);
    }
}
