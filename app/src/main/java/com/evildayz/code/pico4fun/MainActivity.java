package com.evildayz.code.pico4fun;

import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button androidsettings = (Button) findViewById(R.id.androidsettings);
    Button manualtests = (Button) findViewById(R.id.manualtests);
    Button factorytest = (Button) findViewById(R.id.factorytest);

    androidsettings.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(Settings.ACTION_SETTINGS));
      }
    });

    manualtests.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent();
        ComponentName cm = new ComponentName("com.picovr.factorytest", "com.picovr.factorytest.PicoFactoryTestManualActivity");
        intent.setComponent(cm);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
      }
    });

    factorytest.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent();
        ComponentName cm = new ComponentName("com.picovr.factorytest", "com.picovr.factorytest.setting.PicoSettingMainActivity");
        intent.setComponent(cm);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
      }
    });
  }
}
