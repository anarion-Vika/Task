package severina.testtask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eText;
    TextView etResult;
    Button btnSplit, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (EditText) findViewById(R.id.inputText);
        etResult =(TextView)findViewById(R.id.tVResult);
        btnSplit = (Button) findViewById(R.id.btnSplit);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnSplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String ResText = eText.getText().toString();
                Split split = new Split();
               etResult.setText(split.Splitm(ResText));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(null);
                eText.setText(null);
            }
        });
    }
}
