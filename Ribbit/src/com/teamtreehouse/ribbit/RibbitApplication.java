package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
    public void onCreate() {
        Parse.initialize(this, "wwkdOYBosVXq8PuJkGY0SsyXuOf9JNzNsv3VI3rx", "xYQdVY7A8qFwQT1ElFOF40vr6tAp3zLb4NYzi3Yi");
    }
}
