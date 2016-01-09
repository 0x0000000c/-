package zx.com.myphonenumber;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;


public class GetNumber
{
	public static List<PhoneInfo> lists=new ArrayList<PhoneInfo>();
	public static String getNumber(Context context)
	{
		Cursor cursor=context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
	    String phoneNumber; //获取号码
		String phoneName; //获取名字
		while ( cursor.moveToNext() )
	    {
		    phoneNumber=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            phoneName=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
		    PhoneInfo phoneInfo=new PhoneInfo(phoneName,phoneNumber);
		    lists.add(phoneInfo);
	    }
		return  null;
 	}
}
