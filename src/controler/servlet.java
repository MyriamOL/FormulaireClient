package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Client;
import bean.Commande;
import dao.ClientDao;
import dao.CommandeDao;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public servlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresseLivraison = request.getParameter("adresseLivraison");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");

		String date = request.getParameter("date");
		int montant = 0;
		try {
			montant = Integer.parseInt(request.getParameter("montant"));
		} catch (NumberFormatException e) {
			System.out.println(e);
			montant = 0;
		}

		String modepaiement = request.getParameter("modepaiement");
		String statutPaiement = request.getParameter("statutPaiement");
		String modeLivraison = request.getParameter("modeLivraison");
		String statutLivraison = request.getParameter("statutLivraison");

		if (montant != 0) {
			montant = Integer.parseInt(request.getParameter("montant"));

		} else {
			montant = 0;
		}

		Client client = new Client(nom, prenom, adresseLivraison, tel, email);
		// lien entre constructeur et les parametres html
//  Je cree un objet DAO et jappelle la methode de la class Dao 
		ClientDao clientdao = new ClientDao();
		//ca enregistre dans le fichier client indique dans le path sur ClientDao
		
		
		clientdao.saveClient(client);
	//je stock le nouveau client
		Client client1 = clientdao.getClient();

		request.setAttribute("clientJSP", client1);
		Commande commande = new Commande(date, montant, modepaiement, statutPaiement, modeLivraison, statutLivraison);

		CommandeDao commandedao = new CommandeDao();
		
		commandedao.saveCommande(commande);
		Commande commande1=commandedao.getCommande();
	
		request.setAttribute("commandeJSP", commande1);

		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/client.jsp").forward(request, response);

	}

}
