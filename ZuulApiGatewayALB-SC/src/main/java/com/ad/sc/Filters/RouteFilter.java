package com.ad.sc.Filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter
{
	@Override
	public String filterType() {
		return "route";
	}
	
	@Override
	public int filterOrder() {
		return 2;
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException 
	{
		System.out.println("ROUTE Filter Triggered!");
		System.out.println("Routing Request to one of the instance of desired app.");
		return null;
	}
}
