package lesson12.additionally.task3;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        super.editDocument();
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
