/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.malinkil.fp.peoplebackend;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mithun.alinkil
 */
@Entity
@Table(name = "catrer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catrer.findAll", query = "SELECT c FROM Catrer c"),
    @NamedQuery(name = "Catrer.findByCatrerId", query = "SELECT c FROM Catrer c WHERE c.catrerId = :catrerId"),
    @NamedQuery(name = "Catrer.findByCatrerName", query = "SELECT c FROM Catrer c WHERE c.catrerName = :catrerName"),
    @NamedQuery(name = "Catrer.findByCatrerCity", query = "SELECT c FROM Catrer c WHERE c.catrerCity = :catrerCity")})
public class Catrer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CatrerId")
    private Integer catrerId;
    @Size(max = 45)
    @Column(name = "Catrer_Name")
    private String catrerName;
    @Size(max = 45)
    @Column(name = "Catrer_City")
    private String catrerCity;

    public Catrer() {
    }

    public Catrer(Integer catrerId) {
        this.catrerId = catrerId;
    }

    public Integer getCatrerId() {
        return catrerId;
    }

    public void setCatrerId(Integer catrerId) {
        this.catrerId = catrerId;
    }

    public String getCatrerName() {
        return catrerName;
    }

    public void setCatrerName(String catrerName) {
        this.catrerName = catrerName;
    }

    public String getCatrerCity() {
        return catrerCity;
    }

    public void setCatrerCity(String catrerCity) {
        this.catrerCity = catrerCity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catrerId != null ? catrerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catrer)) {
            return false;
        }
        Catrer other = (Catrer) object;
        if ((this.catrerId == null && other.catrerId != null) || (this.catrerId != null && !this.catrerId.equals(other.catrerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.iit.sat.itmd4515.malinkil.fp.peoplebackend.Catrer[ catrerId=" + catrerId + " ]";
    }
    
}
