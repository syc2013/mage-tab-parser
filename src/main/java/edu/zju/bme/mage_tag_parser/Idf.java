package edu.zju.bme.mage_tag_parser;

import java.util.HashMap;

public class Idf {

	public String investigation_title;
	public String experimental_design;
	public String experimental_design_term_source_ref;
	public String experimental_design_term_accession_number;
	public String experimental_factor_name;
	public String experimental_factor_type;
	public String experimental_factor_term_source_ref;
	public String experimental_factor_term_accession_number;
	public String person_last_name;
	public String person_first_name;
	public String person_mid_initials;
	public String person_email;
	public String person_phone;
	public String person_fax;
	public String person_address;
	public String person_affiliation;
	public String person_roles;
	public String person_roles_term_source_ref;
	public String person_roles_term_accession_number;
	public String quality_control_type;
	public String quality_control_term_source_ref;
	public String quality_control_term_accession_number;
	public String replicate_type;
	public String replicate_term_source_ref;
	public String replicate_term_accession_number;
	public String normalization_type;
	public String normalization_term_source_ref;
	public String normalization_term_accession_number;
	public String date_of_experiment;
	public String public_release_date;
	public String pubmed_id;
	public String publication_DOI;
	public String publication_author_list;
	public String publication_title;
	public String publication_status;
	public String publication_status_term_source_ref;
	public String publication_status_term_accession_number;
	public String experiment_description;
	public String protocol_name;
	public String protocol_type;
	public String protocol_description;
	public String protocol_parameters;
	public String protocol_hardware;
	public String protocol_software;
	public String protocol_contact;
	public String protocol_term_source_ref;
	public String protocol_term_accession_number;
	public String SDRF_file;
	public String term_source_name;
	public String term_source_file;
	public String term_source_version;
	public String comment;
	private HashMap<String, String> idf = new HashMap<String, String>();

	public HashMap<String, String> getIdf() {
		idf.put("comment", comment);
		idf.put("date_of_experiment", date_of_experiment);
		idf.put("experiment_description", experiment_description);
		idf.put("experimental_design", experimental_design);
		idf.put("experimental_design_term_accession_number",
				experimental_design_term_accession_number);
		idf.put("experimental_design_term_source_ref",
				experimental_design_term_source_ref);
		idf.put("experimental_factor_name", experimental_factor_name);
		idf.put("experimental_factor_term_accession_number",
				experimental_factor_term_accession_number);
		idf.put("experimental_factor_term_source_ref",
				experimental_factor_term_source_ref);
		idf.put("experimental_factor_type", experimental_factor_type);
		idf.put("investigation_title", investigation_title);
		idf.put("normalization_term_accession_number",
				normalization_term_accession_number);
		idf.put("normalization_term_source_ref", normalization_term_source_ref);
		idf.put("normalization_type", normalization_type);
		idf.put("person_address", person_address);
		idf.put("person_affiliation", person_affiliation);
		idf.put("person_email", person_email);
		idf.put("person_fax", person_fax);
		idf.put("person_first_name", person_first_name);
		idf.put("person_last_name", person_last_name);
		idf.put("person_mid_initials", person_mid_initials);
		idf.put("person_phone", person_phone);
		idf.put("person_roles", person_roles);
		idf.put("person_roles_term_accession_number",
				person_roles_term_accession_number);
		idf.put("person_roles_term_source_ref", person_roles_term_source_ref);
		idf.put("protocol_contact", protocol_contact);
		idf.put("protocol_description", protocol_description);
		idf.put("protocol_hardware", protocol_hardware);
		idf.put("protocol_name", protocol_name);
		idf.put("protocol_parameters", protocol_parameters);
		idf.put("protocol_software", protocol_software);
		idf.put("protocol_term_accession_number",
				protocol_term_accession_number);
		idf.put("protocol_term_source_ref", protocol_term_source_ref);
		idf.put("protocol_type", protocol_type);
		idf.put("public_release_date", public_release_date);
		idf.put("publication_DOI", publication_DOI);
		idf.put("publication_status", publication_status);
		idf.put("publication_author_list", publication_author_list);
		idf.put("publication_status_term_accession_number",
				publication_status_term_accession_number);
		idf.put("publication_status_term_source_ref",
				publication_status_term_source_ref);
		idf.put("publication_title", publication_title);
		idf.put("quality_control_term_accession_number",
				quality_control_term_accession_number);
		idf.put("quality_control_term_source_ref",
				quality_control_term_source_ref);
		idf.put("quality_control_type", quality_control_type);
		idf.put("replicate_term_accession_number",
				replicate_term_accession_number);
		idf.put("replicate_term_source_ref", replicate_term_source_ref);
		idf.put("replicate_type", replicate_type);
		idf.put("term_source_file", term_source_file);
		idf.put("term_source_name", term_source_name);
		idf.put("term_source_version", term_source_version);
		idf.put("SDRF_file", SDRF_file);
		return idf;
	}

