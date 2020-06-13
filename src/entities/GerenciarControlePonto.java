package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setIdFunc(1);
		gerente.setNome("Roberto de Almeida");
		gerente.setDocumento("1234567");
		gerente.setEmail("roberto@gmail.com");
		gerente.setLogin("roberto.almeida");
		gerente.setSenha("123456");
		
		Secretaria secretaria = new Secretaria();
		secretaria.setIdFunc(2);
		secretaria.setNome("Mariana Silva");
		secretaria.setDocumento("345678");
		secretaria.setEmail("Mariana@gmail.com");
		secretaria.setRamal("33");
		secretaria.setTelefone("3362-0000");
		
		Operador operador = new Operador();
		operador.setIdFunc(3);
		operador.setNome("Gustavo Souza");
		operador.setDocumento("987654");
		operador.setEmail("gustavo@gmail.com");
		operador.setValorHora(10.0);
		
		RegistroPonto regGerente = new RegistroPonto();
		regGerente.setDataRegristo(LocalDate.now());
		regGerente.setFunc(gerente);
		regGerente.setIdRegPonto(11111);
		regGerente.setHoraEntrada(LocalDateTime.now());
		regGerente.apresentarRegristroPonto();
		
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		RegistroPonto regOp = new RegistroPonto();
		regOp.setDataRegristo(LocalDate.now());
		regOp.setFunc(operador);
		regOp.setIdRegPonto(22222);
		regOp.setHoraEntrada(LocalDateTime.now());
		regOp.apresentarRegristroPonto();
		
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		RegistroPonto regSec = new RegistroPonto();
		regSec.setDataRegristo(LocalDate.now());
		regSec.setFunc(secretaria);
		regSec.setIdRegPonto(33333);
		regSec.setHoraEntrada(LocalDateTime.now());
		regSec.apresentarRegristroPonto();
		
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		regGerente.setHoraSaida(LocalDateTime.now());
		regGerente.apresentarRegristroPonto();
		
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		regOp.setHoraSaida(LocalDateTime.now());
		regOp.apresentarRegristroPonto();
		
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		regSec.setHoraSaida(LocalDateTime.now());
		regSec.apresentarRegristroPonto();
	}

}
