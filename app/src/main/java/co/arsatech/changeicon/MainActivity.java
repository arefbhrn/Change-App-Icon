package co.arsatech.changeicon;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // you can add as many as you want
        // note that it takes some seconds
        try {
            // to enable alias
            getPackageManager().setComponentEnabledSetting(
                    new ComponentName(this, BuildConfig.APPLICATION_ID + ".MainActivity-Logo1"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
            );
            // to remove default
            getPackageManager().setComponentEnabledSetting(
                    new ComponentName(this, BuildConfig.APPLICATION_ID + ".MainActivity"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
            );
        } catch (Exception ignored) {
        }
    }
}
