package com.example.live_at_newcastle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Accommodation extends Activity implements OnClickListener
{
	private Button button1;
	private Button button2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accom);
		
		button1 = (Button)findViewById(R.id.button1);
	    button2 = (Button)findViewById(R.id.button2);
	    
	    button1.setOnClickListener(this);
	    button2.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	/*Code to be implemented for when buttons are pressed*/
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
