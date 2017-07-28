package com.monapp.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.monapp.domaine.Superherobis;
import com.monapp.service.IntSuperheroService;

@Controller
@Scope("session")
public class SuperheroBisBean {
	
	private Superherobis sh;
	private List<Superherobis> maListSH =new ArrayList<Superherobis>();
	@Autowired
	private IntSuperheroService SHS;
	
	public void setSHS(IntSuperheroService sHS) {
		SHS = sHS;
	}

	public Superherobis getSuperherobis() {
		return sh;
	}

	public void setSuperherobis(Superherobis superheroBis) {
		this.sh = superheroBis;
	}


	public List<Superherobis> getMaListSH() {
		return maListSH;
	}

	public void setMaListSH(List<Superherobis> maListSH) {
		this.maListSH = maListSH;
	}

	@PostConstruct
    public void initsh() {
        sh = new Superherobis();
    }

	public void collectSuperhero() {
		System.out.println(sh);
		Superherobis sh1 = new Superherobis(sh);
		SHS.inscrireHero(sh1);
	}
	
	
	public void listHero(){
		maListSH =SHS.listSuperHero();
		System.out.println(maListSH);
	}
	
}
