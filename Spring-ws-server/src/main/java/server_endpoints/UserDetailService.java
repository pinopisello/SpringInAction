package server_endpoints;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService{

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		return new UserDetailsImpl(username,"kpbetsuserpwd"){
			
		};
	}

}