	public void getData(HashMap<String, String> hm) {
		for (String tag : hm.keySet()) {
			if (tag.equals("Comment")) {
				comment = hm.get(tag);
			}
			if (tag.equals("Investigation Title")) {
				investigation_title = hm.get(tag);
			}
			if (tag.equals("Date of Experiment")) {
				date_of_experiment = hm.get(tag);
			}
			if (tag.equals("SDRF File")) {
				SDRF_file = hm.get(tag);
			}
			if (tag.equals("Experiment Description")) {
				experiment_description = hm.get(tag);
			}
			if (tag.equals("Experimental Design")) {
				experimental_design = hm.get(tag);
			}
			if (tag.equals("Experimental Design Term Accession Number")) {
				experimental_design_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Experimental Design Term Source REF")) {
				experimental_design_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Experimental Factor Name")) {
				experimental_factor_name = hm.get(tag);
			}
			if (tag.equals("Experimental Factor Term Accession Number")) {
				experimental_factor_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Experimental Factor Term Source REF")) {
				experimental_factor_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Experimental Factor Type")) {
				experimental_factor_type = hm.get(tag);
			}
			if (tag.equals("Normalization Term Accession Number")) {
				normalization_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Normalization Term Source REF")) {
				normalization_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Normalization Type")) {
				normalization_type = hm.get(tag);
			}
			if (tag.equals("Person Address")) {
				person_address = hm.get(tag);
			}
			if (tag.equals("Person Affiliation")) {
				person_affiliation = hm.get(tag);
			}
			if (tag.equals("Person Email")) {
				person_email = hm.get(tag);
			}
			if (tag.equals("Person Fax")) {
				person_fax = hm.get(tag);
			}
			if (tag.equals("Person First Name")) {
				person_first_name = hm.get(tag);
			}
			if (tag.equals("Person Last Name")) {
				person_last_name = hm.get(tag);
			}
			if (tag.equals("Person Mid Initials")) {
				person_mid_initials = hm.get(tag);
			}
			if (tag.equals("Person Phone")) {
				person_phone = hm.get(tag);
			}
			if (tag.equals("Person Roles")) {
				person_roles = hm.get(tag);
			}
			if (tag.equals("Person Roles Term Accession Number")) {
				person_roles_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Person Roles Term Source REF")) {
				person_roles_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Protocol Contact")) {
				protocol_contact = hm.get(tag);
			}
			if (tag.equals("Potocol Description")) {
				protocol_description = hm.get(tag);
			}
			if (tag.equals("Protocol Hardware")) {
				protocol_hardware = hm.get(tag);
			}
			if (tag.equals("Protocol Name")) {
				protocol_name = hm.get(tag);
			}
			if (tag.equals("Protocol Parameters")) {
				protocol_parameters = hm.get(tag);
			}
			if (tag.equals("Protocol Software")) {
				protocol_software = hm.get(tag);
			}
			if (tag.equals("Protocol Term Accession Number")) {
				protocol_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Protocol Term Source REF")) {
				protocol_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Protocol Type")) {
				protocol_type = hm.get(tag);
			}
			if (tag.equals("Public Release Date")) {
				public_release_date = hm.get(tag);
			}
			if (tag.equals("Publication DOI")) {
				publication_DOI = hm.get(tag);
			}
			if (tag.equals("Publication Author List")) {
				publication_author_list = hm.get(tag);
			}
			if (tag.equals("Publication Status")) {
				publication_status = hm.get(tag);
			}
			if (tag.equals("Publication Status Term Accession Number")) {
				publication_status_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Publication Status Term Source REF")) {
				publication_status_term_source_ref = hm.get(tag);
			}
			if (tag.equals(publication_title)) {
				publication_title = hm.get(tag);
			}
			if (tag.equals("Pubmed ID")) {
				pubmed_id = hm.get(tag);
			}
			if (tag.equals("Quality Control Term Accession Number")) {
				quality_control_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Quality Control Term Source REF")) {
				quality_control_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Quality Control Type")) {
				quality_control_type = hm.get(tag);
			}
			if (tag.equals("Replicate Term Accession Number")) {
				replicate_term_accession_number = hm.get(tag);
			}
			if (tag.equals("Replicate Term Source REF")) {
				replicate_term_source_ref = hm.get(tag);
			}
			if (tag.equals("Replicate Type")) {
				replicate_type = hm.get(tag);
			}
			if (tag.equals("Term Source File")) {
				term_source_file = hm.get(tag);
			}
			if (tag.equals("Term Source Version")) {
				term_source_version = hm.get(tag);
			}
		}
	}
}
