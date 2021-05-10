package com.rejowan.cutetoastexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.rejowan.cutetoast.CuteToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenConfuse(View view) {
        CuteToast.ct(MainActivity.this, "This is a Confuse Toast", CuteToast.LENGTH_SHORT, CuteToast.CONFUSE, true).show();
    }

    public void OpenDelete(View view) {
        CuteToast.ct(MainActivity.this, "This is a Delete Toast", CuteToast.LENGTH_SHORT, CuteToast.DELETE, true).show();
    }

    public void OpenError(View view) {
        CuteToast.ct(MainActivity.this, "This is a Error Toast", CuteToast.LENGTH_SHORT, CuteToast.ERROR, true).show();
    }

    public void OpenHappy(View view) {
        CuteToast.ct(MainActivity.this, "This is a Happy Toast", CuteToast.LENGTH_SHORT, CuteToast.HAPPY, true).show();
    }

    public void OpenInfo(View view) {
        CuteToast.ct(MainActivity.this, "This is a Info Toast", CuteToast.LENGTH_SHORT, CuteToast.INFO, true).show();
    }

    public void OpenNormal(View view) {
        CuteToast.ct(MainActivity.this, "This is a Normal Toast", CuteToast.LENGTH_SHORT, CuteToast.NORMAL, true).show();
    }

    public void OpenSad(View view) {
        CuteToast.ct(MainActivity.this, "This is a Sad Toast", CuteToast.LENGTH_SHORT, CuteToast.SAD, true).show();
    }

    public void OpenSave(View view) {
        CuteToast.ct(MainActivity.this, "This is a Save Toast", CuteToast.LENGTH_SHORT, CuteToast.SAVE, true).show();
    }

    public void OpenSuccess(View view) {
        CuteToast.ct(MainActivity.this, "This is a Success Toast", CuteToast.LENGTH_SHORT, CuteToast.SUCCESS, true).show();
    }

    public void OpenWarning(View view) {
        CuteToast.ct(MainActivity.this, "This is a Warning Toast", CuteToast.LENGTH_SHORT, CuteToast.WARN, true).show();
    }

    public void OpenInfoNoIcon(View view) {
        CuteToast.ct(MainActivity.this, "This is a Info Toast (no Icon)", CuteToast.LENGTH_SHORT, CuteToast.INFO, false).show();
    }

    public void OpenSuccessNoIcon(View view) {
        CuteToast.ct(this, "This is a Success Toast (no Icon)", CuteToast.LENGTH_SHORT, CuteToast.SUCCESS).show();
    }

    public void OpenWarnNoIcon(View view) {
        CuteToast.ct(MainActivity.this, "This is a Warning Toast (no Icon)", CuteToast.LENGTH_SHORT, CuteToast.WARN, false).show();
    }

    public void OpenErrorNoIcon(View view) {
        CuteToast.ct(MainActivity.this, "This is a Error Toast (no Icon)", CuteToast.LENGTH_SHORT, CuteToast.ERROR, false).show();
    }

    public void OpenGitRepo(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ahmmedrejowan/CuteToast"));
        startActivity(i);
    }

    public void OpenGitProfile(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ahmmedrejowan"));
        startActivity(i);
    }

    public void OpenFacebook(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/ahmmedrejowan"));
        startActivity(i);

    }

    public void OpenWebsite(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rejowan.com"));
        startActivity(i);

    }

    public void OpenInfoCustom(View view) {
        CuteToast.ct(this, "This is an Info Toast with Custom Star Icon", CuteToast.LENGTH_SHORT, CuteToast.INFO, R.drawable.ic_baseline_star_border_24).show();
    }

    public void OpenSuccessCustom(View view) {
        CuteToast.ct(this, "This is an Success Toast with Custom Double Check Icon", CuteToast.LENGTH_SHORT, CuteToast.SUCCESS, R.drawable.ic_baseline_done_all_24).show();

    }

    public void OpenErrorCustom(View view) {
        CuteToast.ct(this, "This is an Error Toast with a Custom Icon", CuteToast.LENGTH_SHORT, CuteToast.ERROR, R.drawable.ic_baseline_done_all_24).show();

    }

    public void OpenWarningCustom(View view) {
        CuteToast.ct(this, "This is an Error Toast with Custom Star Icon", CuteToast.LENGTH_SHORT, CuteToast.ERROR, R.drawable.ic_baseline_star_border_24).show();

    }

}