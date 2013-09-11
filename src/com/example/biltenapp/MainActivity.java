package com.example.biltenapp;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings.PluginState;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button kopce = (Button) findViewById(R.id.OpenPdfButton);
		 kopce.setOnClickListener(new View.OnClickListener() {
         	
             @Override
     public void onClick(View v) {
            	 
            	 WebView mWebView=new WebView(MainActivity.this);
         	    mWebView.getSettings().setJavaScriptEnabled(true);
         	   mWebView.getSettings().setPluginState(PluginState.ON);
         	    mWebView.loadUrl("https://docs.google.com/gview?embedded=true&url=www.kopacka.kladilnica.net/download/bilten.pdf" );
         	    setContentView(mWebView);
		
	}
		   });
		 
		 
		 
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		

		
	}

}
