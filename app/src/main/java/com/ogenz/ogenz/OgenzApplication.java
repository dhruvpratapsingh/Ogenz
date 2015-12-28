package com.ogenz.ogenz;

import com.firebase.client.Firebase;

/**
 * Includes one-time initialization of Firebase related code
 */

public class OgenzApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
