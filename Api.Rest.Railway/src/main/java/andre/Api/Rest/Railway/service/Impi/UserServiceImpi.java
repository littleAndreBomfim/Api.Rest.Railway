package andre.Api.Rest.Railway.service.Impi;

import andre.Api.Rest.Railway.domain.model.User;
import andre.Api.Rest.Railway.domain.repository.UserRepository;
import andre.Api.Rest.Railway.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpi implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Essa conta já existe.");
        }
        return userRepository.save(userToCreate);
    }
}
