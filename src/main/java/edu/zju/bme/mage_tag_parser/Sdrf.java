/**
 * 
 */
package edu.zju.bme.mage_tag_parser;

import java.util.HashMap;

/**
 * @author syc
 * 
 */
public class Sdrf {

	public String source_name;
	public String sample_name;
	public String extract_name;
	public String labeled_extract_name;
	public String assay_name;
	public String scan_name;
	public String normalization_name;
	public String array_data_file;
	public String derived_array_data_file;
	public String array_data_matrix_file;
	public String derived_array_data_matrix_file;
	public String image_file;
	public String array_design_ref;
	public String protocol_ref;
	public String characteristics;
	public String provider;
	public String material_type;
	public String label;
	public String technology_type;
	public String factor_value;
	public String performer;
	public String date;
	public String parameter_value;
	public String unit;
	public String description;
	public String term_accession_number;
	public String term_source_ref;
	public String comment;

	private HashMap<String, String> sdrf = new HashMap<String, String>();

	public HashMap<String, String> getSdrf() {
		sdrf.put("array_data_file", array_data_file);
		sdrf.put("array_data_matrix_file", array_data_matrix_file);
		sdrf.put("array_design_ref", array_design_ref);
		sdrf.put("assay_name", assay_name);
		sdrf.put("characteristics", characteristics);
		sdrf.put("comment", comment);
		sdrf.put("date", date);
		sdrf.put("derived_array_data_matrix_file",
				derived_array_data_matrix_file);
		sdrf.put("derived_array_data_file", derived_array_data_file);
		sdrf.put("description", description);
		sdrf.put("extract_name", extract_name);
		sdrf.put("image_file", image_file);
		sdrf.put("label", label);
		sdrf.put("labeled_extract_name", labeled_extract_name);
		sdrf.put("material_type", material_type);
		sdrf.put("normalization_name", normalization_name);
		sdrf.put("parameter_value", parameter_value);
		sdrf.put("performer", performer);
		sdrf.put("protocol_ref", protocol_ref);
		sdrf.put("provider", provider);
		sdrf.put("sample_name", sample_name);
		sdrf.put("scan_name", scan_name);
		sdrf.put("source_name", source_name);
		sdrf.put("technology_type", technology_type);
		sdrf.put("term_accession_number", term_accession_number);
		sdrf.put("unit", unit);
		sdrf.put("factor_value", factor_value);
		sdrf.put("term_source_ref", term_source_ref);
		return sdrf;
	}

	public void getData(HashMap<String, String> hm) {
		for (String tag : hm.keySet()) {
			if (tag.equals("Array Data File")) {
				array_data_file = hm.get(tag);
			}
			if (tag.equals("Source Name")) {
				source_name = hm.get(tag);
			}
			if (tag.equals("Sample Name")) {
				sample_name = hm.get(tag);
			}
			if (tag.equals("Extract Name")) {
				extract_name = hm.get(tag);
			}
			if (tag.equals("Labeled Extract Name")) {
				labeled_extract_name = hm.get(tag);
			}
			if (tag.equals("Assay Name")) {
				assay_name = hm.get(tag);
			}
			if (tag.equals("Scan Name")) {
				scan_name = hm.get(tag);
			}
			if (tag.equals("Normalization Name")) {
				normalization_name = hm.get(tag);
			}
			if (tag.equals("Derived Array Data File")) {
				derived_array_data_file = hm.get(tag);
			}
			if (tag.equals("Array Data Matrix File")) {
				array_data_matrix_file = hm.get(tag);
			}
			if (tag.equals("Derived Array Data Matrix File")) {
				derived_array_data_matrix_file = hm.get(tag);
			}
			if (tag.equals("Image File")) {
				image_file = hm.get(tag);
			}
			if (tag.equals("Array Design REF")) {
				array_design_ref = hm.get(tag);
			}
			if (tag.equals("Protocol REF")) {
				protocol_ref = hm.get(tag);
			}
			if (tag.equals("Characteristics")) {
				characteristics = hm.get(tag);
			}
			if (tag.equals("Provider")) {
				provider = hm.get(tag);
			}
			if (tag.equals("Material Type")) {
				material_type = hm.get(tag);
			}
			if (tag.equals("Label")) {
				label = hm.get(tag);
			}
			if (tag.equals("Technology Type")) {
				technology_type = hm.get(tag);
			}
			if (tag.equals("Factor Value")) {
				factor_value = hm.get(tag);
			}
			if (tag.equals("Performer")) {
				performer = hm.get(tag);
			}
			if (tag.equals("Date")) {
				date = hm.get(tag);
			}
			if (tag.equals("Parameter Value")) {
				parameter_value = hm.get(tag);
			}
			if (tag.equals("Unit")) {
				unit = hm.get(tag);
			}
			if (tag.equals("Description")) {
				description = hm.get(tag);
			}
			if (tag.equals("Term Source REF")) {
				term_source_ref = hm.get(tag);
			}
			if (tag.equals("Term Accession Number")) {
				term_accession_number = hm.get(tag);
			}
			if (tag.equals("Comment")) {
				comment = hm.get(tag);
			}
		}
	}
}
