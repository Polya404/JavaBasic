package lesson12.additionally.task3;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Expert");
    }
}
