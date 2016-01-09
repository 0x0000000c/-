package zx.com.myphonenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
	private MyAdapter myAdapter;
    private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GetNumber.getNumber(this);
		listView= ( ListView ) findViewById(R.id.listView);
		myAdapter=new MyAdapter(GetNumber.lists,this);
		listView.setAdapter(myAdapter);
	}
}
