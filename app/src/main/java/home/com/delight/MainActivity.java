package home.com.delight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView mTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTextView = findViewById(R.id.activity_main_text_tv);

    mTextView.setTextColor(Color.BLACK);
    mTextView.setText("After hotfix");

    mTextView.setAllCaps(true);

    mTextView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

    mTextView.setGravity(Gravity.CENTER);

    mTextView.setError("Error");
  }
}
