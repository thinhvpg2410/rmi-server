package app;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import dao.AlbumDAO;
import jakarta.persistence.EntityManager;
import services.AlbumService;
import services.EntityManagerFactoryUtil;

public class ServerRMI {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		Registry registry = LocateRegistry.createRegistry(9999); //init Port
		
		EntityManagerFactoryUtil entityManagerFactoryUtil = new EntityManagerFactoryUtil();
		EntityManager entityManager = entityManagerFactoryUtil.getEntityManager();
		
		AlbumDAO albumDAO = new AlbumService(entityManager);
		
		registry.bind("albumDao",albumDAO);
		System.out.printf("RMI SERVER READY AT: ", LocateRegistry.getRegistry());
		
	}
}
