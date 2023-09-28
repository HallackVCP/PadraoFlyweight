import org.example.Loja;
import org.example.SetorFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {



    @Test
    void deveRetornarTotalSetores(){
        Loja loja = new Loja();
        loja.cadastrarProduto("Computador", 500.0, "Tecnologia");
        loja.cadastrarProduto("Tablet", 300.0, "Tecnologia");
        loja.cadastrarProduto("Geladeira", 500.0, "Eletrodomestico");
        loja.cadastrarProduto("Detergente", 500.0, "Limpeza");

        assertEquals(3, SetorFactory.getTotalSetores());
    }

    @Test
    void deveRetornarProdutos(){
        Loja loja = new Loja();
        loja.cadastrarProduto("Computador", 500.0, "Tecnologia");
        loja.cadastrarProduto("Tablet", 300.0, "Tecnologia");
        loja.cadastrarProduto("Geladeira", 550.0, "Eletrodomestico");
        loja.cadastrarProduto("Detergente", 5.5, "Limpeza");

        List<String> saida = Arrays.asList(
                "Produto{nome='Computador', setor='Tecnologia', custo='500.0'}",
                "Produto{nome='Tablet', setor='Tecnologia', custo='300.0'}",
                "Produto{nome='Geladeira', setor='Eletrodomestico', custo='550.0'}",
                "Produto{nome='Detergente', setor='Limpeza', custo='5.5'}");
        assertEquals(saida, loja.obterProdutos());

    }
}

