package com.samples.ui.dynamicfrag;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class DynamicFragmentsActivity extends Activity implements View.OnClickListener{

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragments);
        fragmentManager = getFragmentManager();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Fragment1 fragment1 = new Fragment1();
                fragmentTransaction.add(R.id.LinearLayout2, fragment1);
                break;
            case R.id.button2:
                Fragment2 fragment2 = new Fragment2();
                fragmentTransaction.add(R.id.LinearLayout2, fragment2);
                break;
        }
    }
}
