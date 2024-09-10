public class MachineACafe {
	public enum State{
		IDLE{
			@Override
			public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
				machineACafe.afficherPasAssez(toucheBoisson);
			}
		}, COLLECTE{

		}, PASASSEZ{
			@Override
			public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
				machineACafe.montantEnCours += piece.getValeur();
				machineACafe.afficherMontant();
				if (machineACafe.boisson.getPrix() > machineACafe.montantEnCours) {
					machineACafe.afficherPasAssez(machineACafe.boisson);
				} else {
					machineACafe.montantEnCours -= machineACafe.boisson.getPrix();
					machineACafe.afficherBoisson(machineACafe.boisson);
					machineACafe.boisson = null;
					machineACafe.afficherMontant();
					if (machineACafe.montantEnCours == 0)
						machineACafe.setState(State.IDLE);
					else
						machineACafe.setState(State.COLLECTE);
				}
			}

			@Override
			public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}
		};
		public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
			machineACafe.montantEnCours += piece.getValeur();
			machineACafe.afficherMontant();
			machineACafe.setState(State.COLLECTE);
		}

		public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
			if (toucheBoisson.getPrix() > machineACafe.montantEnCours) {
				machineACafe.boisson = toucheBoisson;
				machineACafe.afficherPasAssez(machineACafe.boisson);
				machineACafe.boisson = toucheBoisson;
				machineACafe.setState(State.PASASSEZ);
				return;
			}
			machineACafe.montantEnCours -= toucheBoisson.getPrix();
			machineACafe.afficherBoisson(toucheBoisson);
			machineACafe.afficherMontant();
			if (machineACafe.montantEnCours == 0)
				machineACafe.setState(State.IDLE);
			else
				machineACafe.setState(State.COLLECTE);
		}

		public void rendreMonnaie(MachineACafe machineACafe) {
			machineACafe.afficherRetour();
			machineACafe.montantEnCours = 0;
			machineACafe.boisson = null;
			machineACafe.setState(State.IDLE);
		}
	}

	private int montantEnCours;
	private State etatCourant;
	private ToucheBoisson boisson;

	public MachineACafe() {
		this.montantEnCours = 0;
		this.boisson=null;
		setState(State.IDLE);
	}

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}

	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}

	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
	}

	public void setState(State state){
		this.etatCourant = state;
	}

	public void entrerMonnaie(Piece piece){
		etatCourant.entrerMonnaie(this, piece);
	}

	public void selectionnerBoisson(ToucheBoisson toucheBoisson){
		etatCourant.selectionnerBoisson(this, toucheBoisson);
	}

	public void rendreMonnaie(){
		etatCourant.rendreMonnaie(this);
	}

}
