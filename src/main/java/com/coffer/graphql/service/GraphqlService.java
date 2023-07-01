package com.coffer.graphql.service;

import java.util.List;

import com.coffer.graphql.Response.GraphqlResponse;
import com.coffer.graphql.Response.Response;

public interface GraphqlService {

	List<GraphqlResponse> findAll();

	List<Response>  getCountryDetails(int year, int intensity);

}
