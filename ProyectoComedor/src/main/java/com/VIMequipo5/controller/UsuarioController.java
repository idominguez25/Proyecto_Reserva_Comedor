/**
 * Controller para Usuario
 */
package com.VIMequipo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VIMequipo5.model.dto.Usuario;
import com.VIMequipo5.model.service.UsuarioServiceImpl;

/**
 * @author viach
 *
 */

@RestController
@RequestMapping("/api")
public class UsuarioController {

	//Inyeccion de dependencias
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;

	//End-points
	@GetMapping("/usuario")
	public List<Usuario> listarUsuario(){
		return usuarioServiceImpl.listarUsuario();
	}
	
	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario usuarioXID(@PathVariable(name="idUsuario") int idUsuario) {
		Usuario usuarioBuscado = new Usuario();	
		usuarioBuscado = usuarioServiceImpl.usuarioXID(idUsuario);
		System.out.println("Usuario: " + usuarioBuscado);
		return usuarioBuscado;
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario actualizarUsuario(@PathVariable(name="idUsuario")int idUsuario,@RequestBody Usuario usuario) {
		//Creamos dos usuarios
		Usuario usuarioSeleccionado = new Usuario();
		Usuario usuarioActualizado = new Usuario();
		
		//El usuarioSeleccionado copia los datos del usuario que esta en la BD, buscando por el ID
		usuarioSeleccionado = usuarioServiceImpl.usuarioXID(idUsuario);
		
		//Actualizamos valores
		usuarioSeleccionado.setNombreUsuario(usuario.getNombreUsuario());
		usuarioSeleccionado.setContraseña(usuario.getContraseña());
		usuarioSeleccionado.setNombre(usuario.getNombre());
		usuarioSeleccionado.setApellido(usuario.getApellido());
		usuarioSeleccionado.setFechaNacimiento(usuario.getFechaNacimiento());
		usuarioSeleccionado.setDNI(usuario.getDNI());
		usuarioSeleccionado.setTelefono(usuario.getTelefono());
		usuarioSeleccionado.setRol(usuario.getRol());
		
		//...
		usuarioActualizado = usuarioServiceImpl.actualizarUsuario(usuarioSeleccionado);
		
		System.out.println("Usuario actualizado: " + usuarioActualizado);
		return usuarioActualizado;
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminarUsuario(@PathVariable(name="idUsuario")int idUsuario) {
		usuarioServiceImpl.eliminarUsuario(idUsuario);
	}
}
