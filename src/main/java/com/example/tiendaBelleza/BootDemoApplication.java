package com.example.tiendaBelleza;

import com.example.tiendaBelleza.entity.Bodega;
import com.example.tiendaBelleza.entity.Producto;
import com.example.tiendaBelleza.repository.BodegaRepository;
import com.example.tiendaBelleza.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	ProductoRepository productoRepository;

	@Autowired
	BodegaRepository bodegaRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){

		for (int i = 0; i < 3; i++) {
			String nombreBodega = "bodega "+(i+1);
			Bodega bodega = new Bodega(nombreBodega, "medellin");
			bodegaRepository.save(bodega);
			String nombreProducto = "producto "+(i+1);
			Producto producto= new Producto(nombreProducto);
			producto.setBodega(bodega);
			productoRepository.save(producto);
		}

	}
}
