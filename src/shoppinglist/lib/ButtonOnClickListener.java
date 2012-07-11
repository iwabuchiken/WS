package shoppinglist.lib;

import shoppinglist.main.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonOnClickListener implements OnClickListener {
	/*----------------------------
	 * Fields
		----------------------------*/
	//
	Activity actv;

	//
	Vibrator vib;
	
	public ButtonOnClickListener(Activity actv) {
		//
		this.actv = actv;
		
		//
		vib = (Vibrator) actv.getSystemService(actv.VIBRATOR_SERVICE);
	}

	@Override
	public void onClick(View v) {
		//
		Methods.ButtonTags tag_name = (Methods.ButtonTags) v.getTag();

		//
		switch (tag_name) {
		case db_manager_activity_create_table:
			
			// REF => http://www.adakoda.com/android/000124.html
			//
			vib.vibrate(40);
			
			//
			Methods.dlg_createTable(actv);
			
			break;
			
		case db_manager_activity_drop_table:
			//
//			vib.vibrate(10);
//			vib.vibrate(100);
//			vib.vibrate(50);
			vib.vibrate(40);
			
			//
			Methods.dlg_dropTable(actv);
			
			break;

		default:
			break;
		}//switch (tag_name)
	}

}
