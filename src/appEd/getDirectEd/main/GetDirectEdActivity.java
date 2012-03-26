package appEd.getDirectEd.main;



import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.*;

public class GetDirectEdActivity extends ListActivity {
	
	Resources res = getResources();
	String[] choices = res.getStringArray(R.array.choices);
	
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	// no more this
	//setContentView(R.layout.list_fruit);

	setListAdapter(new ArrayAdapter<String>(this, R.layout.main_view, choices));

	ListView listView = getListView();
	listView.setTextFilterEnabled(true);

	listView.setOnItemClickListener(new OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View view,
				int position, long id) {
		    // When clicked, show a toast with the TextView text
		    Toast.makeText(getApplicationContext(),
			((TextView) view).getText(), Toast.LENGTH_SHORT).show();
		}
	});

    
}
}