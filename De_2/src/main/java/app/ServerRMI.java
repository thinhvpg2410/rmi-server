package app;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import jakarta.persistence.EntityManager;
import services.EntityManagerFactoryUtil;

public class ServerRMI {
	public static void main(String[] args) throws RemoteException {
		Registry registry = LocateRegistry.createRegistry(9999);
		
		EntityManagerFactoryUtil entityManagerFactoryUtil = new EntityManagerFactoryUtil();
		EntityManager entityManager = entityManagerFactoryUtil.getEntityManager();
		
		
		
	}
}
