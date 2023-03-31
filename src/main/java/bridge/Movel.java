package bridge;

public abstract class Movel {
    protected final Material material;
    protected final double precoBase;

    public Movel(Material material, double precoBase) {
        this.material = material;
        this.precoBase = precoBase;
    }

    public double obterPreco() {
        return this.precoBase + this.material.getPrecoAdicional();
    }
}
