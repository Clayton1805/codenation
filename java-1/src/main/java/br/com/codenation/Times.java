package br.com.codenation;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;

public class Times {
	private List<Time> times;
	
	public Times() {
		this.times = new ArrayList<>();
	}
	
	public List<Time> getTimes() {
		return times;
	}

	public void addTime(Time timeParametro) {
		for (Time time : this.times) {
			if (time.getId().equals(timeParametro.getId())) {
				throw new IdentificadorUtilizadoException();
			}
		}
		this.times.add(timeParametro);
	}
}
