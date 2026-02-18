package controller;

import Repo.TitularRepository;
import service.TitularService;

public class TitularController {
    public static void main(String[] args) {
        TitularRepository tr = new TitularRepository();
        TitularService ts = new TitularService(tr);


    }
}
