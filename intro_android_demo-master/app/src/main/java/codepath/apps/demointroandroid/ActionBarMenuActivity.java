package codepath.apps.demointroandroid;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.pusher.pushnotifications.PushNotifications;



public class ActionBarMenuActivity extends Activity {


	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_action_bar_menu);
		getActionBar().setTitle("Click an Icon");
		PushNotifications.start(getApplicationContext(), "e68b3ab5-e4a5-4a8b-a2c7-ca3c00c75d98");
		PushNotifications.subscribe("hello");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_action_bar_menu, menu);
		//PushNotifications.start(getApplicationContext(), "e68b3ab5-e4a5-4a8b-a2c7-ca3c00c75d98");
		//PushNotifications.subscribe("hello");
		return true;
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	  switch (item.getItemId()) {
	  case R.id.menu_toast:
		Toast.makeText(this, "Toasted", Toast.LENGTH_SHORT).show();
		break;
	  case R.id.menu_launch:
		Intent i = new Intent(this, SimpleBundleDemoActivity.class);
		startActivity(i);
		break;
	  default:
		break;
	  }
	  return true;
	}
	

}
