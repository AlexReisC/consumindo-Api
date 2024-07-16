package br.com.aplicacao;

import br.com.aplicacao.dto.EnderecoDto;
import br.com.aplicacao.servico.ApiServico;

public class Main {
    public static void main(String[] args) {
        ApiServico apiServico = new ApiServico();
        EnderecoDto enderecoDto = new EnderecoDto();
        enderecoDto = apiServico.getEndereco("63575000");
        System.out.println(enderecoDto.getLocalidade());

    }
}