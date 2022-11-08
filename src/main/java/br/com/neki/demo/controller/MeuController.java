package br.com.neki.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class MeuController {

	@Value("${spring.profiles.active:}")
	private String activeProfile;
	
	@Value("${minha_propriedade_teste}")
	private String minhaPropriedade;
	
	@Value("${outra_propriedade_teste}")
	private String outraPropriedade;
	
	@Value("${minha_propridade_super_legal}")
	private String minhaPropriedadeSuperLegal;
	
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        String result="Hello "+name+"! activeProfile="+activeProfile+" minhaPropriedade="+minhaPropriedade+ " outraPropriedade="+outraPropriedade+" minhaPropriedadeSuperLegal="+minhaPropriedadeSuperLegal;
        return result;
    }
}