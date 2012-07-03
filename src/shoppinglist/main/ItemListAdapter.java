package shoppinglist.main;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ItemListAdapter extends ArrayAdapter<ShoppingItem> {

	//
	private int resourceId; 
	
	public ItemListAdapter(Context context, int textViewResourceId,
												List<ShoppingItem> list) {
		super(context, textViewResourceId, list);
		// TODO 自動生成されたコンストラクター・スタブ
		
		this.resourceId = textViewResourceId;
		
		
	}//public ItemListAdapter()

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO 自動生成されたメソッド・スタブ
		
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resourceId, null);
        }

        //
        TextView tv_item_name = 
        				(TextView) convertView.findViewById(R.id.adapteritem_LL_item_name);
        TextView tv_store = 
				(TextView) convertView.findViewById(R.id.adapteritem_tv_store);
        TextView tv_price = 
				(TextView) convertView.findViewById(R.id.adapteritem_tv_price);

        //
        ShoppingItem si = (ShoppingItem) getItem(position);
        
        // Log
		Log.d("ItemListAdapter.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "si.getName() => " + si.getName());
		
		
		return super.getView(position, convertView, parent);
	}//public View getView(int position, View convertView, ViewGroup parent)

}//public class ItemListAdapter extends ArrayAdapter<ShoppingItem>
