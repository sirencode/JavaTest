package com.test.diablo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Diablo on 2016/12/27.
 */

public class TestDialog extends Dialog {

    public TestDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
    }
}
