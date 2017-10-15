package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.content.Intent;
import android.content.SharedPreferences;


<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> 2017/10/15 16:25
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Toast;

import cn.edu.gdmec.android.mobileguard.R;

public abstract class BaseSetUpActivity extends AppCompatActivity {
    public SharedPreferences sp;
    //手势识别
    private GestureDetector mGestureDetector ;
    //抽象方法
    public abstract void showNext();

    public  abstract  void showPre();

    //用手势识别器去识别触控事件
    @Override
    public boolean onTouchEvent(MotionEvent event){
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public void startActivityAndFinishSelf(Class<?> cls) {
        Intent intent=new Intent(this, cls);
        startActivity(intent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        sp=getSharedPreferences("config",MODE_PRIVATE);
       // setContentView(R.layout.activity_base_set_up);

        mGestureDetector=new GestureDetector(this,new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onFling(MotionEvent e1,MotionEvent e2,float velocityX,float velocityY){
                if (Math.abs(velocityX)<200){
                    Toast.makeText(getApplicationContext(),
                            "无效动作，移动太慢",Toast.LENGTH_SHORT).show();
                    return true;
                }
                if ((e2.getRawX()-e1.getRawY())> 200){
                    showPre();
<<<<<<< HEAD
                    overridePendingTransition(R.anim.pre_in,R.anim.pre_out);
=======
                    overridePendingTransition(R.anim.pre_in, R.anim.pre_out);
>>>>>>> 2017/10/15 16:25
                    return  true;
                }
                if ((e1.getRawX()-e2.getRawX())>200){
                    showNext();
<<<<<<< HEAD
                    overridePendingTransition(R.anim.next_in,R.anim.next_out);
=======
                    overridePendingTransition(R.anim.next_in, R.anim.next_out);
>>>>>>> 2017/10/15 16:25
                    return  true;
                }
                return super.onFling(e1,e2,velocityX, velocityY);
            }
        });
    }
}
