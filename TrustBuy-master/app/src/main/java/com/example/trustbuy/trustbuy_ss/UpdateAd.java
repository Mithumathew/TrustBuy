package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mithu on 4/14/2017.
 */

public class UpdateAd extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateadactivity);

    }
    public void GoToUpdateAd(View view) {
        Intent intent = new Intent(this, PersonalAdHistoryActivity.class);
        startActivity(intent);
    }
}
