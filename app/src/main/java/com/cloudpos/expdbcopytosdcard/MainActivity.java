package com.cloudpos.expdbcopytosdcard;


import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends Activity {
    private String sourceFilePath;
    private Button mCopyBtn;
    private String DATABASE_DIRECTORY = Environment.getExternalStorageDirectory()
            .getAbsolutePath() + "/tmp/";
    private String sdcardFiletPath = DATABASE_DIRECTORY + SqliteDataUtils.DB_FILE_NAME + ".db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        SqliteDataUtils.getInstance(this);


    }

    private void initView() {
        sourceFilePath = "data/data/" + getPackageName() + "/databases/" + SqliteDataUtils.DB_FILE_NAME;
        mCopyBtn = (Button) findViewById(R.id.copy_click);
        mCopyBtn.setOnClickListener(view -> {
            copyFiletoSdCard();
        });
    }

    private void copyFiletoSdCard() {
        try {
            File folder = new File(DATABASE_DIRECTORY);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File sourceFile = new File(sourceFilePath);
            File sdcardFile = new File(sdcardFiletPath);
            Boolean isCopySuccess = FileUtils.copyFile(sourceFile, sdcardFile);
            if (isCopySuccess) {
                Toast.makeText(this, getResources().getString(R.string.copy_success), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getResources().getString(R.string.copy_failure), Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}