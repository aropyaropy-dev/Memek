package com.aiwolfie.iprotator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout l = new LinearLayout(this);
  l.setOrientation(1); l.setGravity(Gravity.CENTER); l.setPadding(32,32,32,32);
  TextView t = new TextView(this);
  t.setText("IP ROTATOR\\n\\nStarter app berhasil dibuat.\\n\\nMesin VPN dan rotasi IP publik belum diimplementasikan. Rotasi IP memerlukan beberapa endpoint VPN/proxy aktif dan backend VPN yang valid.");
  t.setTextSize(20); l.addView(t); setContentView(l);
 }
}
