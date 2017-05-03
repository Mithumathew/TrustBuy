package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by PC User on 2017-04-13.
 */

public class PersonalAdHistoryActivity extends UserAccountsettingsActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personaladhistoryactivity);

    }

    public void DeleteAd(View view) {
        Intent intent = new Intent(this, DeleteAd.class);
        startActivity(intent);
    }
    public void UpdateNow(View view) {
        Intent intent = new Intent(this, UpdateAd.class);
        startActivity(intent);
    }
}