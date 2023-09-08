package pe.edu.tecsup.mascotas.service.implementations;

import org.springframework.stereotype.Service;
import pe.edu.tecsup.mascotas.domain.Mascota;
import pe.edu.tecsup.mascotas.respository.MascotaRepository;
import pe.edu.tecsup.mascotas.service.MascotaService;

import java.util.List;
@Service
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota editMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
