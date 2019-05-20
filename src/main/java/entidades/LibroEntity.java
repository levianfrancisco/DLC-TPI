package entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Libro")
public class LibroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;

    @Column
    private String titulo;


    @OneToMany(mappedBy = "libro")
    private List<PosteoEntity> posteos;

    public List<PosteoEntity> getPosteos(){
        return posteos;
    }


    public LibroEntity() {
    }


    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "LibroEntity{" +
                "id=" + idLibro +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
