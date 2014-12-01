package com.example.igrav1;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
//private LinearLayout l1,l2,l3,l4,l5,l6;
	ImageButton button1;
	ImageButton button2;
	ImageButton button3;
	ImageButton button5;
	ImageButton button4;
	ImageButton button6;
	private int number;
	final Handler handler = new Handler();
	public static int get()
    {
    	int a = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		int c = (int)(Math.random()*255);
		int mycolor1 = Color.rgb(a, b, c);
		return mycolor1;
    }
	
	public void run1() {
		handler.postDelayed(new Runnable() 
    	{
            @Override
            public void run() {
    	Random ranNum = new Random();
        number = ranNum.nextInt(6) + 1;
switch(number)
	{
	case 1: button1.setImageResource(R.drawable.ic1); break;
	case 2: button2.setImageResource(R.drawable.ic1); break;
	case 3: button3.setImageResource(R.drawable.ic1); break;
	case 4: button4.setImageResource(R.drawable.ic1); break;
	case 5: button5.setImageResource(R.drawable.ic1); break;
	case 6: button6.setImageResource(R.drawable.ic1); break;
    }
            }
    	}, 3000);
    }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		   /* l1  = (LinearLayout) findViewById(R.id.Lay1);
	        l2  = (LinearLayout) findViewById(R.id.Lay2);
	        l3  = (LinearLayout) findViewById(R.id.Lay3);
	        l4  = (LinearLayout) findViewById(R.id.Lay4);
	        l5  = (LinearLayout) findViewById(R.id.Lay5);
	        l6  = (LinearLayout) findViewById(R.id.Lay6); */
	   	button1 = (ImageButton) findViewById(R.id.imageButton1);
	   	button2 = (ImageButton) findViewById(R.id.imageButton2);
	   	button3 = (ImageButton) findViewById(R.id.imageButton3);
	   	button4 = (ImageButton) findViewById(R.id.imageButton4);
	   	button5 = (ImageButton) findViewById(R.id.imageButton5);
	   	button6 = (ImageButton) findViewById(R.id.imageButton7);
	   	run1();
    /*	handler.postDelayed(new Runnable() 
    	{
            @Override
            public void run() {

            	Random ranNum = new Random();
                number = ranNum.nextInt(6);
        switch(number)
			{
			case 1: button1.setImageResource(R.drawable.ic1); break;
			case 2: button2.setImageResource(R.drawable.ic1); break;
			case 3: button3.setImageResource(R.drawable.ic1); break;
			case 4: button4.setImageResource(R.drawable.ic1); break;
			case 5: button5.setImageResource(R.drawable.ic1); break;
			case 6: button6.setImageResource(R.drawable.ic1); break;
	        }
            }
        }, 5000); */
        registerListeners();
    	}
	
	 public void registerListeners ()
	 {
		 button1.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 button1.setImageDrawable(null);
				 run1();
			 }
		 });
		 button2.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 button2.setImageDrawable(null);
				 run1();
			 }
		 });
		 button3.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 button3.setImageDrawable(null);
				 run1();
			 }
		 });
		 button4.setOnClickListener(new View.OnClickListener(){
			 
			public void onClick(View v) 
			 {
				 button4.setImageDrawable(null);
				 run1();
			 }
		 });
		 button5.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 button5.setImageDrawable(null);
				 run1();
			 }
		 });
		 button6.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 button6.setImageDrawable(null);
				 run1();
			 }
		 });
	 }
/*	 public void BClick(View view)  
		{  
		 
	   		Random ranNum = new Random();
            number = ranNum.nextInt(6);
	        handler.postDelayed(new Runnable() {
	            @Override
	            public void run() {
	                // Do something after 5s = 5000ms
	            
	     			switch(number)
	     			{
	     			case 1: button1.setBackgroundColor(Color.BLACK); break;
	     			case 2: button2.setBackgroundColor(Color.BLACK); break;
	     			case 3: button3.setBackgroundColor(Color.BLACK); break;
	     			case 4: button4.setBackgroundColor(Color.BLACK); break;
	     			case 5: button5.setBackgroundColor(Color.BLACK); break;
	     			case 6: button6.setBackgroundColor(Color.BLACK); break;
	     	        }
	            }
	        }, 5000);
		}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
