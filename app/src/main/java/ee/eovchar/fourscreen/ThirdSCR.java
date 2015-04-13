package ee.eovchar.fourscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdSCR extends ActionBarActivity {

    public final static String EXTRA_MESSAGE3 = "ee.eovchar.FourScreen.FirstScreen.MESSAGE";

    public void goToScreenFour (View view)
    {
        Intent intent = new Intent(this,FourSCR.class);
        EditText editText = (EditText) findViewById(R.id.edit_message3);
        String message = editText.getText().toString();

        Intent intent2 = getIntent();
        String message2 = intent2.getStringExtra(SecondSCR.EXTRA_MESSAGE2);
        String message3 = message2 + " " + message;

        intent.putExtra(EXTRA_MESSAGE3, message3);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_scr);
    }
}
