package com.test.diablo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String NAME = "shenyonghe";
    private static final String PW = "taishuaile";
    private EditText editTextName;
    private EditText editTextPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editTextName = (EditText) findViewById(R.id.et_name);
        editTextPW = (EditText) findViewById(R.id.et_password);
    }

    public void onLogin(View v) {
        String name = editTextName.getText().toString();
        String pw = editTextPW.getText().toString();
        if (TextUtils.isEmpty(name.trim()) || TextUtils.isEmpty(pw.trim())) {
            Toast.makeText(this, "请输入用户名或密码", Toast.LENGTH_SHORT).show();
        } else if (name.equals(NAME) && pw.equals(PW)) {
            startActivity(new Intent(this, SecondAct.class));
        } else {
            Toast.makeText(this, "用户名密码不匹配", Toast.LENGTH_SHORT).show();
        }
    }
}
