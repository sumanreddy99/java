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
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author pradeep
 *
 */
/*
 * public class HelloController implements Controller {
 * 
 * @Override public ModelAndView handleRequest(HttpServletRequest request,
 * HttpServletResponse response) throws Exception { // TODO Auto-generated
 * method stub
 * 
 * String name=request.getParameter("name"); Map m=new HashMap(); m.put("msg",
 * "Hello " + name);
 * 
 * ModelAndView mav=new ModelAndView("success", m); return mav; }
 * 
 * }
 */

/*
 * public class HelloController extends AbstractController {
 * 
 * @Override public ModelAndView handleRequestInternal(HttpServletRequest
 * request, HttpServletResponse response) throws Exception { // TODO
 * Auto-generated method stub
 * 
 * String name=request.getParameter("name"); Map m=new HashMap(); m.put("msg",
 * "Hello " + name);
 * 
 * ModelAndView mav=new ModelAndView("success", m); return mav; }
 * 
 * }
 */
public class HelloController extends ParameterizableViewController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello " + name);
		
		ModelAndView mav=new ModelAndView(getViewName(), m);
		System.out.println("view name"+getViewName());
		return mav;
	}

}

