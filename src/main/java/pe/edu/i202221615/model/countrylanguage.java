package pe.edu.i202221615.model;

import jakarta.persistence.*;

@Entity
public class countrylanguage {
    @Id
    private String Language;
    @Enumerated(EnumType.STRING) // Para usar el enum como 'T' o 'F'
    @Column(nullable = false)
    private IsOfficial isOfficial;
    private Double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private String country;

}
