package com.example.fragement;

import com.example.fragement01.R;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class MyFragement extends ListFragment implements OnItemClickListener
{
	private String hobby[] = new String[] { "coding", "anime", "eat", "play",
			"travel" };
	private MainActivity fragmentActivity;
	private MyFragmentListener myFragmentListener;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		fragmentActivity = (MainActivity) this.getActivity();
		hobby[3] = fragmentActivity.hobby[0];
		TextView textView = (TextView) fragmentActivity.findViewById(R.id.tv);
		textView.setText(hobby[4]);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(),
				android.R.layout.simple_list_item_1, android.R.id.text1, hobby);
		this.setListAdapter(arrayAdapter);
		this.getListView().setOnItemClickListener(this);
		super.onActivityCreated(savedInstanceState);
	}

	public MyFragmentListener getMyFragmentListener()
	{
		return myFragmentListener;
	}

	public void setMyFragmentListener(MyFragmentListener myFragmentListener)
	{
		this.myFragmentListener = myFragmentListener;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id)
	{
		myFragmentListener.Change(hobby[position]);
		
	}
}
