package ee.eovchar.fourscreen;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FirstScreen extends ActionBarActivity {


 public final static String EXTRA_MESSAGE1 = "ee.eovchar.FourScreen.FirstScreen.MESSAGE";

    public void goToScreenTwo (View view)
    {

        Intent intent = new Intent(this,SecondSCR.class);
        EditText editText = (EditText) findViewById(R.id.edit_message1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

}
