package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Entitybus {
    private int eid;
    private String enumber;

    @Id
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "ENUMBER", nullable = true, length = 255)
    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entitybus entitybus = (Entitybus) o;
        return eid == entitybus.eid && Objects.equals(enumber, entitybus.enumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, enumber);
    }
}
