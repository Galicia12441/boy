package com.alan.galicia.service;

import java.util.List;

import com.alan.galicia.model.Producto;

public interface IntProductoService {
	
    public List<Producto> obtenerTodos();
    public void guardar(Producto producto);
    public void eliminar(Integer idproducto);
    public Producto buscarPorId(Integer idProducto);
    
    
}
