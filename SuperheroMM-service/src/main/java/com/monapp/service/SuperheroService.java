package com.monapp.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.monapp.Dao.IntSuperheroDao;
import com.monapp.domaine.Superherobis;


@Service
@Scope("session")
public class SuperheroService implements IntSuperheroService{

	
	@Autowired
	private IntSuperheroDao Dao;
	
	public void setDao(IntSuperheroDao dao) {
		Dao = dao;
	}

/* (non-Javadoc)
 * @see service.IntSuperheroService#listSuperHero()
 */
public List<Superherobis> listSuperHero(){
	return Dao.findAll();	
}


/* (non-Javadoc)
 * @see service.IntSuperheroService#inscrireHero(domaine.Superherobis)
 */
public void inscrireHero(Superherobis sh){
	Dao.save(sh);
}
	
}
