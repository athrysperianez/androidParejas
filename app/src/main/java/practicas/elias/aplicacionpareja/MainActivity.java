package practicas.elias.aplicacionpareja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText nombre;
    private EditText apellido;
    private EditText apellido2;
    private Switch switchbtn;
    private RelativeLayout hiddenGroup;
    private TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        nombre = findViewById(R.id.txtName);
        apellido = findViewById(R.id.txtSurname);
        apellido2 = findViewById(R.id.txtSurname2);
        switchbtn = findViewById(R.id.btnSwitch);
        desc = findViewById(R.id.txtDesc);
        hiddenGroup = findViewById(R.id.hiddenGroup);
        nombre.addTextChangedListener(txtWatch);
        apellido.addTextChangedListener(txtWatch);
        apellido2.addTextChangedListener(txtWatch);
        switchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    desc.setVisibility(View.VISIBLE);
                }else{
                    desc.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    TextWatcher txtWatch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!nombre.getText().toString().equals("") && !apellido.getText().toString().equals("") && !apellido2.getText().toString().equals("")){
                hiddenGroup.setVisibility(View.VISIBLE);
            }else{
                hiddenGroup.setVisibility(View.INVISIBLE);
            }
        }
    };

}
