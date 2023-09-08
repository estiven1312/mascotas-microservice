package pe.edu.tecsup.mascotas.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id;
    private String nombre;
    private String especie;
    private Integer edad;
    private String color;
    private String foto;
}
