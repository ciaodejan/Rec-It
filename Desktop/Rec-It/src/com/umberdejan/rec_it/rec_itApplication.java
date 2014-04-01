package com.umberdejan.rec_it;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class rec_itApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "nk6OtD356HupbYqbs1QNa4ZoyQqFiuCjc1GWjxaA", "7KRJvkUKhu3vbrgKatCPIfu6Pf2E4Q4hb2Xq9Uqi");
		}
}
