package spittr.data;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.Spittle;

@Component
public class SpittlerRepositoryImple implements SpittlerRepository
{

	public List<Spittle> findSpittles(long max, int count)
	{
		// TODO Auto-generated method stub
		List<Spittle> list = new LinkedList<Spittle>();
		for(int i = 1; i <= count; i++)
			list.add(new Spittle("Spittle " + i, new Date()));
		
		return list;
	}

}
