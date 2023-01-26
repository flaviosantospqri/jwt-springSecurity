package flavio.flaviospringsecurityjwt.service;

import flavio.flaviospringsecurityjwt.model.User;
import flavio.flaviospringsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();
        //Cryptographic a senha antes de salvar no banco
        user.setPassword(encoder.encode(pass));

        userRepository.save(user);
    }
}
