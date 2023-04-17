package services;

import java.util.List;

import dao.AuteurDao;
import dao.AuteurDaoImpl;
import domains.Auteur;

public class AuteurServiceImp implements AuteurService {

	private static AuteurDao dao = new AuteurDaoImpl();

	@Override
	public void createAuteur(Auteur a) {
		Auteur ajoutAuteur = dao.create(a);
		if (ajoutAuteur != null)
			System.out.println("Auteur : " + ajoutAuteur.getMatricule() + " est ajouté!");}

	@Override
	public List<Auteur> getAllAuteurs() {
		return dao.findAll();}

	@Override
	public Auteur getAuteurByMatricule(int matricule) {
		return dao.getAuteurByMatricule(matricule);}

	@Override
	public void updateAuteur(Auteur auteur) {
		Auteur a = dao.update(auteur);
		if (a != null)
			System.out.println("L'auteur " + a.getMatricule() + " est mis à jour!");}

	@Override
	public void deleteAuteur(int matricule) {
		Auteur a = dao.delete(matricule);
		if (a != null)
			System.out.println("L'auteur " + a.getMatricule() + " est supprimé!");}

}
