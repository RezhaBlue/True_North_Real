package com.example.true_north;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
//import com.parse.ParseObject;
import com.parse.PushService;

public class MainActivity extends Activity {

	//This is called when the application menu icon is first called
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, "zfwXcHqiuDIkGFDXCVZhlr1vkNG2PxSbifpMKwhh", "TNV41MwKCQRAsF9qZ8LJuFEZD3sz2P6b81ecfENH");
		
		//specifies a Activity to be used for all push notifications by default
		PushService.setDefaultPushCallback(this, MainActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		
		//tracks statistics around application opens
		ParseAnalytics.trackAppOpened(getIntent());
		/**ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
		*/
	}

	//This is called when the application is called. The Activity super object calls this by default.
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}
