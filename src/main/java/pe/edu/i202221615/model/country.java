package pe.edu.i202221615.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class country {
    @Id
    private String Code;
    private String Name;
    @Enumerated(EnumType.STRING) // Mapea el enum con los valores como texto
    @Column(nullable = false)
    private Continent continent;
    private String Region;
    private Double SurfaceArea;
    private int IndepYear;
    private int Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;

    @OneToMany(mappedBy = "country")
    private List<city> citys;

    @OneToMany(mappedBy = "country")
    private List<countrylanguage> languages;

}
