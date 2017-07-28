package com.monapp.service;

import java.util.List;

import com.monapp.Dao.IntSuperheroDao;
import com.monapp.domaine.Superherobis;

public interface IntSuperheroService {

	public void setDao(IntSuperheroDao dao);
	
	List<Superherobis> listSuperHero();

	void inscrireHero(Superherobis sh);

}