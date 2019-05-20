package entidades;

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PosteoIdentity implements Serializable {

    @NotNull
    private String palabra;

    @NotNull
    private int idLibro;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public PosteoIdentity(String palabra, int idLibro) {
        this.palabra= palabra;
        this.idLibro= idLibro;

    }

    /*public PosteoIdentity(String employeeId, String companyId) {
        this.employeeId = employeeId;
        this.companyId = companyId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PosteoIdentity that = (PosteoIdentity) o;

        if (!palabra.equals(that.palabra)) return false;
        return palabra.equals(that.palabra);
    }

    @Override
    public int hashCode() {
        int result = palabra.hashCode();
        result = 31 * result + palabra.hashCode();
        return result;
    }
}

