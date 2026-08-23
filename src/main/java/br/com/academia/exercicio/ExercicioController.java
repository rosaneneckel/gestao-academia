package br.com.academia.exercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {
    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "API de Exercícios da Rosane";
    }


}
