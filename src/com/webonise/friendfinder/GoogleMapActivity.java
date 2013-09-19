package com.webonise.friendfinder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GoogleMapActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		TextView textView= new TextView(this);
		textView.setText("this is the google map tab");
		setContentView(textView);
	}

}
