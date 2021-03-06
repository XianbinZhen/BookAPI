package dev.zhen.daos;

import dev.zhen.entities.Client;

import java.util.Set;

public interface ClientDAO {

    Client createClient(Client client);
    Set<Client> getAllClient();
    Client getClientById(int id);
    Client updateClientById(int id, Client client);
    boolean deleteClientById(int id);

}
