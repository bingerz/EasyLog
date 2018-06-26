package cn.bingerz.easylog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyLog.setLoggable(true);  //Default is true;

        EasyLog.e("AppendTag disable. ExplicitTag is null.");

        EasyLog.setExplicitTag("Main");

        EasyLog.e("AppendTag enable. ExplicitTag is Main.");

    }
}
