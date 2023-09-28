package org.example;

import java.util.HashMap;
import java.util.Map;

public class SetorFactory {

    private static Map<String, Setor> setores = new HashMap<>();

    public static Setor getSetores(String nome) {
        Setor setor = setores.get(nome);
        if (setor == null) {
            setor = new Setor(nome);
            setores.put(nome, setor);
        }
        return setor;
    }

    public static int getTotalSetores() {
        return setores.size();
    }
}
