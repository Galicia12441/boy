package com.alan.galicia.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alan.galicia.model.Producto;
@Service
public class ProductosServicelmp implements IntProductoService {
	
private List<Producto> lista;
	
	public ProductosServicelmp() {
		lista = new LinkedList<Producto>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		
			// ********** Product 1
			
			Producto p1=new Producto();
			p1.setId(1);
			p1.setNombre("Pala");
			p1.setDescripcion("Poder de la pala");
			p1.setExistencias(5);
			p1.setPrecio(500.0);
			//p1.setFechaProduccion(LocalDate.now());
			p1.setFechaProduccion(LocalDate.parse("04-01-2021", formato));
			p1.setImagen("Pala-redonda-ancho-hoja-8-1.jpg");
			
		    lista.add(p1);
		    
		    // ********** Product 2
		    
		    Producto p2=new Producto();
			p2.setId(2);
			p2.setNombre("Carretilla");
			p2.setDescripcion("Carretilla TRUPER");
			p2.setExistencias(8);
			p2.setPrecio(750.0);
			//p2.setFechaProduccion(LocalDate.now());
			p2.setFechaProduccion(LocalDate.parse("04-01-2021", formato));
			p2.setImagen("35287933896_c45ae91f58_grande.jpg");
			
		    lista.add(p2);
		    
		 // ********** Product 3
		    
		    Producto p3=new Producto();
			p3.setId(3);
			p3.setNombre("Desarmador");
			p3.setDescripcion("Desarmador ");
			p3.setExistencias(4);
			p3.setPrecio(100.0);
			//p3.setFechaProduccion(LocalDate.now());
			p3.setFechaProduccion(LocalDate.parse("05-01-2021", formato));
			p3.setImagen("descargar.jpg");
			
		    lista.add(p3);
		    
		 // ********** Product 4
		    
		    Producto p4=new Producto();
			p4.setId(4);
			p4.setNombre("Matillo");
			p4.setDescripcion("Martillo ");
			p4.setExistencias(10);
			p4.setPrecio(250.0);
			//p4.setFechaProduccion(LocalDate.now());
			p4.setFechaProduccion(LocalDate.parse("05-01-2021", formato));
			p4.setImagen("54-194_3.jpg");
			
		    lista.add(p4);
		    
		
		}
		
		
	    
	
	
	@Override
	public List<Producto> obtenerTodos() {
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		lista.add(producto);
		
	}

	@Override
	public void eliminar(Integer idProducto) {
		lista.remove(buscarPorId(idProducto));
		
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		for(Producto p: lista) {
			if(p.getId() == idProducto ) {
				return p;
			}
		}
		return null;
		
	
	}

}
