package pe.edu.tecsup.mascotas.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.tecsup.mascotas.domain.Mascota;
import pe.edu.tecsup.mascotas.service.MascotaService;

import java.util.List;

@RestController
@RequestMapping(value = "/mascota")
public class MascotaController {
    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }
    @PostMapping
    public Mascota createMascota(@RequestBody Mascota mascota){
        return this.mascotaService.editMascota(mascota);
    }
    @GetMapping
    public List<Mascota> listMasctoras(){
        return this.mascotaService.listarMascotas();
    }
    @PutMapping
    public Mascota updateMascota(@RequestBody Mascota mascota){
        return this.mascotaService.editMascota(mascota);
    }
    @DeleteMapping
    public void deleteMascota(@RequestParam(name = "id") Long id){
        this.mascotaService.deleteMascota(id);
    }
}
