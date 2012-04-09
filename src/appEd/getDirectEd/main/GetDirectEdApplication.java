package appEd.getDirectEd.main;

import android.app.Application;

public class GetDirectEdApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		//TODO: load in the settings for the program
		//TODO: open some databases
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		//TODO: close any open databases
	}
	
}
