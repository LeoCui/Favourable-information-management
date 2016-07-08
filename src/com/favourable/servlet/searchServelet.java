package com.favourable.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.nio.cs.ext.ISO_8859_11;

import com.favourable.domain.Item;
import com.favourable.domain.Market;
import com.favourable.service.ShowItemService;
import com.favourable.service.ShowMarketService;

public class searchServelet extends HttpServlet {
	public static String category1="超市";
	public static String category2="商品";
	/**
	 * Constructor of the object.
	 */
	public searchServelet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String category=request.getParameter("category");
		category=new String(category.getBytes("ISO-8859-1"),"utf-8");  //fuck,中文乱码
		System.out.print(category);
		String name=request.getParameter("name");
		name=new String(name.getBytes("ISO-8859-1"),"utf-8");
        System.out.print(name);
		if(category1.equals(category)){    //超市
			ShowMarketService showMarket=new ShowMarketService();
			ArrayList<Market> markets=new ArrayList<Market>();
			markets=(ArrayList<Market>) showMarket.showMarketByMarketName(name);
			System.out.print(name);
			//HttpSession session=request.getSession();
			//session.setAttribute("items",items);
			System.out.print(markets.get(0).getMarketName());
			request.setAttribute("markets",markets);
			request.getRequestDispatcher("marketShow.jsp").forward(request,response);
		}
		else{
			ShowItemService showItem=new ShowItemService();
			ArrayList<Item> items=new ArrayList<Item>();
			items=(ArrayList<Item>) showItem.showItemByItemName(name);
			System.out.print(name);
			HttpSession session=request.getSession();
			//session.setAttribute("items",items);
			System.out.print(items.get(0).getItemName());
			request.setAttribute("items",items);
			request.getRequestDispatcher("searchItemShow.jsp").forward(request,response);
		}
		//response.setContentType("text/html");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
