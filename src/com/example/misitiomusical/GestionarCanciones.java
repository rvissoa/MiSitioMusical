package com.example.misitiomusical;

import com.example.misitiomusical.Listeners.MiTabListener;
import com.example.misitiomusical.fragmentoTabs.FragmentoTabAgregarCancion;
import com.example.misitiomusical.fragmentoTabs.FragmentoTabBuscarCancion;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.view.Menu;

public class GestionarCanciones extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gestionar_canciones);
		//Obtenemos una referencia a la actionbar
	    ActionBar abar = getActionBar();
	 
	    //Establecemos el modo de navegación por pestañas
	    abar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	 
	    //Ocultamos si queremos el título de la actividad
	    //abar.setDisplayShowTitleEnabled(false);
	 
	    //Creamos las pestañas
	    ActionBar.Tab tab1 =abar.newTab().setText("Registrar");
	 
	    ActionBar.Tab tab2 =abar.newTab().setText("Buscar");
	 
	    //Creamos los fragments de cada pestaña
	        Fragment tab1frag = new FragmentoTabAgregarCancion();
	        Fragment tab2frag = new FragmentoTabBuscarCancion();
	 
	        //Asociamos los listener a las pestañas
	        tab1.setTabListener(new MiTabListener(tab1frag));
	        tab2.setTabListener(new MiTabListener(tab2frag));
	 
	        //Añadimos las pestañas a la action bar
	        abar.addTab(tab1);
	        abar.addTab(tab2);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gestionar_canciones, menu);
		return true;
	}

}
