package gr.atc.training.productRest;


public class App 
{
    public static void main( String[] args )
    {
    	APIHandler h = new APIHandler();
    	h.fetchAndParseProducts();
        h.print_products();
    }
}
