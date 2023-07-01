package com.coffer.graphql.controller;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffer.graphql.Response.GraphqlResponse;
import com.coffer.graphql.Response.Response;
import com.coffer.graphql.service.GraphqlService;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/v1/graphql")
public class GraphqlController {
	
	@Autowired
	private GraphqlService graphqlService;
	

	
	@GetMapping("/test")
	public String test()
	{
		return "Hello";
	}
	
	@GetMapping("/findAll")
	public List<GraphqlResponse> findAll()
	{
		System.out.println("Method called");
		List<GraphqlResponse> uniqueByName = graphqlService.findAll().stream()
                .collect(Collectors.toMap(
                		GraphqlResponse::getEndYear,
                        Function.identity(), 
                        (existing, replacement) -> existing 
                ))
                .values()
                .stream()
                .toList();
		//return uniqueByName;
		return uniqueByName;
	}
	
	@GetMapping("/findAll/likelihood")
	public List<GraphqlResponse> findAllLikelihood()
	{
		System.out.println("Method called");
		List<GraphqlResponse> uniqueByName = graphqlService.findAll().stream()
                .collect(Collectors.toMap(
                		GraphqlResponse::getLikelihood,
                        Function.identity(), 
                        (existing, replacement) -> existing 
                ))
                .values()
                .stream()
                .toList();
		//return uniqueByName;
		return uniqueByName;
	}
	
	@GetMapping("/findAll/releavance")
	public List<GraphqlResponse> findAllReleavance()
	{
		System.out.println("Method called");
		List<GraphqlResponse> uniqueByName = graphqlService.findAll().stream()
                .collect(Collectors.toMap(
                		GraphqlResponse::getRelevance,
                        Function.identity(), 
                        (existing, replacement) -> existing 
                ))
                .values()
                .stream()
                .toList();
		//return uniqueByName;
		return uniqueByName;
	}
	
	@GetMapping("/country")
    public List<Response>  getCountryInfo(@RequestParam("x") int year, @RequestParam("y") int intensity) {
		return	graphqlService.getCountryDetails(year,intensity);
		
	}
       
/*List<GraphqlResponse> respose = new ArrayList<>();
		List<Visualistation> findAll = repo.findAll();
		for(Visualistation v: findAll)
		{
			GraphqlResponse graphqlResponse = new GraphqlResponse();
		BeanUtils.copyProperties(v,graphqlResponse);
		respose.add(graphqlResponse);
		}
		
		
		return respose;*/
}
