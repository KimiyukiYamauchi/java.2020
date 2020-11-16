package practice;

import java.util.HashMap;
import java.util.Map;

public class CoinCase {

	private HashMap<Integer, Integer> coins
				= new HashMap<Integer, Integer>();

	public CoinCase() {

		coins.put(1, 0);		// 1円硬貨、0枚
		coins.put(5, 0);		// 5円硬貨、0枚
		coins.put(10, 0);	// 10円硬貨、0枚
		coins.put(50, 0);	// 50円硬貨、0枚
		coins.put(100, 0);	// 100円硬貨、0枚
		coins.put(500, 0);	// 500円硬貨、0枚
	}

	public void AddCoins(int syurui, int maisu) {
		if (coins.containsKey(syurui)) {
			coins.put(syurui, coins.get(syurui) + maisu);
		}
	}

	public int GetCount(int syurui) {
		if (coins.containsKey(syurui)) {
			return coins.get(syurui);
		}else {
			return -1;
		}
	}

	public int GetAmount() {
		int sum = 0;
		/*		for (Iterator<Map.Entry<Integer, Integer>> iterator = coins.entrySet().iterator();
						iterator.hasNext(); ) {
					Map.Entry<Integer, Integer> entry = iterator.next();
					sum += entry.getKey() * entry.getValue();
				}
		*/
		for (Map.Entry<Integer, Integer> entry : coins.entrySet()) {
			sum += entry.getKey() * entry.getValue();
        }
		return sum;
	}

}
