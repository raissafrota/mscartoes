package br.com.raissafrota.mscartoes.service;

import br.com.raissafrota.mscartoes.entity.Cartao;
import br.com.raissafrota.mscartoes.repository.CartaoRepository;
import java.math.BigDecimal;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository repository;

    @Transactional
    public Cartao save(Cartao cartao){
        return repository.save(cartao);
    }

    public List<Cartao> getCartoesRendaMenorIgual(Long renda){
        var rendaBigDecimal = BigDecimal.valueOf(renda);
        return repository.findByRendaLessThanEqual(rendaBigDecimal);
    }
}
