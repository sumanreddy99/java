/**
 * 
 */
package com.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author pradeep
 *
 */
public class HelloController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello " + name);
		
		ModelAndView mav=new ModelAndView("success", m);
		return mav;
	}

}
