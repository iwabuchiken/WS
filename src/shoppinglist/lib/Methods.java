package shoppinglist.lib;

import shoppinglist.main.R;
import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;

public class Methods {

	/*----------------------------
	 * Variables
		----------------------------*/
	//
	public static enum DialogTags {
		// dlg_register_store.xml
		dlg_register_store_ok, dlg_register_store_cancel,

		// dlg_input_empty.xml
		dlg_input_empty_btn_reenter, dlg_input_empty_btn_cancel
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


	public static void insertStoreName(String tableName, String storeName) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
