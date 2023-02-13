package cacome.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Circuit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_circuit")
    private Integer idCircuit;
    @Basic
    @Column(name = "depart")
    private Integer depart;
    @Basic
    @Column(name = "arrivee")
    private Integer arrivee;

    public Integer getIdCircuit() {
        return idCircuit;
    }

    public void setIdCircuit(Integer idCircuit) {
        this.idCircuit = idCircuit;
    }

    public Integer getDepart() {
        return depart;
    }

    public void setDepart(Integer depart) {
        this.depart = depart;
    }

    public Integer getArrivee() {
        return arrivee;
    }

    public void setArrivee(Integer arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circuit circuit = (Circuit) o;

        if (idCircuit != null ? !idCircuit.equals(circuit.idCircuit) : circuit.idCircuit != null) return false;
        if (depart != null ? !depart.equals(circuit.depart) : circuit.depart != null) return false;
        if (arrivee != null ? !arrivee.equals(circuit.arrivee) : circuit.arrivee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCircuit != null ? idCircuit.hashCode() : 0;
        result = 31 * result + (depart != null ? depart.hashCode() : 0);
        result = 31 * result + (arrivee != null ? arrivee.hashCode() : 0);
        return result;
    }
}
