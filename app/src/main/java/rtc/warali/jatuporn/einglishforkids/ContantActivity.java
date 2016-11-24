package rtc.warali.jatuporn.einglishforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContantActivity extends AppCompatActivity {


    // Explicit
    private TextView textView;
    private int anInt;
    private String[] titleStrings = new String[]{"ตัวพยัญชนะ","ตัวเลข"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contant);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView2);
        anInt = getIntent().getIntExtra("Index", 0);
        textView.setText(titleStrings[anInt]);
    }// Main Method

}// Main Class
