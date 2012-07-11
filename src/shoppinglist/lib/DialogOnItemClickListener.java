package shoppinglist.lib;

import shoppinglist.lib.Methods.DialogTags;
import android.app.Activity;
import android.app.Dialog;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class DialogOnItemClickListener implements OnItemClickListener {

	//
	Activity actv;
	Dialog dlg;
	
	//
	Vibrator vib;
	
	//
	Methods.DialogTags dlgTag = null;
	
	public DialogOnItemClickListener(Activity actv, Dialog dlg) {
		// 
		this.actv = actv;
		this.dlg = dlg;
	}//public DialogOnItemClickListener(Activity actv, Dialog dlg)

	public DialogOnItemClickListener(Activity actv, Dialog dlg, Methods.DialogTags dlgTag) {
		// 
		this.actv = actv;
		this.dlg = dlg;
		this.dlgTag = dlgTag;
		
		//
		vib = (Vibrator) actv.getSystemService(actv.VIBRATOR_SERVICE);
		
	}//public DialogOnItemClickListener(Activity actv, Dialog dlg)

	@Override
	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		/*----------------------------
		 * Steps
		 * 0. Vibrate
		 * 1. Get table name
		 * 2. Call method
			----------------------------*/
		/*----------------------------
		 * 0. Vibrate
			----------------------------*/
		vib.vibrate(40);
		
		String tableName = (String) parent.getItemAtPosition(position);
		
		// Log
		Log.d("DialogOnItemClickListener.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "tableName => " + tableName);
		
		// Log
		Log.d("DialogOnItemClickListener.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "position => " + position + " / " + "id => " + id);
		
		/*----------------------------
		 * 2. Call a method
			----------------------------*/
		//
		if (dlgTag != null && dlgTag == DialogTags.dlg_drop_table) {
			Methods.dlg_confirmTableDrop(actv, dlg, tableName);
		}//if (dlgName != null && dlgName == "confirm_table_drop")
			
		
		
	}//public void onItemClick(AdapterView<?> parent, View v, int position, long id)

}
