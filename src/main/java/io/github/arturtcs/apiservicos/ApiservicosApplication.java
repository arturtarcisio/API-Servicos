package io.github.arturtcs.apiservicos;

import io.github.arturtcs.apiservicos.entities.Cliente;
import io.github.arturtcs.apiservicos.entities.Servico;
import io.github.arturtcs.apiservicos.repositories.ClienteRepository;
import io.github.arturtcs.apiservicos.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class ApiservicosApplication {

//	@Bean
//	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository, @Autowired ServicoRepository servicoRepository){
//		return args -> {
//			Cliente cliente = Cliente.builder()
//					.cpf("00000000000")
//					.nome("Fulano")
//					.dataCadastro(LocalDate.now())
//					.build();
//			clienteRepository.save(cliente);
//
//			Servico servico = Servico.builder()
//					.cliente(cliente)
//					.descricao("Manutenção de micro")
//					.valor(BigDecimal.valueOf(25.00))
//					.build();
//			servicoRepository.save(servico);
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(ApiservicosApplication.class, args);
	}

}
