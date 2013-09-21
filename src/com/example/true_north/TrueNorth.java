package com.example.true_north;
import com.parse.Parse;
import com.parse.ParseAnalytics;

public class TrueNorth extends android.app.Application
{
	public void onCreate() { 
		Parse.initialize(this, "zfwXcHqiuDIkGFDXCVZhlr1vkNG2PxSbifpMKwhh", "TNV41MwKCQRAsF9qZ8LJuFEZD3sz2P6b81ecfENH"); 
	}
}
