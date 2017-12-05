package com.fju.mid2.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int FUNC_LOGIN =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fu1(View view) {
        Intent intent = new Intent(this,Func1Activity.class);
        startActivity(intent);

    }
    public void fu2(View view) {
        Intent intent = new Intent(this,Func2Activity.class);
        startActivity(intent);

    }
    public void fu3(View view) {
        Intent intent = new Intent(this,Func3Activity.class);
        startActivityForResult(intent,FUNC_LOGIN);


    }
    public void fu4(View view) {
        Intent intent = new Intent(this,Func4Activity.class);
        startActivity(intent);

    }
    public void fu5(View view) {
        Intent intent = new Intent(this,Func5Activity.class);
        startActivity(intent);

    }
    public void fu6(View view) {
        Intent intent = new Intent(this,Func6Activity.class);
        startActivity(intent);

    }
    public void fu7(View view) {
        Intent intent = new Intent(this,Func7Activity.class);
        startActivityForResult(intent,FUNC_LOGIN);

    }
    public void fu8(View view) {
        Intent intent = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,FUNC_LOGIN);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,  resultCode,  data);
        if(requestCode==FUNC_LOGIN){
            if(resultCode==RESULT_OK){
                Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
            }
            else{
                finish();
            }
        }
    }



}
