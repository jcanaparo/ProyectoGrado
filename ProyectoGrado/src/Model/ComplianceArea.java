package Model;

import java.util.ArrayList;

public class ComplianceArea {
	int areaid;
	String name;
	ArrayList<ComplianceDimension> compliancedimensions;
	
	public ComplianceArea()
	{
		compliancedimensions =  new ArrayList<ComplianceDimension>();
	}
}
