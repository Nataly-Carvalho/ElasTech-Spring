package com.soulcode.vendas.repositories;

import com.soulcode.vendas.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
