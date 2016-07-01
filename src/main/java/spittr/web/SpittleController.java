package spittr.web;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spittle;
import spittr.data.SpittlerRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController
{
	private SpittlerRepository spittlerRepository;

	@Autowired
	public SpittleController(SpittlerRepository spittlerRepository)
	{
	
		this.spittlerRepository = spittlerRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Map<String, List<Spittle>> model)
	{
		model.put("spittleList", spittlerRepository.findSpittles(Long.MAX_VALUE, 20));
		
		return "spittles";
	}
	
}
