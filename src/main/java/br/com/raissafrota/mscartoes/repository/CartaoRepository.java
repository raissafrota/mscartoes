package br.com.raissafrota.mscartoes.repository;

import br.com.raissafrota.mscartoes.entity.Cartao;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
    List<Cartao> findByRendaLessThanEqual(BigDecimal renda);
}
