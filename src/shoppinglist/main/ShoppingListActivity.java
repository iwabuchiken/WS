package shoppinglist.main;

import shoppinglist.lib.ButtonOnClickListener;
import shoppinglist.lib.ButtonOnTouchListener;
import shoppinglist.lib.Methods;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

//public class ShoppingListActivity extends ListActivity {
public class ShoppingListActivity extends Activity {
	
	public static Vibrator vib;
	
//	public static String[] registerItems = {"品物", "店舗", "ジャンル"};
	
//	public static enum registerChoice = {
	public static enum registerChoice {
		items, stores, genres,
	};
			
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	/*----------------------------
		 * Steps
		 * 1. Set up
		 * 		1. super
		 * 		2. Content view
		 * 		3. vib
		 * 2. Add listeners
			----------------------------*/
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppinglist);
        
        vib = (Vibrator) this.getSystemService(this.VIBRATOR_SERVICE);
        
        /*----------------------------
		 * 2. Add listeners
			----------------------------*/
		add_listeners();
        
        
    }//public void onCreate(Bundle savedInstanceState)

	private void add_listeners() {
		/*----------------------------
		 * Steps
		 * 1. tv_list
		 * 2. tv_register
		 * 3. tv_db
			----------------------------*/
		
		// 
		TextView tv_list = (TextView) findViewById(R.id.sl_tv_item_list);
		
		
		
		tv_list.setTag(Methods.ButtonTags.sl_main_bt_item_list);
		
		tv_list.setOnTouchListener(new ButtonOnTouchListener(this));
		tv_list.setOnClickListener(new ButtonOnClickListener(this));
		
		/*----------------------------
		 * 2. tv_register
			----------------------------*/
		TextView tv_register = (TextView) findViewById(R.id.sl_tv_register);
		
		tv_register.setTag(Methods.ButtonTags.sl_main_bt_register);
		
		tv_register.setOnTouchListener(new ButtonOnTouchListener(this));
		tv_register.setOnClickListener(new ButtonOnClickListener(this));
		
		/*----------------------------
		 * 3. tv_db
			----------------------------*/
		TextView tv_db = (TextView) findViewById(R.id.sl_tv_db);
		
		tv_db.setTag(Methods.ButtonTags.sl_main_bt_db);
		
		tv_db.setOnTouchListener(new ButtonOnTouchListener(this));
		tv_db.setOnClickListener(new ButtonOnClickListener(this));
		
//		Methods.setOnTouchListener_button(this, Methods.ViewNames.TV, 
//				Methods.ButtonTags.sl_main_bt_item_list, R.id.sl_tv_item_list);
//		
//		Methods.setOnTouchListener_button(this, Methods.ViewNames.TV, 
//				Methods.ButtonTags.sl_main_bt_register, R.id.sl_tv_register);
//		
//		Methods.setOnTouchListener_button(this, Methods.ViewNames.TV, 
//				Methods.ButtonTags.sl_main_bt_db, R.id.sl_tv_db);
		
		
	}//private void add_listeners()

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// 
		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.listmenu, menu);

		
		
		return super.onCreateOptionsMenu(menu);
	}//public boolean onCreateOptionsMenu(Menu menu)

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO 自動生成されたメソッド・スタブ
		switch (item.getItemId()) {
			case R.id.v1_menu_add_item:
				//
				Intent i = new Intent();
				
				//
				i.setClass(this, RegisterItem.class);
				
				//
				startActivity(i);
				
				break;
			
			case R.id.v1_menu_item_list:
				//
				i = new Intent();
				i.setClass(this, ItemList.class);
				startActivity(i);
				
				break;
				
			case R.id.v1_menu_register_store:
				//
				Methods.register_store(this);
				
				break;
				
			case R.id.v1_menu_add_genre:
				//
				Methods.registerGenre(this);
				
				break;
				
			case R.id.v1_menu_db_manager:
				//
				i = new Intent();
				i.setClass(this, DBAdminActivity.class);
				startActivity(i);
				
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
    
    
    
}//public class ShoppingListActivity extends ListActivity
