package com.example.listapostapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private List<Post> listaPost;

    public PostAdapter(List<Post> listaPost) {
        this.listaPost = listaPost;
    }

    @Override
    public int getCount() {
        return this.listaPost.size();
    }

    @Override
    public Post getItem(int position) {
        return this.listaPost.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout;

        if(convertView==null){
            layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_post_item,null);
        }else{
            layout=convertView;
        }

        Post item = getItem(position);

        TextView textViewNombre = layout.findViewById(R.id.textViewNombre);
        TextView textViewEmail = layout.findViewById(R.id.textViewEmail);
        TextView textViewDomicilio = layout.findViewById(R.id.textViewDomicilo);
        TextView textViewTelefono = layout.findViewById(R.id.textViewTelefono);

        textViewNombre.setText(item.getNombre());
        textViewEmail.setText(item.getEmail());
        textViewDomicilio.setText(item.getDomicilio());
        textViewTelefono.setText(item.getTelefono());

        //inflate anterior
        /*
        TextView textViewTitulo = layout.findViewById(R.id.textViewTitulo);
        TextView textViewContenido = layout.findViewById(R.id.textViewEmail);

        textViewTitulo.setText(item.getTitle());
        textViewContenido.setText(item.getBody());*/


        return layout;
    }
}
