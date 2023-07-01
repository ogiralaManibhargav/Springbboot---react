package com.coffer.graphql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffer.graphql.Response.Response;
import com.coffer.graphql.entity.Visualistation;
 @Repository
public interface GraphQLRepository extends JpaRepository<Visualistation, Long>{
	 
	 @Query("select new com.coffer.graphql.Response.Response(country, region,  topic,  city) from  Visualistation where endYear=:year "
	 		+ "and intensity=:intensity")
	 List<Response>  findByendYearAndIntensity(int year, int intensity);
	 
  

}
