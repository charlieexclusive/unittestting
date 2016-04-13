package com.android.testprojectlab3.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.android.testprojectlab3.MainActivity;
import com.android.testprojectlab3.R;

/**
 * Created by CR7 on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }//end JUnit_test

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);

    }//end test_first

}
