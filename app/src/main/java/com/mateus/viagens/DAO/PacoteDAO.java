package com.mateus.viagens.DAO;

import com.mateus.viagens.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PacoteDAO {
    public List<Pacote>lista(){
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
            new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99)),
            new Pacote("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.99)),
            new Pacote("Recife", "recife_pe", 4, new BigDecimal(754.99)),
            new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.99)),
            new Pacote("Salvador", "salvador_ba", 5, new BigDecimal(899.99)),
            new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(230.99))));

    return pacotes;
    }
}
