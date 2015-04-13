package ee.eovchar.fourscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class SecondSCR extends ActionBarActivity {

    public final static String EXTRA_MESSAGE2 = "ee.eovchar.FourScreen.SecondSCR.edit_MSG2";

    public void goToScreenThree (View view)
    {
        Intent intent = new Intent(this,ThirdSCR.class);
        EditText editText = (EditText) findViewById(R.id.edit_message2);
        String message = editText.getText().toString();

        Intent intent2 = getIntent();
        String message2 = intent2.getStringExtra(FirstScreen.EXTRA_MESSAGE1);
        String message3 = message2 + " " + message;

        intent.putExtra(EXTRA_MESSAGE2, message3);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_scr);
    }

}
