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
		if (0 < n) {
			return "その値は正です";
		} else {
			return "その値は０か負です";
		}
	}

}
