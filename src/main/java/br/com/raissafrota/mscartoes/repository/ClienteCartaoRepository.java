package br.com.raissafrota.mscartoes.repository;

import br.com.raissafrota.mscartoes.entity.ClienteCartao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long> {

    List<ClienteCartao> findByCpf(String cpf);
}
