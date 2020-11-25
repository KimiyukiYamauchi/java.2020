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

		if (n > 0) {
			return "その値は正です";
		} else {
			return "その値は０か負です";
		}



	}

}
