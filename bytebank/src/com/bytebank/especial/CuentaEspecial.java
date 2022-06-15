package com.bytebank.especial;

import com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	public CuentaEspecial(int agencia, int numero) {
		super(agencia, numero);		
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;		
	}
}