package no.hvl.dat102.balansering;

public class TabellStabel<T> {
	private T[] tab;
	private int antall;

	@SuppressWarnings("unchecked")
	public TabellStabel() {
		tab = (T[]) (new Object[100]);
		antall = 0;
	}

	public void push(T element) {
		if (antall >= tab.length) {
			utvidTabell();
		}

		tab[antall] = element;
		antall++;
	}

	public T pop() {
		return tab[--antall];
	}
	
	public boolean isEmpty() {
		return antall == 0;
	}
	
	public int antall() {
		return antall;
	}

	public boolean inneholder(T element) {
		boolean finnes = false;
		for (int i = 0; i < antall && !finnes; i++) {
			if (tab[i].equals(element)) {
				finnes = true;
			}
		}
		return finnes;
	}

	@SuppressWarnings("unchecked")
	private void utvidTabell() {
		T[] mid = (T[]) (new Object[2 * tab.length]);

		for (int i = 0; i < tab.length; i++) {
			mid[i] = tab[i];
		}

		tab = mid;
	}

}
