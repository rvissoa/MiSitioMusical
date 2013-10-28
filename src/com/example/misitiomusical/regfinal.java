package com.example.misitiomusical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class regfinal extends Activity {
	private String cuent;
	private EditText et1,et2,et3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registro2);
		et1=(EditText)findViewById(R.id.editTextUsuario);
        et2=(EditText)findViewById(R.id.editTextClave);
        et3=(EditText)findViewById(R.id.et3);
		
		Bundle bundle = getIntent().getExtras();
		cuent=bundle.getString("cuenta");
		
	}
	
	public void lanzaratras(View view) {
		if(cuent.equals("publico")){
			Intent i = new Intent(this, reg1.class );
			startActivity(i);
		}else if(cuent.equals("manager")){
			Intent i = new Intent(this, regmanager.class );
	        startActivity(i);
		}
  }
	public void guardar(View view){
		String v1=et1.getText().toString();
        String v2=et2.getText().toString();
        String v3=et3.getText().toString();
        
        if(v1.equals("") || v2.equals("") || v3.equals("")){
        	Toast t = Toast.makeText(this, "por favor complete el formulario",
                    Toast.LENGTH_SHORT);
            t.show();
        }else if(!v2.equals(v3)){
        	Toast t = Toast.makeText(this, "La contraseña no coincide",
                    Toast.LENGTH_SHORT);
            t.show();
        }else{
        	Toast t2 = Toast.makeText(this, "Felicidades sus datos fueron registros correctamente",
                    Toast.LENGTH_SHORT);
        	t2.show();
        }
	}

}
