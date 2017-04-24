package ankit.developer.unknowns.popview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import rb.popview.PopField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final PopField mPopField = PopField.attach2Window(this);
        final TextView oldTextView = (TextView)findViewById(R.id.textView);
        oldTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView = inflater.inflate(R.layout.new_text_view,null);
                TextView newTextView = (TextView)addView.findViewById(R.id.newTextView);
                mPopField.popView(oldTextView,addView,true);
            }
        });
    }
}
