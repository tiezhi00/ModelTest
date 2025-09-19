package com.voyah.cockpit.modeltest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    protected void startActivity(String className, Bundle bundle) {
        try {
            Class<?> aClass = Class.forName(className);//反射获取类
            Intent intent = new Intent(this, aClass);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "找不到"+className, Toast.LENGTH_SHORT).show();
        }

    }
    protected void startActivityForResult(String className, int requestCode,Bundle bundle) {
        try {
            Class<?> aClass = Class.forName(className);//反射获取类
            Intent intent = new Intent(this, aClass);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            startActivityForResult(intent,requestCode);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "找不到"+className, Toast.LENGTH_SHORT).show();
        }

    }
}
