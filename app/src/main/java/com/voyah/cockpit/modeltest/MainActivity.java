package com.voyah.cockpit.modeltest;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.voyah.cockpit.app_setting.SettingActivity;
import com.voyah.cockpit.app_video.VideoActivity;
/*
 * 主页面
 * 其他界面的入口
 */
public class MainActivity extends BaseActivity {
    Button btn_setting;
    Button btn_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置点击事件
        btn_setting = findViewById(R.id.btn_setting);
        btn_video = findViewById(R.id.btn_video);
        btn_setting.setOnClickListener(v -> {
            //跳转设置页面
            startActivity(ModuleContants.ACTIVITY_SETTING,null);
        });
        btn_video.setOnClickListener(v -> {
            //跳转视频页面
            startActivity(ModuleContants.ACTIVITY_VIDEO,null);
        });
    }
}