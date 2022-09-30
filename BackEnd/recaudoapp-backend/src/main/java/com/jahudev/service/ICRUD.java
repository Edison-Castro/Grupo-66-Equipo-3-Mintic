package com.jahudev.service;

import java.util.List;

public interface ICRUD<T, ID> {

	T registrar (T r) throws Exception;
	T modificar (T r) throws Exception;
	List<T> listar () throws Exception;
	T listarPorId (ID id) throws Exception;
	void eliminar (ID id) throws Exception;

}
