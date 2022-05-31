import java.util.*;

public class Server {

    private String prev_state;
    private String curr_state;
    private List<User> clients;

    public Server()
    {
        prev_state="Operational";
        curr_state="Operational";
        clients=new ArrayList<>();
    }

    public List<User> getItems() {
        return clients;
    }

    public String getPrev_state() {
        return prev_state;
    }

    public String getCurr_state() {
        return curr_state;
    }

    public void add_clients(User u)
    {
        clients.add(u);
    }

    public void state_change(String n)
    {
        prev_state=curr_state;
        curr_state=n;
        notifyAllClients();
    }

    public void notifyAllClients()
    {
        for(User u: clients)
        {
            if(u.type.equals("premium"))
            {
                System.out.println("\nFOR A PREMIUM USER: ");
            }
            else if(u.type.equals("regular"))
            {
                System.out.println("\nFOR A REGULAR USER: ");
            }
            u.update();
        }
    }

}
