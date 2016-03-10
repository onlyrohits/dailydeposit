package com.smilingbuddha.dailydeposit.Activity.Activity;

import android.app.Activity;
import android.os.Bundle;

import com.smilingbuddha.dailydeposit.R;

/**
 * Created by Tejaswi on 3/7/16.
 */
public class FileUploadActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_upload);



        //upload the file from the file manager & then push it to local DB & delete the old file
    }
}
