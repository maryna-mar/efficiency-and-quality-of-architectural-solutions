package lab5_template;

abstract class TemplateProcess {

    abstract void getData();
    abstract void validateData();
    abstract void saveData();
    abstract void sendReport();

    final void updateObject() {
        getData();
        validateData();
        saveData();
        sendReport();
    }
}
