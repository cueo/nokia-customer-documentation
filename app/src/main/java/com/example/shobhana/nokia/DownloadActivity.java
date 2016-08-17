package com.example.shobhana.nokia;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadActivity extends AppCompatActivity
{
	//private String link = "https://www.youtube.com/watch?v=_iBpTqp8nX8";
	private String link = "file:///";
	private ProgressDialog pDialog;
	public static final int progress_bar_type = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_download);

		WebView wb = (WebView) findViewById(R.id.webView1);
		wb.setWebViewClient(new WebViewClient());
		wb.getSettings().setJavaScriptEnabled(true);
		wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		//wb.getSettings().setPluginState(WebSettings.PluginState.ON);
		wb.setWebChromeClient(new WebChromeClient());

		File sdcard = Environment.getExternalStorageDirectory();
		link += sdcard.toString() + "/Nokia/system_overview/concepts/configuration_management.html";
		wb.loadUrl(link);

		System.out.println("link: " + link);
	}
}