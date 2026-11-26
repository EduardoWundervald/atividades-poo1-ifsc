package aula2026_11_26.composicao;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Comodo> comodos = new ArrayList<>();

    Casa(){
        comodos.add(new Comodo ("Sala"));
        comodos.add(new Comodo ("Cozinha"));
        comodos.add(new Comodo ("Quarto"));
        comodos.add(new Comodo ("Banheiro"));
    }

    void listarComodos(){
        System.out.println("Comodos da casa: ");
        for (Comodo comodo : comodos){
            System.out.println(comodo.getNome());
        }
    }
}
