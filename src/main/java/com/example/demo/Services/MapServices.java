package com.example.demo.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.ClasseModelo;
@Service
public class MapServices {

	private Map <Integer, ClasseModelo> listaPostagem = new HashMap<Integer, ClasseModelo>();
	public Object adicionarPostagem;

	public void adicionar() {
		listaPostagem.put(1,  new ClasseModelo("Google", "ola mundo"));
		listaPostagem.put(2,  new ClasseModelo("Explorer", "ola mundo"));
		listaPostagem.put(3, new ClasseModelo("FireFox", "ola mundo"));
	}

	public Map <Integer, ClasseModelo> mostrarLista(){
//for que roda em todo o HashMap e para cada item ele adiciona um texto com tag <p>
		return this.listaPostagem;
	}


	public ClasseModelo buscarPostagem(@ PathVariable int id){
		return  listaPostagem.get(id);
	}

	public ClasseModelo delete(@PathVariable int id) {
		return listaPostagem.remove(id);

	}
}


