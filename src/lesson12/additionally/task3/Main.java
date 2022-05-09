package lesson12.additionally.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Access access = new Access();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете версию Pro, Exp or Base");
        String version = scanner.nextLine();
        if (version.equals("Pro")) {
            System.out.println("Чтоб открыть версию Pro введите ключ");
            String key = scanner.nextLine();
            if (access.verificationPro(key)) {
                ProDocumentWorker documentWorkerPro = new ProDocumentWorker();
                DocumentWorker documentWorker = documentWorkerPro;
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
            } else {
                DocumentWorker documentWorkerBase = new DocumentWorker();
            }
        } else if (version.equals("Exp")) {

            System.out.println("Чтоб открыть версию Exp введите ключ");
            String key1 = scanner.nextLine();
            if (access.verificationExp(key1)) {
                ExpertDocumentWorker documentWorkerExp = new ExpertDocumentWorker();
                DocumentWorker documentWorker = documentWorkerExp;
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
            } else {
                DocumentWorker documentWorkerBase = new DocumentWorker();
            }
        } else {
            DocumentWorker documentWorkerBase = new DocumentWorker();
            documentWorkerBase.openDocument();
            documentWorkerBase.editDocument();
            documentWorkerBase.saveDocument();
        }
    }
}
