package shoppinglist.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import shoppinglist.lib.Methods;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ItemList extends ListActivity {

	//
	static List<ShoppingItem> list;
	
	//
	static ItemListAdapter adapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		/*----------------------------
		 * Steps
		 * 1. Super
		 * 2. Set content
		 * 3. Prepare data => List<ShoppingItem>
		 * 4. Set up adapter
		----------------------------*/
		super.onCreate(savedInstanceState);

		//
		setContentView(R.layout.itemlist);

//		// debug
//		Toast.makeText(ItemList.this, "ItemList => Started", 2000).show();
		
		/*----------------------------
		 * 3. Prepare data => List<ShoppingItem>
			----------------------------*/
		setList();
//		//
//		List<ShoppingItem> list = new ArrayList<ShoppingItem>();
//		
//		//
//		DBManager dbm = new DBManager(this);
//		
//		SQLiteDatabase db = dbm.getReadableDatabase();
//		
//		Cursor c = db.query(
//										DBManager.tableName, 
////										DBManager.columns,
//										DBManager.columns_with_index,
//										null, null, null, null, null);
//		
//		//
//		c.moveToFirst();
//		
//		for (int i = 0; i < c.getCount(); i++) {
//			// Log
//			Log.d("ItemList.java" + "["
//					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//					+ "]", "c.getString(0) => " + c.getString(0));
//			Log.d("ItemList.java" + "["
//					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//					+ "]", "c.getString(1) => " + c.getString(1));
//			Log.d("ItemList.java" + "["
//					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//					+ "]", "c.getString(4) => " + c.getString(4));
//			
//			//
//			ShoppingItem item = new ShoppingItem(
//									c.getString(0),		// store
//									c.getString(1),		// name
//									c.getInt(2),			// price
//									c.getString(3),		// genre
//									c.getInt(4)				// id
//									);
//			
//			//
//			list.add(item);
//			
//			//
//			c.moveToNext();
//			
//		}//for (int i = 0; i < c.getCount(); i++)
//		
//		//
//		db.close();
//		
//		/*----------------------------
//		 * 4. Set up adapter
//			----------------------------*/
//		//
//		ItemListAdapter adapter = new ItemListAdapter(
//							this,
//							R.layout.adapteritem,
//							list
//							);
//		
//		//
//		setListAdapter(adapter);
		
	}//public void onCreate(Bundle savedInstanceState)

	private void setList() {
		//
		list = new ArrayList<ShoppingItem>();
		
		//
		DBManager dbm = new DBManager(this);
		
		SQLiteDatabase db = dbm.getReadableDatabase();
		
		Cursor c = db.query(
										DBManager.tableName, 
//										DBManager.columns,
										DBManager.columns_with_index,
										null, null, null, null, null);
		
		//
		c.moveToFirst();
		
		for (int i = 0; i < c.getCount(); i++) {
			// Log
			Log.d("ItemList.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "c.getString(0) => " + c.getString(0));
			Log.d("ItemList.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "c.getString(1) => " + c.getString(1));
			Log.d("ItemList.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "c.getString(4) => " + c.getString(4));
			
			//
			ShoppingItem item = new ShoppingItem(
									c.getString(0),		// store
									c.getString(1),		// name
									c.getInt(2),			// price
									c.getString(3),		// genre
									c.getInt(4)				// id
									);
			
			//
			list.add(item);
			
			//
			c.moveToNext();
			
		}//for (int i = 0; i < c.getCount(); i++)
		
		//
		db.close();
		
		/*----------------------------
		 * 4. Set up adapter
			----------------------------*/
		//
		adapter = new ItemListAdapter(
							this,
							R.layout.adapteritem,
							list
							);
		
		//
		setListAdapter(adapter);
		
	}//private void setList()

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// 
		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.itemlist, menu);
		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO 自動生成されたメソッド・スタブ
		switch (item.getItemId()) {
		case R.id.menu_listitem_filter:

			Methods.dlg_filterList(this);
			
			break;
		
		}//switch (item.getItemId())
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
	}

	@Override
	protected void onListItemClick(ListView lv, View v, int position, long id) {
		// TODO 自動生成されたメソッド・スタブ
		super.onListItemClick(lv, v, position, id);
		
		ShoppingItem si = (ShoppingItem) lv.getItemAtPosition(position);
		
		// Log
		Log.d("ItemList.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "si.toString() => " + si.toString());
				+ "]", 
				"si.getName() => " + si.getName()+
				"/" + "id=" + si.getId());
		
		
	}//protected void onListItemClick(ListView l, View v, int position, long id)
}
