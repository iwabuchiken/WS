package shoppinglist.lib;

import shoppinglist.main.R;
import android.app.Activity;
import android.app.Dialog;
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

	public ButtonOnClickListener(Activity actv) {
		//
		this.actv = actv;
	}

	@Override
	public void onClick(View v) {
		//
		Methods.ButtonTags tag_name = (Methods.ButtonTags) v.getTag();

		//
		switch (tag_name) {
		case db_manager_activity_create_table:
			//
			Methods.dlg_createTable(actv);
			
			break;
			
		case db_manager_activity_drop_table:
			//
			Methods.dlg_dropTable(actv);
			
			break;

		default:
			break;
		}//switch (tag_name)
	}

}
