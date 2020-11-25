package junit;

public class Pre {
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String ex1_0(int n){

		return (n > 0) ? "その値は正です" : "その値は０か負です";

	}

}
