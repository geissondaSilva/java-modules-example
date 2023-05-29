package br.geisson.dtasource;

import br.geisson.dtasource.metadata.Table;

public class DataManagerImp implements DataManager {
    @Override
    public void create(Table table) {
        System.out.printf("Tabela " + table.getName() + " criada com sucesso!");
    }
}
