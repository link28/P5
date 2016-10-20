package edu.tecii.andrioid.p5;

import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cent,far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cent = (EditText)findViewById(R.id.Centigrados);
        this.far = (EditText)findViewById(R.id.Farenheit);







        this.cent.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event){

                float faren;
                faren = (1.8f)*Float.parseFloat(cent.getText().toString())+32;
                far.setText(""+faren);
                return false;

            }
    });

        this.far.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event){

                float centi;
                centi = (Float.parseFloat(far.getText().toString())-32)/(1.8f);
                cent.setText(""+centi);
                return false;


        }


    });
}


@Override
public boolean onCreateOptionsMenu(Menu menu){

    getMenuInflater().inflate(R.menu.main,menu);
    return true;
}
}
