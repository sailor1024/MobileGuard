package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.content.Intent;
<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> 2017/10/15 16:25

import cn.edu.gdmec.android.mobileguard.R;

public class LostFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_find);
       startSetUp1Activity();
    }

    private void startSetUp1Activity() {
       Intent intent=new Intent(LostFindActivity.this,Setup1Activity.class);
       startActivity(intent);
       finish();
   }
}
