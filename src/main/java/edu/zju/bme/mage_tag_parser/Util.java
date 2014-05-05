/**
 * 
 */
package edu.zju.bme.mage_tag_parser;

/**
 * @author syc
 * 
 */
public class Util {

	public boolean isComment(String str){
		
		return true;
	}
	
	public boolean isTag(String str) {
		switch (str) {
		case "Investigation Title":
		case "Experimental Design":
		case "Experimental Design Term Source REF":
		case "Experimental Design Term Accession Number":
		case "Experimental Factor Name":
		case "Experimental Factor Type":
		case "Experimental Factor Term Source REF":
		case "Experimental Factor Term Accession Number":
		case "Person Last Name":
		case "Person First Name":
		case "Person Mid Initials":
		case "Person Email":
		case "Person Phone":
		case "Person Fax":
		case "Person Address":
		case "Person Affiliation":
		case "Person Roles":
		case "Person Roles Term Source REF":
		case "Person Roles Term Accession Number":
		case "Quality Control Type":
		case "Quality Control Term Source REF":
		case "Quality Control Term Accession Number":
		case "Replicate Type":
		case "Replicate Term Source REF":
		case "Replicate Term Accession Number":
		case "Normalization Type":
		case "Normalization Term Source REF":
		case "Normalization Term Accession Number":
		case "Date of Experiment":
		case "Public Release Date":
		case "PubMed ID":
		case "Publication DOI":
		case "Publication Author List":
		case "Publication Title":
		case "Publication Status":
		case "Publication Status Term Source REF":
		case "Publication Status Term Accession Number":
		case "Experiment Description":
		case "Protocol Name":
		case "Protocol Type":
		case "Protocol Description":
		case "Protocol Parameters":
		case "Protocol Hardware":
		case "Protocol Software":
		case "Protocol Contact":
		case "Protocol Term Source REF":
		case "Protocol Term Accession Number":
		case "SDRF File":
		case "Term Source Name":
		case "Term Source File":
		case "Term Source Version":
			return true;
		default:
			return false;
		}
	}
}
