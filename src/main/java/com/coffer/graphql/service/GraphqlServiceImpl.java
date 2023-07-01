package com.coffer.graphql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffer.graphql.Response.GraphqlResponse;
import com.coffer.graphql.Response.Response;
import com.coffer.graphql.entity.Visualistation;
import com.coffer.graphql.repository.GraphQLRepository;

@Service
public class GraphqlServiceImpl implements GraphqlService {
	
	@Autowired
	public GraphQLRepository repo;

	@Override
	public List<GraphqlResponse> findAll() {
		List<GraphqlResponse> respose = new ArrayList<>();
		List<Visualistation> findAll = repo.findAll();
		for(Visualistation v: findAll)
		{
			GraphqlResponse graphqlResponse = new GraphqlResponse();
		BeanUtils.copyProperties(v,graphqlResponse);
		respose.add(graphqlResponse);
		}
		
		
		return respose;
	}

	@Override
	public List<Response> getCountryDetails(int year, int intensity) {
		
		
		if(year!=0 && intensity!=0)
		{
		List<Response> countryinfo=	repo.findByendYearAndIntensity(year,intensity);
		 //**********************
		
		
		
		
		/*countryinfo.stream().collect(Collectors.toMap(
        		GraphqlResponse::getCountry,
                Function.identity(), 
                (existing, replacement) -> existing 
        ))
        .values()
        .stream()
        .toList();
		*/
		//******
		
			return	countryinfo;
		}
		return null;
	}
	
	

}
