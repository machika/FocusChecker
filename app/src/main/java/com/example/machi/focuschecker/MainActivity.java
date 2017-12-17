package com.example.machi.focuschecker;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ll;
    private TextView tv;
    private RadioButton rb;
    private CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout)findViewById(R.id.ll_container);
        tv = (TextView)findViewById(R.id.tv);
        cb = (CheckBox) findViewById(R.id.cb);
        rb = (RadioButton) findViewById(R.id.rb);


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("MASE", "DEVICE SDK Version = " + Build.VERSION.SDK_INT);
        Log.d("MASE", "LinearLayout: isClickable=" + ll.isClickable() + ", isFocusable = " + ll.isFocusable());
        Log.d("MASE", "TextView: isClickable=" + tv.isClickable() + ", isFocusable = " + tv.isFocusable());
        Log.d("MASE", "RadioButton: isClickable=" + rb.isClickable() + ", isFocusable = " + rb.isFocusable());
        Log.d("MASE", "CheckBox: isClickable=" + cb.isClickable() + ", isFocusable = " + cb.isFocusable());
    }
}
