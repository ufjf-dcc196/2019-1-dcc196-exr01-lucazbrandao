package ufjf.br.dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnGetFullName;
    TextView txtName;
    TextView txtLastName;
    TextView txtFullName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnGetFullName = findViewById(R.id.btn_getfullname);
        txtLastName = findViewById(R.id.txt_sobrenome);
        txtName = findViewById(R.id.txt_nome);
        txtFullName = findViewById(R.id.txt_fullname);

        btnGetFullName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFullName.setText(txtName.getText() + " " + txtLastName.getText());
            }
        });


    }



}
