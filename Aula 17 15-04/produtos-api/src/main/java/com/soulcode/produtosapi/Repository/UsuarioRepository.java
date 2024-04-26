package com.soulcode.produtosapi.Repository;

import com.soulcode.produtosapi.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
