package com.example.androif;

import java.util.Random;

import android.R.layout;
import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity {
	private LinearLayout l1,l2,l3,l4,l5,l6;
    public static int get()
    {
    	int a = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		int c = (int)(Math.random()*255);
		int mycolor1 = Color.argb(a, b, 0, c);
		return mycolor1;
    }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        l1  = (LinearLayout) findViewById(R.id.Lay1);
        l2  = (LinearLayout) findViewById(R.id.Lay2);
        l3  = (LinearLayout) findViewById(R.id.Lay3);
        l4  = (LinearLayout) findViewById(R.id.Lay4);
        l5  = (LinearLayout) findViewById(R.id.Lay5);
        l6  = (LinearLayout) findViewById(R.id.Lay6);
	}

		@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activ_menu, menu);
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	 

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*int id = item.getItemId();
		if (id == R.id.action_settings) {*/
		switch (item.getItemId())
		{
		case R.id.action_settings:
			l1.setBackgroundColor(MainActivity.get());
			l2.setBackgroundColor(MainActivity.get());
			l3.setBackgroundColor(MainActivity.get());
			l4.setBackgroundColor(MainActivity.get());
			l5.setBackgroundColor(MainActivity.get());
			l6.setBackgroundColor(MainActivity.get());
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

	public LinearLayout getLl() {
		return l1;
	}

	public void setLl(LinearLayout l1) {
		this.l1 = l1;
	}
}
