package app;

import dao.LogVendaDAO;

public class Main {
    public static void main(String[] args) {
        LogVendaDAO logDAO = new LogVendaDAO();
        logDAO.salvarLog("Venda cadastrada para cliente: Lucas");

        System.out.println("Log de venda enviado para o MongoDB com sucesso!");
    }
}