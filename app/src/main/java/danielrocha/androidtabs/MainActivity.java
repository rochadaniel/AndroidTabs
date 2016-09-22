package danielrocha.androidtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_git:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/rochadaniel/AndroidTabs"));
                startActivity(intent);
                break;

            case R.id.action_globe:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://rochadaniel.github.io/android/2016/09/22/Android-Trabalhando-com-Tabs.html"));
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void centerTabsClick(View view) {
        intent = new Intent(MainActivity.this, CenterTabsActivity.class);
        startActivity(intent);
    }

    public void fixedTabsClick(View view) {
        intent = new Intent(MainActivity.this, FixedTabsActivity.class);
        startActivity(intent);
    }

    public void scrollableTabsClick(View view) {
        intent = new Intent(MainActivity.this, ScrollableTabsActivity.class);
        startActivity(intent);
    }

    public void customTabsClick(View view) {
        intent = new Intent(MainActivity.this, CustomTabsActivity.class);
        startActivity(intent);
    }

    public void onlyIconsTabsClick(View view) {
        intent = new Intent(MainActivity.this, OnlyIconsTabsActivity.class);
        startActivity(intent);
    }

    public void iconsAndTextTabsClick(View view) {
        intent = new Intent(MainActivity.this, IconsAndTextActivity.class);
        startActivity(intent);
    }


}
