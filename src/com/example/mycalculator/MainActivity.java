package com.example.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.mycalculator.Operaciones;


public class MainActivity extends Activity implements OnClickListener {
	
	private EditText editT_resultado;
	private Button button_resultado;
	private Button button_cero;
	private Button button_uno;
	private Button button_dos;
	private Button button_tres;
	private Button button_cuatro;
	private Button button_cinco;
	private Button button_seis;
	private Button button_siete;
	private Button button_ocho;
	private Button button_nueve;
	private Button button_multiplicar;
	private Button button_restar;
	private Button button_sumar;
	private Button button_dividir;
	private ImageView imageV_borrar;
	
	private String a="0";
	private String b="0";
	private String signo="";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editT_resultado = (EditText) findViewById(R.id.editT_resultado);
		
		imageV_borrar = (ImageView) findViewById(R.id.imageView_borrar);
		
		button_resultado = (Button) findViewById(R.id.button_resultado);
		button_sumar = (Button) findViewById(R.id.button_suma);
		button_restar = (Button) findViewById(R.id.button_resta);
		button_multiplicar = (Button) findViewById(R.id.button_multriplicar);
		button_dividir = (Button) findViewById(R.id.button_division);
		
		button_cero = (Button) findViewById(R.id.button_cero);
		button_uno = (Button) findViewById(R.id.button_uno);
		button_dos = (Button) findViewById(R.id.button_dos);
		button_tres = (Button) findViewById(R.id.button_tres);
		button_cuatro = (Button) findViewById(R.id.button_cuatro);
		button_cinco = (Button) findViewById(R.id.button_cinco);
		button_seis = (Button) findViewById(R.id.button_seis);
		button_siete = (Button) findViewById(R.id.button_siete);
		button_ocho = (Button) findViewById(R.id.button_ocho);
		button_nueve = (Button) findViewById(R.id.button_nueve);
		
		button_cero.setOnClickListener(this);
		button_resultado.setOnClickListener(this);
		button_sumar.setOnClickListener(this);
		button_restar.setOnClickListener(this);
		button_multiplicar.setOnClickListener(this);
		button_dividir.setOnClickListener(this);
		button_uno.setOnClickListener(this);
		button_dos.setOnClickListener(this);
		button_tres.setOnClickListener(this);
		button_cuatro.setOnClickListener(this);
		button_cinco.setOnClickListener(this);
		button_seis.setOnClickListener(this);
		button_siete.setOnClickListener(this);
		button_ocho.setOnClickListener(this);
		button_nueve.setOnClickListener(this);
		button_resultado.setOnClickListener(this);
		imageV_borrar.setOnClickListener(this);
		
	}

	public void limpiarResultado(){
		editT_resultado.setText("");
		
	}

	@Override
	public void onClick(View arg0) {
		
		switch (arg0.getId()) {
		
		case R.id.button_cero:
			if (!editT_resultado.getText().equals(null)) {
				
				editT_resultado.setText(editT_resultado.getText()+"0");
			}
						
			break;

		case R.id.button_uno:
			editT_resultado.setText(editT_resultado.getText()+"1");
			break;
			
		case R.id.button_dos:
			editT_resultado.setText(editT_resultado.getText()+"2");
			break;
		
		case R.id.button_tres:
			editT_resultado.setText(editT_resultado.getText()+"3");
			break;
			
		case R.id.button_cuatro:
			editT_resultado.setText(editT_resultado.getText()+"4");
			break;
			
		case R.id.button_cinco:
			editT_resultado.setText(editT_resultado.getText()+"5");
			break;
			
		case R.id.button_seis:
			editT_resultado.setText(editT_resultado.getText()+"6");
			break;
			
		case R.id.button_siete:
			editT_resultado.setText(editT_resultado.getText()+"7");
			break;
		
		case R.id.button_ocho:
			editT_resultado.setText(editT_resultado.getText()+"8");
			break;
			
		case R.id.button_nueve:
			editT_resultado.setText(editT_resultado.getText()+"9");
			break;
			
		case R.id.imageView_borrar:
			editT_resultado.setText("");
			break;
			
		case R.id.button_resultado:
			b = editT_resultado.getText().toString();
			if (signo.equals("+")) {
				editT_resultado.setText(Operaciones.calcular_operacion(a, b, "+"));
				break;
			} else {
				if (signo.equals("-")) {
					editT_resultado.setText(Operaciones.calcular_operacion(a, b, "-"));
					break;
				} else {
					if (signo.equals("*")) {
						editT_resultado.setText(Operaciones.calcular_operacion(a, b, "*"));
						break;
					} else {
						editT_resultado.setText(Operaciones.calcular_operacion(a, b, "/"));
						break;
					}

				}

			}		
			
			
		case R.id.button_suma:
			a = editT_resultado.getText().toString();
			signo = "+";
			editT_resultado.setText("");
			break;
			
		case R.id.button_resta:
			a = editT_resultado.getText().toString();
			signo = "-";
			editT_resultado.setText("");
			break;
			
		case R.id.button_multriplicar:
			a = editT_resultado.getText().toString();
			signo = "*";
			editT_resultado.setText("");
			break;
			
		case R.id.button_division:
			a = editT_resultado.getText().toString();
			signo = "/";
			editT_resultado.setText("");
			break;
			
			
		}
		// TODO Auto-generated method stub
		
	}

}
