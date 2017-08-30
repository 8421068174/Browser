package nikam.com.browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser=(WebView)findViewById(R.id.webview);


        browser.setWebViewClient(new WebViewClient());
        browser.getSettings().setJavaScriptEnabled(true);//This statement is used to enable the execution of JavaScript.

        browser.setVerticalScrollBarEnabled(true);//This statement hides the Vertical scroll bar and does not remove it.

        browser.setHorizontalScrollBarEnabled(true);//This statement hides the Horizontal scroll bar and does not remove it.

        browser.loadUrl("https://www.google.co.in/");//This statement hides the scroll bar and does not remove it.
    }
}
