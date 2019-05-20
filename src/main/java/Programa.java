import entidades.PosteoEntity;
import entidades.VocabularioEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Crear el Entity Manager Factory
        // con el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrosPU");

        // Crear el Entity Manager con el factory.
        EntityManager em = emf.createEntityManager();
       // PosteoEntity nuevo = new PosteoEntity()
       // VocabularioEntity nuevo = new VocabularioEntity();
        //nuevo.setId(3);
       // nuevo.setNombre("Angela Cespedes");
      //  new PosteoEntity("juan",1);
       // em.getTransaction().begin();
       // em.persist(nuevo);
       // em.getTransaction().commit();

        // La consulta no es SQL!!!
        // es JPQL
       // TypedQuery<VocabularioEntity> q = em.createQuery("select a from VocabularioEntity a order by a.nombre desc", VocabularioEntity.class);
        //Ejecuta la consulta JPQL
      //  List<VocabularioEntity> lista = q.getResultList();
        //Recorre y muestra
       /* for(VocabularioEntity a: lista)
            System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de un autor");
        int id = sc.nextInt();

        // find busca por la clave primaria
        VocabularioEntity encontrado = em.find(VocabularioEntity.class, id);
        if (encontrado != null) {
            System.out.println("Autor: " + encontrado.getNombre());
            // getLibros obtiene en este momento las entidades Libro
            // relacionadas con la entidad Autor
            System.out.println(encontrado.getLibros());
        }
        else
            System.out.println("No encontrado");

        System.out.println("Ingrese el nombre de un autor");
        String nombre = sc.next();

        // Esta otra consulta tiene un parámetro
        TypedQuery<VocabularioEntity> tqNombres = em.createQuery("select a from VocabularioEntity a where a.nombre like :nom", VocabularioEntity.class);
        tqNombres.setParameter("nom", "%" + nombre + "%");

        List<VocabularioEntity> autores = tqNombres.getResultList();
        for(VocabularioEntity a: autores)
            System.out.println(a);
/**/
        em.close();
    }
}
