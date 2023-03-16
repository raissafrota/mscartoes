package br.com.raissafrota.mscartoes.controller;

import br.com.raissafrota.mscartoes.dto.request.CartaoRequest;
import br.com.raissafrota.mscartoes.entity.Cartao;
import br.com.raissafrota.mscartoes.service.CartaoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartoesController {

    private final CartaoService cartaoService;

    @GetMapping
    public String status(){
        return "Aplicação subiu! Está tudo ok!";
    }

    @PostMapping
    public ResponseEntity cadastra(@RequestBody CartaoRequest request ){
        Cartao cartao = request.toModel();
        cartaoService.save(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> getCartoesRendaAteh(@RequestParam("renda") Long renda){
        List<Cartao> list = cartaoService.getCartoesRendaMenorIgual(renda);
        return ResponseEntity.ok(list);
    }
}
