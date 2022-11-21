package app.ejemplo.loginv3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.loginv3.R;

import java.util.List;
public class RecyclerViewAdaptador extends RecyclerView.Adapter <RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre, apellido, telefono, marca, modelo, descripcion;
        ImageView imagen;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvPersona);
            apellido = (TextView) itemView.findViewById(R.id.tv_apellido);
            telefono = (TextView) itemView.findViewById((R.id.tvtelefono));
            marca = (TextView) itemView.findViewById(R.id.tv_marca);
            modelo = (TextView) itemView.findViewById(R.id.tv_modelo);
            descripcion = (TextView) itemView.findViewById(R.id.tvdescripcion);
            imagen = (ImageView) itemView.findViewById(R.id.img_persona);

        }
    }

    public List<PersonaModelo> personaLista;

    public RecyclerViewAdaptador(List<PersonaModelo> personaLista) {
        this.personaLista = personaLista;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tem_persona, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.nombre.setText(personaLista.get(position).getNombre());
        holder.apellido.setText(personaLista.get(position).getApellido());
        holder.telefono.setText(personaLista.get(position).getTelefono());
        holder.marca.setText(personaLista.get(position).getMarca());
        holder.modelo.setText(personaLista.get(position).getModelo());
        holder.descripcion.setText(personaLista.get(position).getDescripcion());
        //holder.imagen.setText(personaLista.get(position).getImagen());


    }

        @Override
        public int getItemCount () {
            return personaLista.size();
        }


    }
