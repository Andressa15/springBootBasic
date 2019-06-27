package com.example.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Services.MapServices;
import com.example.demo.models.ClasseModelo;

@Controller
public class MapController {

	@Autowired
	MapServices postServices;


	@RequestMapping
	@ResponseBody

	public Map <Integer, ClasseModelo> exibirNomes(){
		return postServices.mostrarLista();
	}
	@RequestMapping("/add")
	@ResponseBody
	public  Map <Integer, ClasseModelo>  adicionar(){
		postServices.adicionar();
		return postServices.mostrarLista();
	}

	@RequestMapping("/postagem/{id}")
	@ResponseBody
	public ClasseModelo buscarPostagens(@PathVariable int id){
		return postServices.buscarPostagem(id);
	}

	@RequestMapping("/delete/{id}")
	@ResponseBody
	public ClasseModelo deletar(@PathVariable int id) {
		return postServices.delete(id);
	}
}
