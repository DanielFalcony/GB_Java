package HW_6;

public class Notebook {
    private String model;
    private String CPU;
    private int RAM;
    private int SSDVolume;
    private double displaySize;
    private String pcName;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSDVolume() {
        return SSDVolume;
    }

    public void setSSDVolume(int SSDVolume) {
        this.SSDVolume = SSDVolume;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    private boolean ifMoreOrEqualSSDVolume(Notebook notebook){
        return this.SSDVolume >= notebook.SSDVolume;
    }

    private boolean ifMoreOrEqualRAM(Notebook notebook){
        return this.RAM >= notebook.RAM;
    }

    private boolean ifMoreOrEqualDisplaySize(Notebook notebook){
        return this.displaySize >= notebook.displaySize;
    }

    public boolean ifMoreOrEqualNotebook(Notebook notebook){
        return this.ifMoreOrEqualRAM(notebook)
                && this.ifMoreOrEqualSSDVolume(notebook)
                && this.ifMoreOrEqualDisplaySize(notebook);
    }

    public Notebook(String model, String CPU, int RAM, int SSDVolume, double displaySize){
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSDVolume = SSDVolume;
        this.displaySize = displaySize;
        this.pcName = this.toString();
    }

//    @Override
    public boolean equals(Object obj) {
        Notebook notebook = (Notebook) obj;
        return this.SSDVolume == notebook.SSDVolume
                && this.RAM == notebook.RAM && this.displaySize == notebook.displaySize;
    }

    @Override
    public int hashCode() {
        return this.pcName.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Модель: %s\n" +
                "Процессор: %s\n" +
                "ОЗУ: %d ГБ\n" +
                "Память: %d ГБ\n" +
                "Диагональ: %.1f\t", this.model, this.CPU, this.RAM, this.SSDVolume, this.displaySize);
    }
}
