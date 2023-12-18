package gr.atc.training.productRestAPI;


public class App 
{
    public static void main( String[] args )
    {
    	APIHandler h = new APIHandler();
    	h.fetch_and_parse_products();
        h.print_products();
    }
}
