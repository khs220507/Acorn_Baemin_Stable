package com.acorn.baemin.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acorn.baemin.cart.service.CartService;
import com.acorn.baemin.domain.CartDTO;
import com.acorn.baemin.domain.OrderDTO;
import com.acorn.baemin.domain.ZzimDTO;

import com.acorn.baemin.home.repository.OrderRepository;
import com.acorn.baemin.home.repository.ZzimRepository;


@Controller
public class HomeController {
	
	@Autowired
	ZzimRepository zzimDAO;
	
	@Autowired
	OrderRepository orderDAO;

	
	
	// 홈화면
	@GetMapping("/home")
	public String home() {
		return "home/home";
	}
  
	// 찜
	@GetMapping("/zzim")
	public String zzimList(Model model) {
		List<ZzimDTO> result;
		try {
			result = zzimDAO.zzimSelectAll(10001);
			model.addAttribute("zzimList", result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home/zzim_list";
	}
	
	// 주문내역
	@GetMapping("/orderList")
	public String orderList(Model model) {
		List<OrderDTO> result;
		
		try {
			result = orderDAO.orderSelectAll(10001);
			System.out.println(result);
			model.addAttribute("orderList", result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home/order_list";
	}
}
