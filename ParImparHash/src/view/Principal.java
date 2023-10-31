package view;

import controller.ControllerParImparHash;

public class Principal {

	public static void main(String[] args) throws Exception {

		ControllerParImparHash c = new ControllerParImparHash();

		int a = (int) ((Math.random() * 100) + 1);
		int[] vet = new int[a];

		for (int i = 0; i < vet.length; i++) {
			a = (int) (Math.random() * 1001);
			vet[i] = a;

			try {
				c.add(vet[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		c.conta();
	}

}
