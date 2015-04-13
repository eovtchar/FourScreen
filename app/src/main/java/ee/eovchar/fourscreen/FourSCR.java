package ee.eovchar.fourscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class FourSCR extends ActionBarActivity {
    //FirstScreen
    public void goToFirstScreen (View view)
    {
        Intent intent = new Intent(this,FirstScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_scr);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ThirdSCR.EXTRA_MESSAGE3);
                //SENDING THE MESSAGE
        TextView editText = (TextView) findViewById(R.id.textViewXML);
        editText.setText(message);
    }
}
