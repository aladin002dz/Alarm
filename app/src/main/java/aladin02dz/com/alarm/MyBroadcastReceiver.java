package aladin02dz.com.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by aladi on 4/10/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.alrm);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_SHORT).show();
    }
}
