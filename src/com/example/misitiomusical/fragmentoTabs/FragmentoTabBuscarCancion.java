package com.example.misitiomusical.fragmentoTabs;

import com.example.misitiomusical.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FragmentoTabBuscarCancion extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
    	View vistaBusqueda=inflater.inflate(R.layout.fragment_tab_buscar, container, false);
    	Spinner spinnerAlbumes = (Spinner) vistaBusqueda.findViewById(R.id.spinnerAlbumes);
    	// Create an ArrayAdapter using the string array and a default spinner layout
    	//this.getActivity.getApplicationContext obtiene el contexto de otro sitio
    	ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity().getApplicationContext(),
    	        R.array.albumes_array, android.R.layout.simple_spinner_item);
    	// Specify the layout to use when the list of choices appears

    	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    	// Apply the adapter to the spinner
    	spinnerAlbumes.setAdapter(adapter);
    	Spinner spinnerGeneros = (Spinner) vistaBusqueda.findViewById(R.id.SpinnerGeneroBuscar);
    	// Create an ArrayAdapter using the string array and a default spinner layout
    	//this.getActivity.getApplicationContext obtiene el contexto de otro sitio
    	ArrayAdapter<CharSequence> adapterGeneros = ArrayAdapter.createFromResource(this.getActivity().getApplicationContext(),
    	        R.array.generos_array, android.R.layout.simple_spinner_item);
    	// Specify the layout to use when the list of choices appears

    	adapterGeneros.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    	// Apply the adapter to the spinner
    	spinnerGeneros.setAdapter(adapterGeneros);
        return vistaBusqueda;    }

}
