package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
	private long idRegPonto;
	private Funcionario func;
	private LocalDate dataRegistro;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;
	
	public long getIdRegPonto() {
		return idRegPonto;
	}
	public void setIdRegPonto(long idRegPonto) {
		this.idRegPonto = idRegPonto;
	}
	public Funcionario getFunc() {
		return func;
	}
	public void setFunc(Funcionario func) {
		this.func = func;
	}
	public LocalDate getDataRegristo() {
		return dataRegistro;
	}
	public void setDataRegristo(LocalDate dataRegristo) {
		this.dataRegistro = dataRegristo;
	}
	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}
	public void apresentarRegristroPonto() {
		String dRegistro = dataRegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String hEntrada = horaEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SSS"));
		
		System.out.println("==================================================");
		System.out.println("Funcionario " + func.getNome() +
				"\nData: " + dRegistro +
				"\nHorario de entrada: " + hEntrada);
		if(horaSaida != null) {
			String hSaida = horaSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SSS"));
			System.out.println("Horario de saida: " + hSaida);
		}
		System.out.println("==================================================");
		System.out.println();
	}
}
