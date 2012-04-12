package com.fergusllc.listener;


import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;


public class GoogleTVRemoteListenerActivity extends Activity {

	ImageView image;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		image = (ImageView) findViewById(R.id.imageView);

	}
	
	@Override 
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_1:
	    	image.setImageResource(R.drawable.face1);
			return true;
		case KeyEvent.KEYCODE_2:
			image.setImageResource(R.drawable.face2);
			return true;
		case KeyEvent.KEYCODE_3:
			image.setImageResource(R.drawable.face3);
			return true;
		default:
			return super.onKeyDown(keyCode, event);
		}
	}

}