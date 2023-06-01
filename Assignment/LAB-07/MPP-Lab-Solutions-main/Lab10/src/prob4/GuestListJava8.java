package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GuestListJava8 {

	public static void main(String[] args) {
		final boolean yes = true;
		final boolean no = false;
		GuestListJava8 gl = new GuestListJava8();
		List<Guest> invited = Arrays.asList(new Guest("Joe Stevens", Status.COMMON, Gender.M, 5, yes),
				new Guest("Susan Richards", Status.GOLD, Gender.F, 10, no),
				new Guest("Toni Smith", Status.COMMON, Gender.F, 4, yes),
				new Guest("Anthony Hawkins", Status.ILLEGAL, Gender.M, 0, yes),
				new Guest("Tony Thomas", Status.SILVER, Gender.M, 8, no),
				new Guest("Antoinette Cerisier", Status.SILVER, Gender.F, 7, yes),
				new Guest("Ricardo Salhuega", Status.COMMON, Gender.M, 2, yes));

		System.out.println("Normal Try-Catch Contruct Function\n");
		try {
			gl.printListOfExpectedFemaleGuests(invited);
		} catch (IllegalGuestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nUsing Predicate Exception\n");
		// By Using the PredicateWithException
		gl.printListOfExpectedFemaleGuestsWithInterface(invited);

	}

	private boolean checkLegal(Guest g) throws IllegalGuestException {
		boolean isIllegal = (g.getStatus() == Status.ILLEGAL);
		if (isIllegal)
			throw new IllegalGuestException(
					String.format("Illegal guest %s has attempted entry to the event", g.getName()));
		else
			return true;
	}

	public void printListOfExpectedFemaleGuests(List<Guest> invited) throws IllegalGuestException {
		// implement
		String namesOfExpected = invited.stream().filter(m -> m.getGender() == Gender.F && m.isPlanningToCome())
				.filter(m -> {
					try {
						return checkLegal(m);
					} catch (IllegalGuestException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					return false;
				})

				.map(e -> e.getName()).collect(Collectors.joining(","));

		System.out.println(namesOfExpected.toString());

	}

	public void printListOfExpectedFemaleGuestsWithInterface(List<Guest> invited) {
		// implement
		String namesOfExpected = invited.stream().filter(m -> m.getGender() == Gender.F && m.isPlanningToCome())
				.filter(PredicateWithException.unchecked(m -> checkLegal(m))).map(e -> e.getName())
				.collect(Collectors.joining(","));

		System.out.println(namesOfExpected.toString());

	}

	class IllegalGuestException extends Exception {
		private static final long serialVersionUID = 1L;

		IllegalGuestException() {
			super("An illegal guest has attempted entry.");
		}

		IllegalGuestException(String msg) {
			super(msg);
		}

		IllegalGuestException(Throwable t) {
			super(t);
		}
	}
}
