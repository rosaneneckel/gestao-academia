package br.com.academia.exercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioController {
    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "API de Exercícios da Rosane";
    }

    @GetMapping("/exemplo")
    public ExercicioDTO getExercicio(){
        return new ExercicioDTO(1, "Sulpino", 3, 12);
    }

    @GetMapping("/lista-exercicios")
    public List<ExercicioDTO> getListaExercicios(){
        List<ExercicioDTO> list = new ArrayList<>();
        list.add(new ExercicioDTO(1, "Sulpino Reto com Barra", 4, 10));
        list.add(new ExercicioDTO(2, "Agachamento Livre", 4, 12));
        list.add(new ExercicioDTO(3, "Puxada Frontal na Polia", 3, 12));
        list.add(new ExercicioDTO(4, "Desenvolvimento com Alteres", 3, 10));

        return list;
    }


}
