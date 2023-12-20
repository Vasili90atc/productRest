package gr.atc.training.productRest;

import java.util.List;


public class ProductListWrapper {
	public List<Product> products;
	@SuppressWarnings("unused")
    private int total;
    @SuppressWarnings("unused")
	private int skip;
    @SuppressWarnings("unused")
    private int limit;



	public List<Product> getProducts() {
        return products;
    }
}
