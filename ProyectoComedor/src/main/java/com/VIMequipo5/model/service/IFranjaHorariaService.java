/**
 * Interfaz FranjaHoraria service
 */
package com.VIMequipo5.model.service;

import java.util.List;

import com.VIMequipo5.model.dto.FranjaHoraria;

/**
 * @author viach
 *
 */
public interface IFranjaHorariaService {
	
	//Metodos del CRUD
	public List<FranjaHoraria> listarFranjaHoraria();	//Listar All 
	
	public FranjaHoraria guardarFranjaHoraria(FranjaHoraria franjaHoraria);	//Guarda una franjaHoraria CREATE
	
	public FranjaHoraria franjaHorariaXID(int idFranjaHoraria);	//Leer datos de una franjaHoraria READ
	
	public FranjaHoraria actualizarFranjaHoraria(FranjaHoraria franjaHoraria);	//Actualiza datos de la franjaHoraria UPDATE
	
	public void eliminarFranjaHoraria(int idFranjaHoraria);	//Elimina la franjaHoraria DELETE

}
