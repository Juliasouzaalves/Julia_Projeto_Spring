package com.senai3.julia;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senai3.julia.domain.Cliente;
import com.senai3.julia.domain.Estado;
import com.senai3.julia.domain.column.TipoCliente;
import com.senai3.julia.repositories.ClienteRepository;
import com.senai3.julia.repositories.EstadoRepository;
@SpringBootApplication
public class JuliaApplication implements CommandLineRunner { 

	@Autowired
    private EstadoRepository estadoRepository; 
	@Autowired 
	private ClienteRepository clienteRepository; 
	public static void main(String[] args) {
		SpringApplication.run(JuliaApplication.class, args); 
	} 
	@Override
	public void run(String... args ) throws Exception {
		Estado est1 = new Estado(null ,"Minas Gerais", null); 
		Estado est2 = new Estado(null ,"São Paulo", null);
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
	
	Cliente cli = new Cliente(null, "Júlia Alves", "23681239864", "julia@gmail.com" , TipoCliente.PESSOAFISICA );
	cli.getTelefones().addAll(Arrays.asList("923729372", "902342618" ));
	clienteRepository.saveAll(Arrays.asList(cli));
	}
	}


