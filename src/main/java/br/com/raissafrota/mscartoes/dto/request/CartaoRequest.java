package br.com.raissafrota.mscartoes.dto.request;

import br.com.raissafrota.mscartoes.Enum.BandeiraCartao;
import br.com.raissafrota.mscartoes.entity.Cartao;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CartaoRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limiteBasico;

    public Cartao toModel(){
        return new Cartao(nome, bandeira, renda, limiteBasico );
    }
}
