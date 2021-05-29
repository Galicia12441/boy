package com.alan.galicia.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alan.galicia.model.Producto;
import com.alan.galicia.service.IntProductoService;


@Controller
public class ProductosController {
	
	@Autowired
	private IntProductoService productosService;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List <Producto> lista = productosService.obtenerTodos();
		for(Producto p : lista)
			System.out.println(p.getNombre());
		model.addAttribute("productos",lista);
		return "listaProductos";	
		}
}