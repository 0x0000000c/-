package zx.com.myphonenumber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends BaseAdapter
{
	private Context context;
    private List<PhoneInfo> lists;
	private LinearLayout layout;
	public MyAdapter(List<PhoneInfo> lists,Context context)
	{

	}
	@Override
	public int getCount()
	{
		return lists.size();
	}

	@Override
	public Object getItem(int position)
	{
		return lists.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ViewHolder holder;
		if(convertView==null)
		{
			convertView=LayoutInflater.from(context).inflate(R.layout.view,null);
			holder=new ViewHolder();
			holder.nametv= ( TextView ) convertView.findViewById(R.id.name);
			holder.numbertv= ( TextView ) convertView.findViewById(R.id.mub);
		    holder.nametv.setText(lists.get(position).getName());
			holder.numbertv.setText(lists.get(position).getName());
		     convertView.setTag(holder);
		}else
		{
			holder= ( ViewHolder ) convertView.getTag();
		}
		return convertView;
	}
	private static class ViewHolder
	{
		TextView nametv;
		TextView numbertv;
	}
}
