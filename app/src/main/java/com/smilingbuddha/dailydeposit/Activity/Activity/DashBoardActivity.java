package com.smilingbuddha.dailydeposit.Activity.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.smilingbuddha.dailydeposit.Activity.Activity.DataActivity;
import com.smilingbuddha.dailydeposit.Activity.Activity.DetailActivity;
import com.smilingbuddha.dailydeposit.Activity.Activity.ReceiptActivity;
import com.smilingbuddha.dailydeposit.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Sani on 3/7/16.
 */
public class DashBoardActivity extends Activity{

//    @Bind(R.id.view_details_btn) Button viewDetailsBtn;
//    @Bind(R.id.receipt_btn) Button receiptBtn;
//    @Bind(R.id.get_data_btn) Button getDataBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.view_details_btn)void setViewDetailsBtn(){

        Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.receipt_btn) void setReceiptBtn(){

        Intent intent = new Intent(getApplicationContext(),ReceiptActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.get_data_btn) void setGetDataBtn(){

        Intent intent = new Intent(getApplicationContext(),DataActivity.class);
        startActivity(intent);
    }
}


//Chandramouli.jamadagni@gmail.com