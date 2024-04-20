package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import dao.AlbumDAO;

public class Client {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, ClassNotFoundException {
		// Way 1: Getting the registry
//		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9999);
//		CourseDAO courseDAO = (CourseDAO) registry.lookup("courseDAO");
//		StudentDAO studentDAO = (StudentDAO) registry.lookup("studentDAO");
//		DepartmentDAO departmentDAO = (DepartmentDAO) registry.lookup("departmentDAO");
//		AlbumDAO albumDAO = (AlbumDAO) registry.lookup("albumDao");
		
		// Way 2
		String URL = "rmi://127.0.0.1:9999/";
		AlbumDAO albumDAO = (AlbumDAO)Naming.lookup(URL+"albumDao");
//		albumDAO.updatePriceOfAlbum(URL, 0);
		albumDAO.listAlbumByGenre("").forEach(x -> System.out.println(x));

	}

}
