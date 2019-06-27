package com.example.demo.models;

public class ClasseModelo {


	private String usuario;
	private String postagem;



	public ClasseModelo() {
		super();
	}



	public ClasseModelo(String usuario, String postagem) {
		super();
		this.usuario = usuario;
		this.postagem = postagem;


	}



	public String getPostagem() {
		return postagem;
	}



	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}



	public String getUsuario() {
		return usuario;
	}

	public String ToString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Usuario; " + this.usuario);
		modelo.append("Postagem; " + this.postagem);
		modelo.append("\n");

		return modelo.toString();

	}

}