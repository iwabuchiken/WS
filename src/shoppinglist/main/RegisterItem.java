package shoppinglist.main;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterItem extends Activity {

	//
	Activity actv;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		/*----------------------------
		 * Steps
		 * 1. Super, etc.
		 * 2. Set content
		 * 3. DBManager => Create table
		 * 4. Set listener => Register
			----------------------------*/
		
		super.onCreate(savedInstanceState);

		this.actv = this;
		
		/*----------------------------
		 * 2. Set content
			----------------------------*/
		setContentView(R.layout.registeritem);
		
		/*----------------------------
		 * 3. DBManager => Create table
			----------------------------*/
		DBManager dbm = new DBManager(this);
		
		SQLiteDatabase db = dbm.getWritableDatabase();
		
		boolean result = dbm.createTable(db, DBManager.tableName);
		
		db.close();
		
		/*----------------------------
		 * 4. Set listener => Register
			----------------------------*/
		//
		setLister();
		
		
	}//public void onCreate(Bundle savedInstanceState)

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO 自動生成されたメソッド・スタブ
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO 自動生成されたメソッド・スタブ
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

	void setLister() {
		//
		Button bt = (Button) findViewById(R.id.v1_btn_register);
		
		//
		bt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// Get views
				EditText et_store = (EditText) findViewById(R.id.v1_et_store);
				EditText et_name = (EditText) findViewById(R.id.v1_et_name);
				EditText et_price = (EditText) findViewById(R.id.v1_et_price);
				EditText et_genre = (EditText) findViewById(R.id.v1_et_genre);
				
				// All written?
				if(et_store.getText().toString().equals("") ||
						et_name.getText().toString().equals("") ||
						et_price.getText().toString().equals("") ||
						et_genre.getText().toString().equals("")
						) {
					// debug
					Toast.makeText(RegisterItem.this, "Empty item exists", 2000)
							.show();
				}//if
				//
				DBManager dbm = new DBManager(RegisterItem.this);
				
				SQLiteDatabase db = dbm.getWritableDatabase();
				
				boolean result = dbm.storeData(
								db, 
								DBManager.tableName, 
								DBManager.columns, 
								new String[]{
										et_store.getText().toString(),
										et_name.getText().toString(),
										et_price.getText().toString(),
										et_genre.getText().toString()
								});
				
				if (result == true) {
					// Log
					Log.d("RegisterItem.java"
							+ "["
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber() + "]", "Data stored");
					// debug
					Toast.makeText(RegisterItem.this, "Data stored", 2000)
							.show();
					
				} else {//if (result == true)
					// Log
					Log.d("RegisterItem.java"
							+ "["
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber() + "]", "Data not stored");
				}//if (result == true)
				
				db.close();
			}
		});

		bt.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO 自動生成されたメソッド・スタブ
				switch (event.getActionMasked()) {
				case MotionEvent.ACTION_DOWN:
					v.setBackgroundColor(Color.DKGRAY);
					break;
				case MotionEvent.ACTION_UP:
					v.setBackgroundColor(Color.WHITE);
					break;
				}//switch (event.getAction())
				
				return false;
			}});
	}//void setLister()
}
