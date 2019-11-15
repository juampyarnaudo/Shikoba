package com.example.shikoba;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); //retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.mivImagen);
        TextView titulo = (TextView) vista.findViewById(R.id.mtvTitulo);
        TextView Descripcion = (TextView) vista.findViewById(R.id.mtvDescripcion);
        titulo.setText(ListaObjetos.get(position).getTitulo());
        Descripcion.setText(ListaObjetos.get(position).getDetalle());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());
        return vista;


    }
}
