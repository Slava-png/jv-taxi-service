package taxi.service.impl;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> user = driverDao.findByLogin(login);

        if (user.isEmpty()) {
            logger.debug("Can't find user with login " + login);
            throw new AuthenticationException("Can't find user with login " + login);
        }

        Driver driver = user.get();
        if (driver.getPassword().equals(password)) {
            return driver;
        }
        logger.debug("Password is incorrect, for user with login " + login);
        throw new AuthenticationException("Password is incorrect, for user with login " + login);
    }
}
