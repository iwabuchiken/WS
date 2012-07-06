package shoppinglist.lib;

import shoppinglist.main.DBManager;
import shoppinglist.main.R;
import android.app.Activity;
import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Methods {

	/*----------------------------
	 * Variables
		----------------------------*/
	//
	public static enum DialogTags {
		// dlg_register_store.xml
		dlg_register_store_ok, dlg_register_store_cancel,

		// dlg_input_empty.xml
		dlg_input_empty_btn_reenter, dlg_input_empty_btn_cancel,
		
		// dlg_reconfirm_store_name.xml
		dlg_reconfirm_store_name_btn_yes, dlg_reconfirm_store_name_btn_cancel,
		
		// dlg_register_genre.xml
		dlg_register_genre_register, dlg_register_genre_cancel,
	}
	
	
	public static void register_store(Activity actv) {
		/*----------------------------
		 * Steps
		 * 1. Set up
		 * 2. Add listeners => OnTouch
		 * 3. Add listeners => OnClick
			----------------------------*/
		
		// 
		Dialog dlg = new Dialog(actv);
		
		//
		dlg.setContentView(R.layout.dlg_register_store);
		
		// Title
		dlg.setTitle(R.string.dlg_register_store_title);
		
		//
		
		
		/*----------------------------
		 * 2. Add listeners => OnTouch
			----------------------------*/
		//
		Button btn_ok = (Button) dlg.findViewById(R.id.dlg_register_store_btn_ok);
		Button btn_cancel = (Button) dlg.findViewById(R.id.dlg_register_store_btn_cancel);
		
		//
		btn_ok.setTag(DialogTags.dlg_register_store_ok);
		btn_cancel.setTag(DialogTags.dlg_register_store_cancel);
		
		//
		btn_ok.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg));
		btn_cancel.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg));
		
		/*----------------------------
		 * 3. Add listeners => OnClick
			----------------------------*/
		//
		btn_ok.setOnClickListener(new DialogButtonOnClickListener(actv, dlg));
		btn_cancel.setOnClickListener(new DialogButtonOnClickListener(actv, dlg));
		
		
		//
		dlg.show();
		
		
		
		
	}//public static void register_store(Activity actv)


	public static void dlg_input_empty(Activity actv, Dialog dlg) {
		/*----------------------------
		 * Steps
		 * 1. Set up
		 * 2. Add listeners => OnTouch
		 * 3. Add listeners => OnClick
			----------------------------*/
		
		// 
		Dialog dlg_new = new Dialog(actv);
		
		//
		dlg_new.setContentView(R.layout.dlg_input_empty);
		
		// Title
		dlg_new.setTitle(R.string.dlg_input_empty_title);
		
		/*----------------------------
		 * 2. Add listeners => OnTouch
			----------------------------*/
		//
		Button btn_ok = (Button) dlg_new.findViewById(R.id.dlg_input_empty_btn_reenter);
		Button btn_cancel = (Button) dlg_new.findViewById(R.id.dlg_input_empty_btn_cancel);
		
		//
		btn_ok.setTag(DialogTags.dlg_input_empty_btn_reenter);
		btn_cancel.setTag(DialogTags.dlg_input_empty_btn_cancel);
		
		//
		btn_ok.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg_new));
		btn_cancel.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg_new));
		
		/*----------------------------
		 * 3. Add listeners => OnClick
			----------------------------*/
		//
		btn_ok.setOnClickListener(new DialogButtonOnClickListener(actv, dlg, dlg_new));
		btn_cancel.setOnClickListener(new DialogButtonOnClickListener(actv, dlg, dlg_new));
		
		//
		dlg_new.show();
		
		
	}//public static void dlg_input_empty(Activity actv, Dialog dlg)


	public static void insertStoreName(
					Activity actv, Dialog dlg, String tableName, String storeName) {
		/*----------------------------
		 * Steps
		 * 1. Table exists?
		 * 1-2. If not => Create table
		 * 2. Reconfirm store name
			----------------------------*/
		
		// 
		DBManager dbm = new DBManager(actv);
		
		SQLiteDatabase db = dbm.getWritableDatabase();
		
		//
		if (!dbm.tableExists(db, tableName)) {
			//
//			dbm.createTable(db, tableName);
			// Log
			Log.d("Methods.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "Table does not exist => " + tableName);

			/*----------------------------
			 * 1-2. If not => Create table
				----------------------------*/
			//
			String[] columns = DBManager.columns_for_table_stores;
			
			String[] types = DBManager.column_types_for_table_stores;
			
			dbm.createTable_generic(db, tableName, columns, types);
			
		} else {//if (!dbm.tableExists(db, tableName))
			// Log
			Log.d("Methods.java" + "["
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ "]", "Table exists => " + tableName);
			
		}//if (!dbm.tableExists(db, tableName))
		
		// Log
		Log.d("Methods.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "Store name => " + storeName);
		
		//
		db.close();
		
		/*----------------------------
		 * 2. Reconfirm store name
			----------------------------*/
		dlg_reconfirm_store_name(actv, dlg, tableName, storeName);
		
		
	}//public static void insertStoreName(Activity actv, String tableName, String storeName)

	/****************************************
	 * dlg_reconfirm_store_name()
	 * 
	 * <Caller> 
	 * 1. insertStoreName()
	 * 
	 * <Desc> 1. <Params> 1.
	 * 
	 * <Return> 1.
	 * 
	 * <Steps> 1.
	 ****************************************/
	private static void dlg_reconfirm_store_name(
										Activity actv, Dialog dlg,
										String tableName, String storeName) {
		/*----------------------------
		 * Steps
		 * 1. Set up
		 * 2. Add listeners => OnTouch
		 * 3. Add listeners => OnClick
		 * 4. Set store name
			----------------------------*/
		
		// 
		Dialog dlg_new = new Dialog(actv);
		
		//
		dlg_new.setContentView(R.layout.dlg_reconfirm_store_name);
		
		// Title
		dlg_new.setTitle(R.string.dlg_reconfirm_store_name_title);
		
		/*----------------------------
		 * 2. Add listeners => OnTouch
			----------------------------*/
		//
		Button btn_ok = (Button) dlg_new.findViewById(R.id.dlg_reconfirm_store_name_btn_yes);
		Button btn_cancel = (Button) dlg_new.findViewById(R.id.dlg_reconfirm_store_name_btn_cancel);
		
		//
		btn_ok.setTag(DialogTags.dlg_reconfirm_store_name_btn_yes);
		btn_cancel.setTag(DialogTags.dlg_reconfirm_store_name_btn_cancel);
		
		//
		btn_ok.setOnTouchListener(new DialogButtonOnTouchListener(actv));
		btn_cancel.setOnTouchListener(new DialogButtonOnTouchListener(actv));
		
		/*----------------------------
		 * 3. Add listeners => OnClick
			----------------------------*/
		//
		btn_ok.setOnClickListener(new DialogButtonOnClickListener(actv, dlg, dlg_new));
		btn_cancel.setOnClickListener(new DialogButtonOnClickListener(actv, dlg, dlg_new));
		
		/*----------------------------
		 * 4. Set store name
			----------------------------*/
		//
//		TextView tv_store_name = (TextView) dlg_new.findViewById(R.id.dlg_reconfirm_store_name_tv_message_store_name);
		TextView tv_store_name = (TextView) dlg_new.findViewById(R.id.dlg_reconfirm_store_name_tv_store_name);
		
		tv_store_name.setText(storeName);
		tv_store_name.setTextColor(Color.YELLOW);
		
		//
		dlg_new.show();
		
	}//private static void dlg_reconfirm_store_name


	public static void insertStoreName_final(
							Activity actv, Dialog dlg, Dialog dlg2, String tableName) {
		/*----------------------------
		 * Steps
		 * 1. Set up
		 * 2. Insert data
		 * 3. Close db
		 * 4. Close dialogues
			----------------------------*/
		
		//
		TextView tv_store_name = 
					(TextView) dlg2.findViewById(
//							R.id.dlg_reconfirm_store_name_tv_message_store_name);
							R.id.dlg_reconfirm_store_name_tv_store_name);
		
		String storeName = tv_store_name.getText().toString();
		
		// Log
		Log.d("Methods.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "Store name => " + storeName);
		
		
		// 
		DBManager dbm = new DBManager(actv);
		
		SQLiteDatabase db = dbm.getWritableDatabase();

		/*----------------------------
		 * 2. Insert data
			----------------------------*/
		//
		boolean result = dbm.storeData(
										db, 
										tableName, 
										DBManager.columns_for_table_stores, 
										new String[]{storeName, ""});
		
		// Log
		Log.d("Methods.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "dbm.storeData => " + result);
			
		/*----------------------------
		 * 3. Close db
			----------------------------*/
		db.close();

		
		/*----------------------------
		 * 4. Close dialogues
			----------------------------*/
		//
		if (result == true) {
			// debug
			Toast.makeText(actv, "“X•Ü–¼‚ª“o˜^‚³‚ê‚Ü‚µ‚½@=>@" + storeName, 3000).show();
			
			//
			dlg2.dismiss();
			dlg.dismiss();
			
		} else {//if (result == true)
			// debug
			Toast.makeText(actv, "“X•Ü–¼“o˜^@=>@‚Å‚«‚Ü‚¹‚ñ‚Å‚µ‚½", 3000).show();
			
			//
			dlg2.dismiss();
			
		}//if (result == true)
		
		
		
//		//debug
//		String q = "DROP TABLE stores;";
//		
//		db.execSQL(q);
//		
//		// Log
//		Log.d("Methods.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "db.execSQL(q) => Done");
		
		
//		Cursor c = db.rawQuery(q, null);

//		// Log
//		Log.d("Methods.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "c => " + c.toString());
		
		
//		//
//		db.close();
		
//		// Log
//		Log.d("Methods.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "Store name => " + tv_store_name.getText().toString());
		
		
		
	}//public static void insertStoreName_final()

	public static void registerGenre(Activity actv) {
		/*----------------------------
		 * Steps
		 * 1. Set up
		 * 2. Add listeners => OnTouch
		 * 3. Add listeners => OnClick
			----------------------------*/
		
		// 
		Dialog dlg = new Dialog(actv);
		
		//
		dlg.setContentView(R.layout.dlg_register_genre);
		
		// Title
		dlg.setTitle(R.string.dlg_register_genre_title);
		
		/*----------------------------
		 * 2. Add listeners => OnTouch
			----------------------------*/
		//
		Button btn_ok = (Button) dlg.findViewById(R.id.dlg_register_genre_btn_register);
		Button btn_cancel = (Button) dlg.findViewById(R.id.dlg_register_genre_btn_cancel);
		
		//
		btn_ok.setTag(DialogTags.dlg_register_genre_register);
		btn_cancel.setTag(DialogTags.dlg_register_genre_cancel);
		
		//
		btn_ok.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg));
		btn_cancel.setOnTouchListener(new DialogButtonOnTouchListener(actv, dlg));
		
		/*----------------------------
		 * 3. Add listeners => OnClick
			----------------------------*/
		//
		btn_ok.setOnClickListener(new DialogButtonOnClickListener(actv, dlg));
		btn_cancel.setOnClickListener(new DialogButtonOnClickListener(actv, dlg));
		
		
		//
		dlg.show();
		
		
		
		
	}//public static void registerGenre(Activity actv)

}
