package com.ivanodibenedetto.simplepopup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class Popup extends Activity {
    private String title;
    private String message;
    private String buttonText;
    private Context context;

    public Popup(Context context, String title, String message){
        this.context = context;
        this.title = title;
        this.message = message;
    }
    public Popup(Context context,String title, String message, String buttonText){

        this.context = context;
        this.title = title;
        this.message = message;
        this.buttonText = buttonText;
    }

    public void Create(){

        Intent i = new Intent (context, PopupActivity.class);
        i.putExtra("title",title);
        i.putExtra("body",message);
        if(buttonText!=null)
            i.putExtra("buttonText",buttonText);
        context.startActivity(i);
    }
}
