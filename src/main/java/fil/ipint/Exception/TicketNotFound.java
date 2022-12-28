package fil.ipint.Exception;

public class TicketNotFound extends Exception{
    public TicketNotFound(Long id){
        super("No ticket found with id" +id);
    }
}
