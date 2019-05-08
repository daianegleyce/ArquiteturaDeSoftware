package br.usjt.previsoes.controller;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.service.PrevisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PrevisaoController {
    @Autowired
    private PrevisaoService previsaoService;

    @GetMapping("/previsoes")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView ("lista_previsoes");
        List<Previsao> previsoes = previsaoService.listar();
        mv.addObject("previsoes", previsoes);
        return mv;
    }

}
