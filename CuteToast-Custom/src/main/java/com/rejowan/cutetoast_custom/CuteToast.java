package com.rejowan.cutetoast_custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CuteToast extends Toast {

    /*
        Copyright 2021 K M Rejowan Ahmmed (@ahmmedrejowan)

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

      */


    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;
    public static int SUCCESS = 4;
    public static int HAPPY = 5;
    public static int SAD = 6;
    public static int CONFUSE = 7;
    public static int DELETE = 8;
    public static int SAVE = 9;
    public static int NORMAL = 10;

    public CuteToast(Context context) {
        super(context);
    }

    public static Toast ct(Context context, CharSequence message, int duration, int type) {

        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View view = LayoutInflater.from(context).inflate(R.layout.cutetoast_layout, null, false);

        TextView textView = view.findViewById(R.id.toast_text);
        ImageView imageView = view.findViewById(R.id.image_icon);
        LinearLayout linearLayout = view.findViewById(R.id.l_layout);

        textView.setText(message);

        imageView.setVisibility(View.GONE);

        switch (type) {

            case 1:
                linearLayout.setBackgroundResource(R.drawable.back_info);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.back_warning);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.back_error);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.back_success);
                break;

            case 5:
                linearLayout.setBackgroundResource(R.drawable.back_happy);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.back_sad);
                break;
            case 7:
                linearLayout.setBackgroundResource(R.drawable.back_confuse);
                break;
            case 8:
                linearLayout.setBackgroundResource(R.drawable.back_delete);
                break;
            case 9:
                linearLayout.setBackgroundResource(R.drawable.back_save);
                break;
            case 10:
                linearLayout.setBackgroundResource(R.drawable.back_normal);
                break;


        }

        toast.setView(view);
        return toast;
    }

    public static Toast ct(Context context, CharSequence message, int duration, int type, int img) {

        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View view = LayoutInflater.from(context).inflate(R.layout.cutetoast_layout, null, false);

        TextView textView = view.findViewById(R.id.toast_text);
        ImageView imageView = view.findViewById(R.id.image_icon);
        LinearLayout linearLayout = view.findViewById(R.id.l_layout);

        textView.setText(message);
        imageView.setImageResource(img);

        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.back_info);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.back_warning);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.back_error);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.back_success);
                break;

            case 5:
                linearLayout.setBackgroundResource(R.drawable.back_happy);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.back_sad);
                break;
            case 7:
                linearLayout.setBackgroundResource(R.drawable.back_confuse);
                break;
            case 8:
                linearLayout.setBackgroundResource(R.drawable.back_delete);
                break;
            case 9:
                linearLayout.setBackgroundResource(R.drawable.back_save);
                break;
            case 10:
                linearLayout.setBackgroundResource(R.drawable.back_normal);
                break;


        }

        toast.setView(view);
        return toast;


    }


}
