package com.carefree.coldwallet.ui.activitys;

/*--------------------------------------------------------------------
  文 件 名：ForgetActivity
  作 　 者：HuangXiJun (黄夕君)
  创建日期：V1.0,  2018/04/10(版本号+逗号＋日期，注：日期格式：YYYY－MMM－DD，即月用英文表示，尽量减少异意)
  模块功能：忘记密码
---------------------------------------------------------------------*/

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.carefree.coldwallet.R;
import com.carefree.coldwallet.commons.utils.StatusBarCompat;

public class ForgetActivity extends BaseActivity implements View.OnClickListener{
    private TextView title;
    private ImageView iv_left;
    private TextView returnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarCompat.setStatusBarColor(this, Color.WHITE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        initView();
    }

    private void initView(){
        title = (TextView) findViewById(R.id.tv_title);
        title.setText(getString(R.string.forget_passwrod_text));
        iv_left = (ImageView) findViewById(R.id.iv_left);
        iv_left.setVisibility(View.GONE);
        returnBtn = (TextView) findViewById(R.id.tv_return);

        iv_left.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_left:
                finish();
                break;
            case R.id.tv_return:
                finish();
                break;
        }
    }
}
