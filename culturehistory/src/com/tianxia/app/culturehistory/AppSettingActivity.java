package com.tianxia.app.culturehistory;

import com.juzi.main.AppConnect;
import com.tianxia.lib.baseworld2.activity.SettingActivity;

public class AppSettingActivity extends SettingActivity {

    @Override
    public void showAdOffers() {
        AppConnect.getInstance(this).showOffers(this);
    }
}
