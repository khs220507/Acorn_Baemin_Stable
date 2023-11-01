package com.acorn.baemin.store;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acorn.baemin.domain.StoreDTO;
@Controller
public class StoreController {

	@Autowired
	StoreRepository rep;
	
	
	

	@GetMapping("/sellerOne")
	public String selectAll( Model model) {
		StoreDTO result  = rep.select("testid");
		model.addAttribute("test", result);
		System.out.println( result);
		return "sellerOne";
		}
	
	@GetMapping("/sellerAll")
	public String  main(Model model ) {		
		List<StoreDTO> result;
		try {
			result = rep.selectAll();
			
			model.addAttribute("list", result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sellerAll";
	}

}
