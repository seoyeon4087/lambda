package user;

import enums.Messenger;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {
    String addUsers();
    Messenger login(User user);
    String updatePassword(User user);
    List<?> findUsersByName(String name);
    Map<String, ?> findUsersByNameFromMap(String name);
    List<?> findUsersByJob(String job);
    Map<String, ?> findUsersByJobFromMap(String job);
    Map<String, ?> getUserMap();
}