package com.diaspark;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class test extends Activity {
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button bt = (Button)findViewById(R.id.add);
        bt.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Toast toast = Toast.makeText(getApplicationContext(), "Choose '<WALLPAPER NAME>' from the list to start the Live Wallpaper.",Toast.LENGTH_LONG);
		        toast.show();
				//after chnaging in the project...
		        Toast.makeText(getApplicationContext(), "sasa", 1000).show();
		        Intent intent = new Intent();
		        intent.setAction(WallpaperManager.ACTION_LIVE_WALLPAPER_CHOOSER);
		        startActivity(intent);

				
			}
		});
        
    }
}