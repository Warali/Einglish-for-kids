package rtc.warali.jatuporn.einglishforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    //Explicit
    private int timesAnInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        timesAnInt = getIntent().getIntExtra("Times", 0);
        Log.d("4decV1", "timesAnInt ที่รับได้ ==> " + timesAnInt);

    }   // Main Method

}   // Main Class
