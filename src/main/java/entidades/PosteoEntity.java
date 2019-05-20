package entidades;

import javax.persistence.*;

@Entity
@Table(name = "Posteo")

public class PosteoEntity {

    @EmbeddedId
    PosteoIdentity posteoIdentity;

    @Column
    private int vecesEnDoc;


    @ManyToOne
    @MapsId("palabra")
    @JoinColumn(name = "palabra")
    VocabularioEntity vocabulario;

    @ManyToOne
    @MapsId("idLibro")
    @JoinColumn(name = "idLibro")
    LibroEntity libro;

    public PosteoEntity(String palabra, int idLibro){
        posteoIdentity = new PosteoIdentity(palabra, idLibro);
    }



    public PosteoIdentity getPosteoIdentity() {
        return posteoIdentity;
    }

    public void setPosteoIdentity(PosteoIdentity posteoIdentity) {
        this.posteoIdentity = posteoIdentity;
    }

    public int getVecesEnDoc() {
        return vecesEnDoc;
    }

    public void setVecesEnDoc(int vecesEnDoc) {
        this.vecesEnDoc = vecesEnDoc;
    }

    public String getPalabra() {
        return posteoIdentity.getPalabra();
    }

    public void setVocabulario(VocabularioEntity vocabulario) {
        this.vocabulario = vocabulario;
    }

    public LibroEntity getLibro() {
        return libro;
    }

    public void setLibro(LibroEntity libro) {
        this.libro = libro;
    }


}
