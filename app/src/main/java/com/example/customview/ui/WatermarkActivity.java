package com.example.customview.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customview.R;
import com.example.customview.Watermark.watermarkUtils;
/**
 * ============================================================
 * <p/>
 * 版 权 ：2022
 * <p/>
 * 作 者 ：zhonghsuiping
 * <p/>
 * 版 本 ： 1.0
 * <p/>
 * 工号：
 * <p/>
 * 创建日期 ： $
 * <p/>
 * 描 述 ：$ 水印
 * <p/>
 * 包名 ：$
 * <p/>
 * 修订历史 ：
 * <p/>
 * ============================================================
 **/
public class WatermarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watermark);
        watermarkUtils.setWatermark(this);
    }
}