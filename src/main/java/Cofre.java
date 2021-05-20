public class Cofre {

    public Cofre(int volumeMaximo) {
    }

    public int getVolume() {
        return -1;
    }

    public int getVolumeMaximo() {
        return -1;
    }

    public int getVolumeRestante() {
        return -1;
    }

    public boolean add(Item item) {
        return false;
    }

    public boolean add(Moeda moeda) {
        return false;
    }

    public String obterItens() {
        return "vazio";
    }

    private String getItens() {
        return null;
    }

    public double obterMoedas() {
        return -1;
    }
    
    public boolean taInteiro() {
        return false;
    }

    public boolean quebrar() {

        return false;
    }
}
