package com.fatec.sigvs;

import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Produto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class LoadDatabase {
    Logger logger = LogManager.getLogger(this.getClass());

    @Bean
    CommandLineRunner initDatabase(IProdutoRepository repository) {
        return args-> {
            Produto produto1 = new Produto("Eletrobomba 110V para Maquina de Lavar e Lava Louças", "maquina de lavar", 51.66, 12);
            Produto produto2 = new Produto("Tirante Original Brastemp E Consul de 7 A 12 Kg 11cm", "lavar louça", 3.90, 20);
            Produto produto3 = new Produto("Termoatuador Lavadora Colormaq Electrolux GE", "maquina de lavar", 29.70, 40);
            repository.saveAll(Arrays.asList(produto1, produto2, produto3));
            logger.info(">>>>> loaddatabase -> cadastro de 3 produtos realizado.");
        };
    }
}