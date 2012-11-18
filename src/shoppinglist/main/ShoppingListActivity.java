package shoppinglist.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.apache.commons.lang.StringUtils;

import shoppinglist.lib.ButtonOnClickListener;
import shoppinglist.lib.ButtonOnTouchListener;
import shoppinglist.lib.Methods;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

//public class ShoppingListActivity extends ListActivity {
public class ShoppingListActivity extends Activity {
	
	public static Vibrator vib;
	
//	public static String[] registerItems = {"�i��", "�X��", "�W������"};
	
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
        
        //debug
		backup_db();
		
    }//public void onCreate(Bundle savedInstanceState)

    
	private void backup_db() {
		/*----------------------------
		 * memo
			----------------------------*/
		String dirName_ExternalStorage = "/mnt/sdcard-ext";
		
		String dirPath_db_backup = dirName_ExternalStorage + "/ShoppingList_backup";

		String dirPath_db = "/data/data/shoppinglist.main/databases";
		
		String fileName_db_backup_trunk = "shoppinglist_backup";
		String fileName_db_backup_ext = ".bk";

		
		
		String time_label = Methods.get_TimeLabel(Methods.getMillSeconds_now());
		
		String db_src = StringUtils.join(new String[]{dirPath_db, DBManager.name}, File.separator);
		
		String db_dst = StringUtils.join(new String[]{dirPath_db_backup, fileName_db_backup_trunk}, File.separator);
		db_dst = db_dst + "_" + time_label + fileName_db_backup_ext;
		
		// Log
		Log.d("Methods.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", 
				"db_src: " + db_src + " * " + "db_dst: " + db_dst);
//				"db_dst: " + db_dst);
		
		/*----------------------------
		 * 2. Prep => Files
			----------------------------*/
		File src = new File(db_src);
		File dst = new File(db_dst);
		
		/*----------------------------
		 * 2-2. Folder exists?
			----------------------------*/
		File db_backup = new File(dirPath_db_backup);
		
		if (!db_backup.exists()) {
			
			try {
				db_backup.mkdir();
				
				// Log
				Log.d("Methods.java" + "["
						+ Thread.currentThread().getStackTrace()[2].getLineNumber()
						+ "]", "Folder created: " + db_backup.getAbsolutePath());
			} catch (Exception e) {
				
				// Log
				Log.d("Methods.java"
						+ "["
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "]", "Create folder => Failed");
				
				return;
				
			}
			
		} else {//if (!db_backup.exists())
			
			// Log
			Log.d("Methods.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "Folder exists: ");
			
		}//if (!db_backup.exists())
		
		/*----------------------------
		 * 3. Copy
			----------------------------*/
		try {
			FileChannel iChannel = new FileInputStream(src).getChannel();
			FileChannel oChannel = new FileOutputStream(dst).getChannel();
			iChannel.transferTo(0, iChannel.size(), oChannel);
			iChannel.close();
			oChannel.close();
			
			// Log
			Log.d("ThumbnailActivity.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "File copied");
			
			// debug
			Toast.makeText(this, "DB backup => Done", 3000).show();

		} catch (FileNotFoundException e) {
			// Log
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "Exception: " + e.toString());
			
		} catch (IOException e) {
			// Log
			Log.d("MainActv.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "Exception: " + e.toString());
		}//try

		

		
//		Methods.db_backup(this);
//		
//		DBManager dbm = new DBManager(this);
//		
//		SQLiteDatabase db = dbm.getWritableDatabase();
//
//		// Log
//		Log.d("ShoppingListActivity.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "db.getPath(): " + db.getPath());
//		
//		db.close();
		
		
	}//private void backup_db()

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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onDestroy();
	}
    
    
    
}//public class ShoppingListActivity extends ListActivity
