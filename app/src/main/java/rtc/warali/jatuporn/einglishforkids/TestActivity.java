package rtc.warali.jatuporn.einglishforkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    //Explicit
    private int timesAnInt;
    private MyConstant myConstant;
    private int[][] choiceInts;
    private ImageView firstImageView, secondImageView, thirdImageView;
    private TextView questionTextView, scoreTextView;
    private String[] questionStrings;



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

        //ShowQuestion
        questionStrings = myConstant.getQurstionStrings();
        questionTextView.setText(questionStrings[timesAnInt]);



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
        questionTextView = (TextView) findViewById(R.id.textView4);
        scoreTextView = (TextView) findViewById(R.id.textView3);

    }

}   // Main Class
