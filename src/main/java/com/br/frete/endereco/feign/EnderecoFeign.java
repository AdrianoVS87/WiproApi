package com.br.frete.endereco.feign;

import com.br.frete.endereco.model.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface EnderecoFeign {

    @GetMapping("{cep}/json")
    EnderecoResponse buscaEnderecoCep(@PathVariable("cep") String cep);

}
