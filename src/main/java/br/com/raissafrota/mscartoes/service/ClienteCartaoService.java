package br.com.raissafrota.mscartoes.service;

import br.com.raissafrota.mscartoes.entity.ClienteCartao;
import br.com.raissafrota.mscartoes.repository.ClienteCartaoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
