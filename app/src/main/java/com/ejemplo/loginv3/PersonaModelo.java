package app.ejemplo.loginv3;

import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

public class PersonaModelo extends AppCompatActivity {
    public String id,nombre,apellido,telefono,marca,modelo,descripcion,imagen;

    public PersonaModelo() {
    }

    public PersonaModelo(String nombre, String apellido,String telefono, String marca, String modelo,String descripcion, String imagen) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public PersonaModelo(String id, String nombre, String apellido, String telefono, String marca, String modelo, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
