package com.personal.revenant.xiandd.wxapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import static com.personal.revenant.xiandd.utils.Constant.WXAPP_ID;

/**
 * Created by Administrator on 2018/6/7.
 */

public class AppRegister extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final IWXAPI api = WXAPIFactory.createWXAPI(context, null);

        // 将该app注册到微信
        api.registerApp(WXAPP_ID);
    }
}