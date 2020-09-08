package com.luongthuan.test_sdk;

import android.content.Context;
import android.widget.Toast;

public class ToasterMess {
    public static void s(Context context,String mess){
        Toast.makeText(context,mess,Toast.LENGTH_SHORT).show();
    }
}
