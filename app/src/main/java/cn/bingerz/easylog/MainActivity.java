package cn.bingerz.easylog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyLog.setLoggable(true);  //Default is true;

        EasyLog.d("hello world.");

        EasyLog.setAppendTag(true); //Add Log Details: <methodName():LineNumber>

        EasyLog.d("hello world again.");

    }
}
