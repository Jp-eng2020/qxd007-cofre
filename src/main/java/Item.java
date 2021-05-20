public class Item {

    private int volume;
    private String descricao;

    public Item(String descricao, int volume) {
        this.volume = volume;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
