package com.rejowan.cutetoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CuteToast extends Toast {

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

    public static Toast ct(Context context, CharSequence message, int duration, int type, boolean icon) {

        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View view = LayoutInflater.from(context).inflate(R.layout.cutetoast_layout, null, false);

        TextView textView = view.findViewById(R.id.toast_text);
        ImageView imageView = view.findViewById(R.id.image_icon);
        LinearLayout linearLayout = view.findViewById(R.id.l_layout);

        textView.setText(message);

        if (icon) {
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        switch (type) {

            case 1:
                linearLayout.setBackgroundResource(R.drawable.back_info);
                imageView.setImageResource(R.drawable.ic_info);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.back_warning);
                imageView.setImageResource(R.drawable.ic_warning);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.back_error);
                imageView.setImageResource(R.drawable.ic_error);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.back_success);
                imageView.setImageResource(R.drawable.ic_success);
                break;

            case 5:
                linearLayout.setBackgroundResource(R.drawable.back_happy);
                imageView.setImageResource(R.drawable.ic_happy);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.back_sad);
                imageView.setImageResource(R.drawable.ic_sad);
                break;
            case 7:
                linearLayout.setBackgroundResource(R.drawable.back_confuse);
                imageView.setImageResource(R.drawable.ic_confuse);
                break;
            case 8:
                linearLayout.setBackgroundResource(R.drawable.back_delete);
                imageView.setImageResource(R.drawable.ic_delete);
                break;
            case 9:
                linearLayout.setBackgroundResource(R.drawable.back_save);
                imageView.setImageResource(R.drawable.ic_save);
                break;
            case 10:
                linearLayout.setBackgroundResource(R.drawable.back_normal);
                imageView.setImageResource(R.drawable.ic_info);
                break;


        }

        toast.setView(view);
        return toast;
    }


}
