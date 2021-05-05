import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by: Daniel Williams on 3/1/2019, Cell: 201.937.5556, Email: williams.dan@husky.neu.edu
 *
 * This program takes a series of servers as an input and randomly selects one to be
 * assigned to a given job based on it's weight.
 *
 */
public class BalanceServers {
  /**
   * @param args Individual servers represented by their Name, a colon, and it's Size.
   * @throws Exception in the case that a server is entered incorrectly.
   */
  public static void main(String[] args) throws Exception {

    HashMap<Character, Integer> serverMap = new HashMap<>();
    List<Character> servers = new ArrayList<>();

    for (String arg : args) {
      Character serverName = arg.charAt(0);
      Integer size = Integer.parseInt(String.valueOf(arg.charAt(2)));
      if ((serverName >= 'A') &&
          (serverName <= 'Z') &&
          (arg.charAt(1) == ':') &&
          (size >= 0) &&
          (size <= 9)) {
        serverMap.put(serverName, size);
        for (int i = 0; i < size; i++) {
          servers.add(serverName);
        }
      } else {
        throw new Exception("Error: Invalid Server Name Provided");
      }
    }

    Random rand = new Random();
    Character chosen = servers.get(rand.nextInt(servers.size()));
    System.out.println(chosen + ":" + serverMap.get(chosen));
  }
}


