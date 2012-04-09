package appEd.getDirectEd.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
/**
 * @author James
 * 
 * the main activity, starts up and  
 */
public class GetDirectEdActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_view);
		
		/*Button button1 = (Button)findViewById(R.id.facilityBtnMain);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(GetDirectEdActivity.this, ActivitiesActivity.class);
            	startActivity(intent);       
			}
		});*/

	}
}