package andre.Api.Rest.Railway.service;

import andre.Api.Rest.Railway.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
