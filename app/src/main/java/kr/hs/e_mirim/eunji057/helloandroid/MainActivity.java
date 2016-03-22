package kr.hs.e_mirim.eunji057.helloandroid; //패키지 있는 경우 패키지 밖의 상단폴더에서 실행

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R 리소스
    }
}
