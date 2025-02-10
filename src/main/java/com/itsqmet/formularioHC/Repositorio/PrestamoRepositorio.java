package com.itsqmet.formularioHC.Repositorio;

import com.itsqmet.formularioHC.Entidad.Prestamo;
import com.itsqmet.formularioHC.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
    List<Usuario> findByUsuario_Id(Long id_usuario);
}
