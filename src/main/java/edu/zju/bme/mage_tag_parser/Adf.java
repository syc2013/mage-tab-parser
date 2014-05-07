/**
 * 
 */
package edu.zju.bme.mage_tag_parser;

import java.util.HashMap;

/**
 * @author syc
 * 
 */
public class Adf {

	public String array_design_name;
	public String version;
	public String provider;
	public String printing_protocol;
	public String technology_type;
	public String technology_type_term_source_ref;
	public String technology_type_term_accession_number;
	public String surface_type;
	public String surface_type_term_source_ref;
	public String surface_type_term_accession_number;
	public String substrate_type;
	public String substrate_type_term_source_ref;
	public String substrate_type_term_accession_number;
	public String sequence_polymer_type;
	public String sequence_polymer_type_term_source_ref;
	public String sequence_polymer_type_term_accession_number;
	public String term_source_name;
	public String term_source_file;
	public String term_source_version;
	public String comment;

	private HashMap<String, String> adf = new HashMap<String, String>();

	public HashMap<String, String> getAdf() {
		adf.put("array_design_name", array_design_name);
		adf.put("comment", comment);
		adf.put("printing_protocol", printing_protocol);
		adf.put("provider", provider);
		adf.put("sequence_polymer_type", sequence_polymer_type);
		adf.put("sequence_polymer_type_term_accession_number",
				sequence_polymer_type_term_accession_number);
		adf.put("sequence_polymer_type_term_source_ref",
				sequence_polymer_type_term_source_ref);
		adf.put("substrate_type", substrate_type);
		adf.put("substrate_type_term_accession_number",
				substrate_type_term_accession_number);
		adf.put("substrate_type_term_source_ref", substrate_type_term_source_ref);
		adf.put("surface_type", surface_type);
		adf.put("surface_type_term_accession_number",
				surface_type_term_accession_number);
		adf.put("surface_type_term_source_ref", surface_type_term_source_ref);
		adf.put("technology_type", technology_type);
		adf.put("technology_type_term_accession_number",
				technology_type_term_accession_number);
		adf.put("technology_type_term_source_ref",
				technology_type_term_source_ref);
		adf.put("term_source_file", term_source_file);
		adf.put("term_source_name", term_source_name);
		adf.put("term_source_version", term_source_version);
		adf.put("version", version);
		return adf;
	}

	public void getData(HashMap<String, String> hm) {
		for (String tag : hm.keySet()) {
			if (tag.equals("Array Design Name")) {
				array_design_name = hm.get(tag);
			}
			if (tag.equals("Version")) {
				version = hm.get(tag);
			}
			if (tag.equals("Provider")) {
				provider = hm.get(tag);
			}
			if (tag.equals("Printing Protocol")) {
				printing_protocol = hm.get(tag);
			}
			if (tag.equals("Technology Type")) {
				technology_type = hm.get(tag);
			}
			if (tag.equals("Technology Type Term Source REF")) {
				technology_type_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Technology Type Term Accession Number")) {
				technology_type_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Surface Type")) {
				surface_type = hm.get(tag);
			}
			if (tag.equals("Surface Type Term Source REF")) {
				surface_type_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Surface Type Term Accession Number")) {
				surface_type_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Substrate Type")) {
				substrate_type = hm.get(tag);
			}
			if (tag.equals("Substrate Type Term Source REF")) {
				substrate_type_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Substrate Type Term Accession Number")) {
				substrate_type_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Sequence Polymer Type")) {
				sequence_polymer_type = hm.get(tag);
			}
			if (tag.equals("Sequence Polymer Type Term Source REF")) {
				sequence_polymer_type_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Sequence Type Term Accession Number")) {
				sequence_polymer_type_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Term Source Name")) {
				term_source_name = hm.get(tag);
			}
			if (tag.equals("Term Source File")) {
				term_source_file = hm.get(tag);
			}
			if (tag.equals("Term Source Version")) {
				term_source_version = hm.get(tag);
			}
			if (tag.equals("Comment")) {
				comment = hm.get(tag);
			}
		}
	}
}