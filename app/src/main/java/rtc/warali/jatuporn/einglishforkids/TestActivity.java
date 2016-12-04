package rtc.warali.jatuporn.einglishforkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity {

    //Explicit
    private int timesAnInt;
    private MyConstant myConstant;
    private int[][] choiceInts;
    private ImageView firstImageView, secondImageView, thirdImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        timesAnInt = getIntent().getIntExtra("Times", 0);
        Log.d("4decV1", "timesAnInt ที่รับได้ ==> " + timesAnInt);

        myConstant = new MyConstant();
        choiceInts = myConstant.getChoiceInts();

        bindWidget();

        //Show View
        showView();

    }   // Main Method

    private void showView() {

        firstImageView.setImageResource(choiceInts[timesAnInt][0]);
        secondImageView.setImageResource(choiceInts[timesAnInt][1]);
        thirdImageView.setImageResource(choiceInts[timesAnInt][2]);


    }

    private void bindWidget() {

        firstImageView = (ImageView) findViewById(R.id.imageView4);
        secondImageView = (ImageView) findViewById(R.id.imageView5);
        thirdImageView = (ImageView) findViewById(R.id.imageView6);

    }

}   // Main Class
