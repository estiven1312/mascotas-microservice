package pe.edu.tecsup.mascotas.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.mascotas.domain.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
