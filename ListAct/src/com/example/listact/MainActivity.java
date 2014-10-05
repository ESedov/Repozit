package com.example.listact;

import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity 
{
	ArrayAdapter<String> adapter;
	ArrayList<String> list = new ArrayList<String>();
	EditText editText1;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText1= (EditText) findViewById(R.id.editText1);
	    adapter = new ArrayAdapter<String>(this,
	        android.R.layout.simple_list_item_1, list);
	    ListView lvMain = (ListView) findViewById(R.id.lvMain);
	    lvMain.setAdapter(adapter);
	    
	    lvMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
	    {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				adapter.remove(adapter.getItem(position));
				return false;
			}
		});
	}
	
	public void BClick(View view)  
	{  
	    Toast.makeText(this, "Добавлено", Toast.LENGTH_SHORT).show();  
	    list.add(editText1.getText().toString());
		adapter.notifyDataSetChanged();
		editText1.setText("");
	}  
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
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
