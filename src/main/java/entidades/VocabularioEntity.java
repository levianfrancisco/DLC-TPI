package entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Vocabulario")
public class VocabularioEntity {
    @Id
    private String palabra;

    @Column
    private int cantDoc;

    @OneToMany(mappedBy = "vocabulario")
    private List<PosteoEntity> posteos;

    public List<PosteoEntity> getPosteos(){
            return posteos;
}

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCantDoc() {
        return cantDoc;
    }

    public void setCantDoc(int nr) {
        this.cantDoc = cantDoc;
    }

    public int getMaxVecesEnDoc() {
        return maxVecesEnDoc;
    }

    public void setMaxVecesEnDoc(int maxVecesEnDoc) {
        this.maxVecesEnDoc = maxVecesEnDoc;
    }

    @Override
    public String toString() {
        return "VocabularioEntity{" +
                "palabra='" + palabra + '\'' +
                ", nr=" + cantDoc +
                ", maxtf=" + maxVecesEnDoc +
                '}';
    }

    @Column
    private int maxVecesEnDoc;
}


   /* public List<LibroEntity> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroEntity> libros) {
        this.libros = libros;
    }

    @OneToMany(mappedBy = "idAutor")
    private List<LibroEntity> libros;

    public VocabularioEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  id + ": " + nombre;
    }
}
*/