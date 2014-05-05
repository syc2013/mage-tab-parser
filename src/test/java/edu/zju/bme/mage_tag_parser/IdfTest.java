package edu.zju.bme.mage_tag_parser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

public class IdfTest {

	public IdfTest() {
		super();
	}

	@Test
	public void testParse() throws IOException {
		MAGEParse mp = new MAGEParse();
		mp.getContent("https://www.ebi.ac.uk/arrayexpress/files/E-MTAB-1882/E-MTAB-1882.idf.txt");
		System.out.println(mp.getMapIdf().keySet().size());
		//assertEquals(null, mp.getIdf());
		assertEquals(1, mp.getMapIdf().size());
	}
	
	@Test
	public void testGetMap() throws IOException {
		MAGEParse mp = new MAGEParse();
		mp.getContent("https://www.ebi.ac.uk/arrayexpress/files/E-MTAB-1742/E-MTAB-1742.idf.txt");
		
		for(Idf idf:mp.getMapIdf().keySet()){
			HashMap<String, String> test=idf.getIdf();
			System.out.println(test.size());
			assertEquals(27,test.size());
		}
		//assertEquals(27);
	}
}
