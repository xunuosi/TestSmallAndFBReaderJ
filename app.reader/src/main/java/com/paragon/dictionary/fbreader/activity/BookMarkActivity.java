package com.paragon.dictionary.fbreader.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.geometerplus.android.fbreader.FBReaderMainActivity;
import org.geometerplus.zlibrary.ui.android.R;

/**
 * Created by xns on 2017/4/11.
 */

public class BookMarkActivity extends FBReaderMainActivity {

    @Override
    protected void onCreate(Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.activity_bookmark);
        Intent intent = getIntent();
        if (intent != null) {
            ((TextView)findViewById(R.id.tv_bookmark)).setText(intent.getStringExtra("bookmark"));
        }
    }

    @Override
    public void hideDictionarySelection() {

    }
}
