package org.shicy.inclover.secret;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import org.shicy.commons.activity.BaseActionBarActivity;
import org.shicy.inclover.R;

/**
 * 我的密保管理页面
 * Created by Shicy on 2015/9/17.
 */
public class SecretHomeActivity extends BaseActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_home);
    }

    @Override
    protected void initActionBar(ActionBar actionBar) {
        super.initActionBar(actionBar);
        this.initActionBarWithTitle(actionBar);
    }
}
