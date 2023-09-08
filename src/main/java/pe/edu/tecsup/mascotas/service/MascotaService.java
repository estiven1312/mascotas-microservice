package pe.edu.tecsup.mascotas.service;

import pe.edu.tecsup.mascotas.domain.Mascota;

import java.util.List;

public interface MascotaService {
    List<Mascota> listarMascotas();

    Mascota findById(Long id);

    void deleteMascota(Long id);

    Mascota editMascota(Mascota mascota);
}
