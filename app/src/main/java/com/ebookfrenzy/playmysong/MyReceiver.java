package com.ebookfrenzy.playmysong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by student on 3/26/15.
 */
public class MyReceiver extends BroadcastReceiver {

    Context c = null;

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent newIntent = new Intent(context, MyService.class);
        context.startService(newIntent);

    }
}
