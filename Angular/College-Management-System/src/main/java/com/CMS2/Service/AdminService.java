package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.AdminModel;
import com.CMS2.DAO.AdminDAO;

@Service
public class AdminService {


	@Autowired
	AdminDAO ld;
	public AdminService() {
		
	}
	
	public List<AdminModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveAdmin(AdminModel ll) {
		ld.save(ll);
	}

	public AdminModel getAdminById(String email) {
		Optional<AdminModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			//System.out.println(pm.get().getName());
			return pm.get();
		}else 
		return null;
		 
	}

	/**
	 * @param ll
	 */
	public void saveAdmin1(AdminModel ll) {
		// 
		ld.save(ll);
		
	}

	public AdminDAO getLd() {
		return ld;
	}

	public void setLd(AdminDAO ld) {
		this.ld = ld;
	}

//	public StudentModel fetchUserByEmail(String email) {
//		// TODO Auto-generated method stub
//		return ld.findByEmail(email);
//	}	
//	
//	public StudentModel fetchUserByEmailAndPassword(String email,String password) {
//		// TODO Auto-generated method stub
//		return ld.findByEmailAndPassword(email,password);
//	}

}
