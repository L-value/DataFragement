package com.example.fragement;

import com.example.fragement01.R;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements MyFragmentListener
{
	private MyFragement fragment;
	private FragmentManager fm;
	private TextView tView;
    public String[] hobby = new String[]{
    	"lol",
    	"music"
    };
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fm = this.getFragmentManager();
		fragment = (MyFragement) fm.findFragmentById(R.id.myfragement01);
		fragment.setMyFragmentListener(this);
		tView = (TextView) findViewById(R.id.tv);
	}
	@Override
	protected void onResume()
	{
		int count = fragment.getListAdapter().getCount();
		Toast.makeText(this, "°®ºÃÊýÁ¿"+count, 1000).show();
		super.onResume();
	}
	@Override
	public void Change(String string)
	{
		tView.setText(string);
		
	}
}
