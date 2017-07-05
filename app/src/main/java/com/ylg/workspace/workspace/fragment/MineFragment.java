package com.ylg.workspace.workspace.fragment;


import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ylg.workspace.workspace.R;
//import com.ylg.workspace.workspace.activity.personaldetails.MyActivity;
import com.ylg.workspace.workspace.activity.personaldetails.MyBusinessActivity;
import com.ylg.workspace.workspace.activity.personaldetails.MyInformationActivity;
import com.ylg.workspace.workspace.activity.personaldetails.SetUpActivity;


public class MineFragment extends android.app.Fragment implements View.OnClickListener{
    private ImageView iv_set;
    private RelativeLayout mineOrderMybusiness;
    private RelativeLayout mineOrderMyactivitys;
    private RelativeLayout mineOrderMyHistory;
    private ImageView mineUserHeadportrait;
    public MineFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mineLayout = inflater.inflate(R.layout.fragment_mine, container, false);
        init(mineLayout);
        return mineLayout;
    }

    private void init(View mView) {
        iv_set = (ImageView) mView.findViewById(R.id.mine_iv_intent);
        iv_set.setOnClickListener(this);
        mineUserHeadportrait = (ImageView) mView.findViewById(R.id.mine_user_Headportrait);
        mineUserHeadportrait.setOnClickListener(this);
        mineOrderMyHistory = (RelativeLayout) mView.findViewById(R.id.mine_Order_MyHistory);
        mineOrderMyHistory.setOnClickListener(this);
        mineOrderMybusiness = (RelativeLayout) mView.findViewById(R.id.mine_Order_Mybusiness);
        mineOrderMybusiness.setOnClickListener(this);
        mineOrderMyactivitys = (RelativeLayout) mView.findViewById(R.id.mine_Order_Myactivitys);
        mineOrderMyactivitys.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mine_iv_intent:
                Log.i("dyy","设置个人中心");
                Intent i = new Intent(getActivity(),SetUpActivity.class);
                startActivity(i);
                break;
            case R.id.mine_Order_MyHistory:
                Log.i("dyy","我的历史");

                break;
            case R.id.mine_Order_Mybusiness:
                Log.i("dyy","我的企业");
                Intent MyBusinessIntent = new Intent(getActivity(),MyBusinessActivity.class);
                startActivity(MyBusinessIntent);
                break;
            case R.id.mine_Order_Myactivitys:
                Log.i("dyy","我的活动");
//                Intent myActivitysIntent = new Intent(getActivity(),MyActivity.class);
//                startActivity(myActivitysIntent);
                break;
            case R.id.mine_user_Headportrait:
                Log.i("dyy","我的信息");
                Intent mineuserheadportraitIntent = new Intent(getActivity(),MyInformationActivity.class);
                startActivity(mineuserheadportraitIntent);
                break;
        }

    }
}
