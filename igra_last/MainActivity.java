package com.example.igrav1;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	ImageButton button1;
	ImageButton button2;
	ImageButton button3;
	ImageButton button5;
	ImageButton button4;
	ImageButton button6;
	TextView Score;
	TextView Missed;
	private int number;
	final Handler handler = new Handler();
	int taim = 2500;
	int score = 1;
	public int missed = 0;
	boolean flaq = false;
	public void run1() {
		handler.postDelayed(new Runnable() 
    	{
            @Override
            public void run() {
            	if (score == 10)
            	taim = 2000;
            	if (score == 20)
            		taim = 1500;
            	if(score == 30)
            		taim = 1000; 
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
            
    	}, taim);
    }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	   	button1 = (ImageButton) findViewById(R.id.imageButton1);
	   	button2 = (ImageButton) findViewById(R.id.imageButton2);
	   	button3 = (ImageButton) findViewById(R.id.imageButton3);
	   	button4 = (ImageButton) findViewById(R.id.imageButton4);
	   	button5 = (ImageButton) findViewById(R.id.imageButton5);
	   	button6 = (ImageButton) findViewById(R.id.imageButton7);
	   	Score = (TextView) findViewById(R.id.textView1);
	   	Missed = (TextView) findViewById(R.id.textView2);
	   	run1();
        registerListeners();
    	}
	
	 public void registerListeners ()
	 {
		 button1.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 if(missed < 3)
				 {
				 if (button1.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button1.setImageResource(R.drawable.ic2);
					 	 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button1.setImageDrawable(null);
						 }
					 }, 100); 
				 }
				 run1();
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();  
				 }
			 }
		 });
		 button2.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 if(missed < 3)
				 {
				 if (button2.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button2.setImageResource(R.drawable.ic2);
						 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button2.setImageDrawable(null);
						 }
					 }, 100); 
				 }
				 run1();
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();
				 }
			 }
		 });
		 button3.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 if(missed < 3)
				 {
				 if (button3.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button3.setImageResource(R.drawable.ic2);
						 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button3.setImageDrawable(null);
						 }
					 }, 100);
				 }
				 run1();
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();
				 }
			 }
		 });
		 button4.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) 
			 {
				if(missed < 3)
				 {
				 if (button4.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button4.setImageResource(R.drawable.ic2);
					 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button4.setImageDrawable(null);
						 }
					 }, 100); 
				 }
				 run1();
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();
				 }
			 }
		 });
		 button5.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 {
				 if(missed < 3)
				 {
				 if (button5.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button5.setImageResource(R.drawable.ic2);
					 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button5.setImageDrawable(null);
						 }
					 }, 100); 
				 }
				 run1();
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();
				 }
			 }
		 });
		 button6.setOnClickListener(new View.OnClickListener(){
			 public void onClick(View v) 
			 { 
				
				 if(missed < 3)
				 {
				 if (button6.getDrawable() == null)
				 {
					 missed++;
				 }
				 else
				 {
					 Missed.setText(Integer.toString(score++));
					 button6.setImageResource(R.drawable.ic2);
					 handler.postDelayed(new Runnable() 
					 {
						 public void run()
						 {
					 button6.setImageDrawable(null);
						 }
					 }, 100); 
				 }
				 }
				 else
				 {
					 Missed.setText("Fail");
					 Toast.makeText(MainActivity.this, "Ты проиграл", Toast.LENGTH_SHORT).show();
				 }
				 
		 }
		 });
		 
	 }
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
